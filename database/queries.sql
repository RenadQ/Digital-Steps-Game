-- Digital Steps: queries, views, procedures, functions and triggers
-- Run after schema.sql and sample_data.sql
USE Digitalstep;

-- =========================================================
-- 1. Nested queries
-- =========================================================

-- 1.1 Players who took ALL beginner lessons (relational division)
SELECT p.Fname, p.Lname
FROM Player AS p
WHERE NOT EXISTS (
    SELECT *
    FROM lesson AS l
    WHERE l.lesson_category = 'Beginner'
    AND NOT EXISTS (
        SELECT *
        FROM player_Take_lesson AS T
        WHERE T.Player_ID = p.Player_ID
        AND T.lesson_id = l.lesson_id
    )
);

-- 1.2 Players taking advanced lessons
SELECT Fname, Lname, username, country
FROM Player
WHERE Player_ID IN (
    SELECT Take.Player_ID
    FROM player_Take_lesson Take
    WHERE Take.lesson_id IN (
        SELECT l.lesson_id FROM lesson AS l WHERE l.lesson_category = 'Advanced'
    )
);

-- 1.3 Players taking intermediate lessons
SELECT Fname, Lname, username, country
FROM Player
WHERE Player_ID IN (
    SELECT Take.Player_ID
    FROM player_Take_lesson Take
    WHERE Take.lesson_id IN (
        SELECT l.lesson_id FROM lesson AS l WHERE l.lesson_category = 'intermediate'
    )
);

-- 1.4 Players taking beginner lessons
SELECT Fname, Lname, username, country
FROM Player
WHERE Player_ID IN (
    SELECT Take.Player_ID
    FROM player_Take_lesson Take
    WHERE Take.lesson_id IN (
        SELECT l.lesson_id FROM lesson AS l WHERE l.lesson_category = 'Beginner'
    )
);

-- 1.5 Which admin displays which player
SELECT A.Admin_ID, A.Fname AS Admin_Firstname, A.Lname AS Admin_Lastname,
       P.Player_ID, P.Fname AS Player_FirstName, P.Lname AS Player_LastName
FROM Administrative AS A
JOIN Administrative_Display_player AS Display ON A.Admin_ID = Display.Admin_ID
JOIN Player AS P ON Display.Player_ID = P.Player_ID;

-- =========================================================
-- 2. GROUP BY, DISTINCT and aggregate functions
-- =========================================================

SELECT City, COUNT(*) AS Admin_Count FROM Administrative GROUP BY City;
SELECT Country, COUNT(*) AS Player_Count FROM Player GROUP BY Country;
SELECT DISTINCT country FROM Player WHERE Plyer_Level IS NOT NULL;
SELECT lesson_category, COUNT(*) AS lesson_count FROM lesson GROUP BY lesson_category;

SELECT COUNT(*) AS Player_Count FROM Player;
SELECT COUNT(*) AS Question_Count FROM Question;
SELECT COUNT(*) AS Lesson_Count FROM lesson;
SELECT AVG(Player_score) AS Player_Score_Average FROM player_anwser_qustion;
SELECT SUM(Player_score) AS Player_Score_Total FROM player_anwser_qustion;

-- =========================================================
-- 3. Searching and ordering
-- =========================================================

-- Players by level and username prefix
SELECT Fname, Lname FROM Player WHERE Plyer_Level = 'intermediate' AND username LIKE 'Gha%';
SELECT Fname, Lname FROM Player WHERE Plyer_Level = 'Advanced' AND username LIKE 'sh%';

-- Players with / without an assigned level
SELECT Fname, Lname, Plyer_Level FROM Player WHERE Plyer_Level IS NOT NULL;
SELECT Fname, Lname, Plyer_Level FROM Player WHERE Plyer_Level IS NULL;

-- Players and their lessons, newest lesson first / oldest first
SELECT P.Fname, P.Lname
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id
ORDER BY L.lesson_id DESC;

SELECT P.Fname, P.Lname
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id
ORDER BY L.lesson_id ASC;

-- Lessons taken per category
SELECT P.Fname, P.Lname, L.lesson_category
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id;

SELECT P.Fname, P.Lname, L.lesson_id
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id
WHERE L.lesson_category = 'Beginner';

SELECT P.Fname, P.Lname, L.lesson_id
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id
WHERE L.lesson_category = 'Intermediate';

SELECT P.Fname, P.Lname, L.lesson_id
FROM Player P
JOIN player_Take_lesson PT ON P.Player_ID = PT.Player_ID
JOIN lesson L ON PT.lesson_id = L.lesson_id
WHERE L.lesson_category = 'Advanced';

-- Who took the first / last lesson
SELECT P.Fname, P.Lname FROM Player P
INNER JOIN player_Take_lesson PTL ON P.Player_ID = PTL.Player_ID WHERE PTL.lesson_id = 1101;
SELECT P.Fname, P.Lname FROM Player P
INNER JOIN player_Take_lesson PTL ON P.Player_ID = PTL.Player_ID WHERE PTL.lesson_id = 1150;

-- Players who have not answered the first beginner question yet
SELECT p.Player_ID, p.Username, CONCAT(p.Fname, ' ', p.Lname) AS Player_Name
FROM Player p
WHERE EXISTS (
  SELECT 1 FROM Question q
  WHERE q.question_type = 'Q1_for beginner'
    AND NOT EXISTS (
      SELECT 1 FROM player_anwser_qustion paq
      WHERE paq.Player_ID = p.Player_ID AND paq.question_id = q.question_id
    )
)
ORDER BY p.Fname ASC;

-- =========================================================
-- 4. Views
-- =========================================================

CREATE OR REPLACE VIEW Quiz_View AS
SELECT Quiz_ID, Quiz_Name, Quiz_Description, Question_Text, Quiz_Level,
       Choice_A, Choice_B, Choice_C, Choice_D, Correct_Answer
FROM Quiz;

CREATE OR REPLACE VIEW PlayerLessons AS
SELECT p.Fname, p.Lname, l.lesson_category
FROM Player p
JOIN player_Take_lesson ptl ON p.Player_ID = ptl.Player_ID
JOIN lesson l ON ptl.lesson_id = l.lesson_id;

CREATE OR REPLACE VIEW PlayerAdmin AS
SELECT p.Player_ID, p.Fname, p.Lname, a.Admin_ID, a.Fname AS Admin_Fname, a.Lname AS Admin_Lname
FROM Player p
JOIN Administrative_Display_player adp ON p.Player_ID = adp.Player_ID
JOIN Administrative a ON adp.Admin_ID = a.Admin_ID;

CREATE OR REPLACE VIEW Advanced_level_player AS
SELECT Fname, Lname, username, country FROM Player WHERE Plyer_Level = 'Advanced';

CREATE OR REPLACE VIEW intermediate_level_player AS
SELECT Fname, Lname, username, country FROM Player WHERE Plyer_Level = 'intermediate';

CREATE OR REPLACE VIEW Beginner_level_player AS
SELECT Fname, Lname, username, country FROM Player WHERE Plyer_Level = 'Beginner';

SELECT * FROM PlayerLessons;

-- =========================================================
-- 5. Stored procedures
-- =========================================================

-- Fill a temporary table showing each player's lesson level in its own column
DROP PROCEDURE IF EXISTS PopulatePlayerLessons;
DELIMITER $$
CREATE PROCEDURE PopulatePlayerLessons()
BEGIN
    SET @IntermediateLevel = 'Intermediate';
    SET @BeginnerLevel = 'Beginner';
    SET @AdvancedLevel = 'Advanced';
    DROP TABLE IF EXISTS TempPlayerLessons;
    CREATE TEMPORARY TABLE TempPlayerLessons
    SELECT p.Fname, p.Lname,
      IF(l.lesson_category = @IntermediateLevel, l.lesson_category, NULL) AS Intermediate,
      IF(l.lesson_category = @BeginnerLevel, l.lesson_category, NULL) AS Beginner,
      IF(l.lesson_category = @AdvancedLevel, l.lesson_category, NULL) AS Advanced
    FROM Player p
    JOIN player_Take_lesson ptl ON p.Player_ID = ptl.Player_ID
    JOIN lesson l ON ptl.lesson_id = l.lesson_id;
END $$
DELIMITER ;

CALL PopulatePlayerLessons();
SELECT * FROM TempPlayerLessons;

-- Show an admin's contact information
DROP PROCEDURE IF EXISTS GetAdminContactInfo;
DELIMITER $$
CREATE PROCEDURE GetAdminContactInfo(IN p_admin_id NUMERIC(10))
BEGIN
    SELECT Username, Email, phoneNumber, Zipcode
    FROM Administrative
    WHERE Admin_ID = p_admin_id;
END$$
DELIMITER ;

CALL GetAdminContactInfo(1001);

-- =========================================================
-- 6. Functions
-- =========================================================

DROP FUNCTION IF EXISTS CalculateAverageScore;
DELIMITER //
CREATE FUNCTION CalculateAverageScore(player_id INT)
RETURNS VARCHAR(100)
DETERMINISTIC
READS SQL DATA
BEGIN
    DECLARE average_score DECIMAL(5,2);
    SELECT AVG(CAST(paq.Player_score AS DECIMAL(5,2)))
    INTO average_score
    FROM player_anwser_qustion paq
    WHERE paq.Player_ID = player_id;
    RETURN CONCAT('Player ID: ', player_id, ', Average Score: ', CAST(average_score AS CHAR(10)));
END //
DELIMITER ;

SELECT CalculateAverageScore(101);

CREATE OR REPLACE VIEW PlayerAverageScore AS
SELECT Player_ID, CalculateAverageScore(Player_ID) AS AverageScore
FROM Player;

-- =========================================================
-- 7. Triggers
-- =========================================================

-- Reject scores outside 0..1
DROP TRIGGER IF EXISTS check_player_score;
DELIMITER $$
CREATE TRIGGER check_player_score
BEFORE INSERT ON player_anwser_qustion
FOR EACH ROW
BEGIN
    IF NEW.Player_score < 0 OR NEW.Player_score > 1 THEN
        SIGNAL SQLSTATE '45000'
        SET MESSAGE_TEXT = 'Player score cannot be negative or greater than 1';
    END IF;
END$$
DELIMITER ;
