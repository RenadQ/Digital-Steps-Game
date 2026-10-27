-- Digital Steps: sample data
-- All people, emails, phone numbers and passwords below are fictional demo values.
USE Digitalstep;

INSERT INTO Administrative VALUES
(1001,'Admin','One','Saudi Arabia','Dammam','31111','demo_pass_1001','0500000001','admin1','admin1@example.com'),
(1002,'Admin','Two','Saudi Arabia','Jubail','35511','demo_pass_1002','0500000002','admin2','admin2@example.com'),
(1003,'Admin','Three','Saudi Arabia','Jubail','35512','demo_pass_1003','0500000003','admin3','admin3@example.com'),
(1004,'Admin','Four','Saudi Arabia','Jubail','35513','demo_pass_1004','0500000004','admin4','admin4@example.com'),
(1005,'Admin','Five','Saudi Arabia','Khobar','34711','demo_pass_1005','0500000005','admin5','admin5@example.com'),
(1006,'Admin','Six','Saudi Arabia','Jubail','35514','demo_pass_1006','0500000006','admin6','admin6@example.com'),
(1007,'Admin','Seven','Saudi Arabia','Khobar','34712','demo_pass_1007','0500000007','admin7','admin7@example.com');

INSERT INTO Player VALUES
(101,'Maha','Saleh','maha_01@example.com','maha_01','demo_pass_101','0511111101','Saudi Arabia','Beginner'),
(102,'Rasha','Fahad','rasha_02@example.com','rasha_02','demo_pass_102','0511111102','Saudi Arabia',NULL),
(103,'Ghaida','Nasser','ghaida_03@example.com','Ghaida_03','demo_pass_103','0511111103','Saudi Arabia','intermediate'),
(104,'Shima','Omar','shima_04@example.com','shima_04','demo_pass_104','0511111104','Saudi Arabia','Advanced'),
(105,'Ebhar','Sami','ebhar_05@example.com','ebhar_05','demo_pass_105','0511111105','Saudi Arabia',NULL),
(106,'Lama','Khalid','lama_06@example.com','lama_06','demo_pass_106','0511111106','Kuwait','Beginner'),
(107,'Yousef','Adel','yousef_07@example.com','yousef_07','demo_pass_107','0511111107','Saudi Arabia','Intermediate'),
(108,'Aisha','Majed','aisha_08@example.com','aisha_08','demo_pass_108','0511111108','United Arab Emirates','Beginner'),
(109,'Ahmad','Saud','ahmad_09@example.com','ahmad_09','demo_pass_109','0511111109','Saudi Arabia','Advanced'),
(110,'Fatima','Ali','fatima_10@example.com','fatima_10','demo_pass_110','0511111110','Bahrain','Intermediate'),
(111,'Mohammed','Hamad','mohd_11@example.com','mohd_11','demo_pass_111','0511111111','Saudi Arabia','Beginner'),
(112,'Sara','Yasser','sara_12@example.com','sara_12','demo_pass_112','0511111112','United Arab Emirates','Advanced'),
(113,'Nasser','Faisal','nasser_13@example.com','nasser_13','demo_pass_113','0511111113','Oman','Beginner'),
(114,'Hessa','Badr','hessa_14@example.com','hessa_14','demo_pass_114','0511111114','Qatar','Intermediate'),
(115,'Abdullah','Turki','abdullah_15@example.com','abdullah_15','demo_pass_115','0511111115','Saudi Arabia','Advanced'),
(116,'Noor','Hamza','noor_16@example.com','noor_16','demo_pass_116','0511111116','United Arab Emirates','Intermediate'),
(117,'Ali','Hassan','ali_17@example.com','ali_17','demo_pass_117','0511111117','Saudi Arabia','Intermediate'),
(118,'Layla','Zaid','layla_18@example.com','layla_18','demo_pass_118','0511111118','United Arab Emirates','Beginner'),
(119,'Hassan','Waleed','hassan_19@example.com','hassan_19','demo_pass_119','0511111119','Bahrain','Advanced'),
(120,'Shikhah','Rami','shikhah_20@example.com','shikhah_20','demo_pass_120','0511111120','Saudi Arabia','Advanced'),
(121,'Khalid','Majid','khalid_21@example.com','khalid_21','demo_pass_121','0511111121','Qatar','Intermediate');

INSERT INTO Quiz (Quiz_ID, Quiz_Name, Quiz_Description, Quiz_Level, Question_Text, Choice_A, Choice_B, Choice_C, Choice_D, Correct_Answer)
VALUES (01, 'OOP in Java', 'Test your understanding of Java OOP concepts.', 'Advance', 'Which of the following is NOT a principle of OOP?', 'Inheritance', 'Encapsulation', 'Polymorphism', 'Abstraction', 'Choice_D'),
(02, 'Exception Handling in Java', 'Check your knowledge of Java exception handling.', 'Intermediate', 'What is the purpose of the "finally" block?', 'Handle', 'Execute', 'Terminate', 'Catch', 'Choice_B'),
(03, 'Java Collections Framework', 'Test your understanding of Java collections.', 'Intermediate', 'Which collection class provides a resizable array?', 'HashSet', 'HashMap', 'ArrayList', 'LinkedList', 'Choice_C'),
(04, 'Java Multithreading', 'Check your knowledge of Java multithreading concepts.', 'Advanced', 'What is a deadlock in Java multithreading?', 'Wait', 'Access', 'Terminate', 'Enter', 'Choice_A'),
(05, 'Java I/O', 'Test your understanding of Java input/output operations.', 'Intermediate', 'Which class in Java reads input from the keyboard?', 'Scanner', 'BufferedReader', 'InputStream', 'FileReader', 'Choice_A'),
(06, 'Java Generics', 'Check your knowledge of Java generic programming.', 'Advanced', 'What is the purpose of using generics?', 'Performance', 'Type Safety', 'Memory Usage', 'Code Syntax', 'Choice_B'),
(07, 'Java Lambda Expressions', 'Test your understanding of Java lambda expressions.', 'Intermediate', 'Which functional interface takes two arguments and returns a result?', 'Runnable', 'Consumer', 'Predicate', 'BiFunction', 'Choice_D'),
(08, 'Java Reflection', 'Check your knowledge of Java reflection API.', 'Advanced', 'Which class represents a class or interface in Java?', 'Field', 'Method', 'Constructor', 'Class', 'Choice_D'),
(09, 'Java Serialization', 'Test your understanding of Java object serialization.', 'Intermediate', 'Which interface should be implemented for object serialization in Java?', 'Serializable', 'Cloneable', 'Externalizable', 'Comparable', 'Choice_A');

INSERT INTO lesson VALUES
(1101,'Lesson1','Beginner'),
(1102,'Lesson2','Beginner'),
(1103,'Lesson3','Beginner'),
(1104,'Lesson4','Beginner'),
(1105,'Lesson5','Beginner'),
(1106,'Lesson6','Beginner'),
(1107,'Lesson7','Beginner'),
(1108,'Lesson8','Beginner'),
(1109,'Lesson9','Beginner'),
(1110,'Lesson10','Beginner'),
(1111,'Lesson11','Beginner'),
(1112,'Lesson12','Beginner'),
(1113,'Lesson13','Beginner'),
(1114,'Lesson14','Beginner'),
(1115,'Lesson15','Beginner'),
(1116,'Lesson16','intermediate'),
(1117,'Lesson17','intermediate'),
(1118,'Lesson18','intermediate'),
(1119,'Lesson19','intermediate'),
(1120,'Lesson20','intermediate'),
(1121,'Lesson21','intermediate'),
(1122,'Lesson22','intermediate'),
(1123,'Lesson23','intermediate'),
(1124,'Lesson24','intermediate'),
(1125,'Lesson25','intermediate'),
(1126,'Lesson26','intermediate'),
(1127,'Lesson27','intermediate'),
(1128,'Lesson28','intermediate'),
(1129,'Lesson29','intermediate'),
(1130,'Lesson30','intermediate'),
(1131,'Lesson31','Advanced'),
(1132,'Lesson32','Advanced'),
(1133,'Lesson34','Advanced'),
(1134,'Lesson35','Advanced'),
(1135,'Lesson36','Advanced'),
(1136,'Lesson37','Advanced'),
(1137,'Lesson38','Advanced'),
(1138,'Lesson39','Advanced'),
(1139,'Lesson40','Advanced'),
(1140,'Lesson41','Advanced'),
(1141,'Lesson42','Advanced'),
(1142,'Lesson43','Advanced'),
(1143,'Lesson44','Advanced'),
(1144,'Lesson45','Advanced'),
(11345,'Lesson46','Advanced'),
(1146,'Lesson47','Advanced'),
(1148,'Lesson48','Advanced'),
(1149,'Lesson49','Advanced'),
(1150,'Lesson50','Advanced');

INSERT INTO Question
VALUES(101,'Q1_forbeginner','C',1101),(102,'Q2_for beginner','B',1102),(103,'Q3_for beginner','A',1103),
(104,'Q4_for beginner','A',1104),(105,'Q5_for beginner','D',1105),(106,'Q6_for beginner','C',1106),
(107,'Q7_for beginner','A',1107),(108,'Q8_for beginner','C',1108),(109,'Q9_for beginner','A',1109),
(110,'Q10_for beginner','A',1110),(201,'Q1_for intermediate','A',1116),(202,'Q2_for intermediate','C',1117),
(203,'Q3_for intermediate','A',1118),(204,'Q4_for intermediate','A',1119),(205,'Q5_for intermediate','B',1120),
(206,'Q6_for intermediate','B',1121),(207,'Q7_for intermediate','B',1122),(208,'Q8_for intermediate','C',1123),
(209,'Q9_for intermediate','A',1124),(210,'Q10_for intermediate','B',1125),(301,'Q1_for advanced','A',1131),
(302,'Q2_for advanced','B',1132),(303,'Q2_for advanced','A',1133),(304,'Q4_for advanced','C',1134),
(305,'Q5_for advanced','C',1135),(306,'Q6_for advanced','B',1136),(307,'Q7_for advanced','A',1137),
(308,'Q8_for advanced','C',1138),(309,'Q9_for advanced','B',1139),(310,'Q10_for advanced','C',1140);

INSERT INTO Administrative_Display_player (Admin_ID, Player_ID) VALUES
(1001, 101),(1001, 102),(1002, 103),(1003, 104),(1004, 105),(1005, 106),(1006, 107),(1007, 108),(1001, 109),(1002, 110),(1003, 111),(1004, 112),(1005, 113),(1006, 114),(1007, 115),(1001, 116),(1002, 117),(1003, 118),(1004, 119),(1005, 120),(1006, 121);

INSERT INTO player_anwser_qustion
VALUES(101, 101,'1'),(102, 106,'0'), (102,102,'0'),(103, 108, '1'), (104, 111, '1'),
(105, 113, '0'), (106, 118,'0'), (201, 103, '1'),(202, 107, '1'), (203, 110, '1'),
(204, 114, '1'), (205, 116,'0'),(206, 117, '1'), (207, 121, '1'), (301, 104, '1'),
(302, 109, '1'), (303, 112,'1'), (304, 115, '0'), (305, 119, '1'),(306, 120, '1');

-- Each player takes every lesson of their own level (matched with an inner join)
INSERT INTO player_Take_lesson (lesson_id, Player_ID)
SELECT l.lesson_id, p.Player_ID
FROM Player p
INNER JOIN lesson l ON p.Plyer_Level = l.lesson_category;

INSERT INTO Administrative_Update_Quize (Quiz_ID, Admin_ID) VALUES
(01, 1001),(01, 1002),(01, 1003),(01, 1007),(02, 1001),(02, 1002),(02, 1006),(03, 1001),(03, 1002),(03, 1003),(03, 1004),(03, 1005),(05, 1001),(05, 1002),(05, 1003),(05, 1004),(05, 1005),(05, 1006),(05, 1007),(06, 1001),(06, 1002),(07, 1001),(07, 1002),(07, 1003),(07, 1005),(08, 1006),(09, 1003);
