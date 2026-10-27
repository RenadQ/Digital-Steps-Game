# 👣 Digital Steps

A console game that teaches **Java and Object-Oriented Programming** step by step, from your very first variable to inheritance and polymorphism. Learn a topic, take a quiz, earn points and compete on the score table.

> Team project for the Computer Science department, Imam Abdulrahman Bin Faisal University (IAU).

---

## 🎯 Objectives

- **Easy start for beginners:** step-by-step lessons and exercises that help new programmers get past the first hurdles.
- **Skill building for intermediate learners:** loops, arrays, methods and problem solving.
- **Advanced OOP:** classes, objects, relationships, inheritance, polymorphism and more.

**Who it's for:** CS students, self-learners who like a gamified approach, programmers moving to Java, and anyone curious about Java OOP.

## 🎮 Features

- **Two roles:** play as a **Player** to learn and take quizzes, or log in as an **Admin** to manage content.
- **Three levels:** Beginner → Intermediate → Advanced, each with lessons and a quiz.
- **Quizzes and scoring:** multiple-choice questions with instant feedback, plus an OOP competition quiz.
- **Score table:** compete with other players and see the rankings.
- **Learning extras:** reading material on program design, types of programming languages and common error types.
- **Feedback:** players can leave comments at the end.
- **Colored console UI** using ANSI colors.

## 📁 Project structure

```
.
├── src/digitalsteps/
│   ├── DigitalSteps.java        # Main entry point (menus, roles, flow)
│   ├── User.java / Player.java / Admin.java
│   ├── Quiz.java                # Base quiz logic + learning material
│   ├── Beginner.java / BeginnerQuiz.java
│   ├── Intermediate.java / IntermediateQuiz.java
│   ├── Advance.java             # Advanced OOP lessons
│   ├── CreatePrivateClass.java  # Quiz system classes
│   ├── Scoretable.java          # Competition & score table
│   └── DesingText.java          # Console colors
└── resources/                   # Text files the game reads and writes
    ├── textfilemcq.txt          # OOP competition questions
    ├── Disign.txt / PRlevel.txt / ErrorType.txt   # Learning material
    ├── data.txt                 # Score table data
    └── score.txt                # Player comments
```

## ▶️ How to run

Requires Java (JDK 8 or newer). Run these from the project root so the game can find the `resources/` folder:

```bash
javac -encoding UTF-8 -d out src/digitalsteps/*.java
java -cp out digitalsteps.DigitalSteps
```

You can also open the project in NetBeans or IntelliJ and run `DigitalSteps.java`. Just set the working directory to the project root.

---

<details>
<summary>🇸🇦 ملخص بالعربي</summary>

**Digital Steps** لعبة تعليمية تشتغل في الـ Console، وتعلّم لغة Java والبرمجة الكائنية (OOP) خطوة بخطوة، على ثلاث مستويات: مبتدئ، ومتوسط، ومتقدم. كل مستوى فيه دروس واختبار. وفيها جدول نقاط للمنافسة بين اللاعبين، ودورين: لاعب ومشرف.
</details>
