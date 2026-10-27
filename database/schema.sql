-- Digital Steps: MySQL database schema
-- CIS 321 Database Concepts & Design
-- Tables: Administrative, Player, lesson, Question, Quiz
-- Relationship tables: Administrative_Display_player, player_anwser_qustion,
--                      player_Take_lesson, Administrative_Update_Quize

CREATE DATABASE IF NOT EXISTS Digitalstep;
USE Digitalstep;

create table Administrative(
Admin_ID numeric (10)  primary key,
Fname  char(10) ,
Lname  char(10) ,
 Country text,
City text,
Zipcode char(5),
A_password varchar(45) not null,
phoneNumber varchar(15),
Username varchar(45) not null UNIQUE,
Email varchar (320) not null
);
CREATE TABLE Player (
    Player_ID INT AUTO_INCREMENT,
    Fname CHAR(10) NOT NULL,
    Lname CHAR(10),
    email VARCHAR(100) NOT NULL,
    username VARCHAR(45) NOT NULL UNIQUE,
    P_password VARCHAR(45) NOT NULL,
    phonenumber VARCHAR(15),
    country TEXT,
    Plyer_Level CHAR(20),
    PRIMARY KEY (Player_ID)
) AUTO_INCREMENT = 100;
CREATE TABLE lesson (
  lesson_id INT PRIMARY KEY,
  lesson_title VARCHAR(255),
  lesson_category VARCHAR(255)
);
CREATE TABLE Question (
    question_id NUMERIC(10) PRIMARY KEY,
    question_type VARCHAR(30),
    Answer char(30) not null,
    lesson_id INT NOT NULL,
    FOREIGN KEY (lesson_id) REFERENCES lesson(lesson_id));
CREATE TABLE Quiz (
    Quiz_ID INT PRIMARY KEY ,
    Quiz_Name VARCHAR(255) NOT NULL,
    Quiz_Description VARCHAR(300),
 Question_Text VARCHAR(100),
    Quiz_Level VARCHAR(20),
    Choice_A VARCHAR(255),
    Choice_B VARCHAR(255),
    Choice_C VARCHAR(255),
    Choice_D VARCHAR(255),
    Correct_Answer VARCHAR(255));
create table Administrative_Display_player(
Admin_ID numeric (10) ,
Player_ID INT NOT NULL,
primary key(Admin_ID,Player_ID)
);
alter table Administrative_Display_player add foreign key (Admin_ID) references Administrative (Admin_ID);
alter table Administrative_Display_player add foreign key (Player_ID) references Player (Player_ID);
create table player_anwser_qustion(
question_id NUMERIC(10) ,
Player_ID INT NOT NULL,
Player_score CHAR(20),
primary key(question_id,Player_ID)
);
alter table player_anwser_qustion add foreign key (question_id) references Question (question_id);
alter table player_anwser_qustion add foreign key (Player_ID) references Player (Player_ID);
create table player_Take_lesson(
lesson_id INT NOT NULL ,
Player_ID INT NOT NULL,
primary key(lesson_id,Player_ID)
);
alter table player_Take_lesson add foreign key (lesson_id) references lesson (lesson_id);
alter table player_Take_lesson add foreign key (Player_ID) references Player (Player_ID);
create table Administrative_Update_Quize(
Quiz_ID int ,
Admin_ID numeric (10) ,
primary key(Quiz_ID,Admin_ID)
);
alter table Administrative_Update_Quize add foreign key (Quiz_ID) references Quiz (Quiz_ID);
alter table Administrative_Update_Quize add foreign key (Admin_ID) references Administrative (Admin_ID);
