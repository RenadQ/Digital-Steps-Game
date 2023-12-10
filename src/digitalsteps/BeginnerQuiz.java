package digitalsteps;

import java.util.*;
public class BeginnerQuiz extends Beginner {
    public void takeQuiz() {
        Scanner input = new Scanner(System.in);
        String yesOrNo;
        String expectedWord;
        String answer;
        System.out.println("Start the Quiz");
        System.out.println("Question 1: "+"What is the correct way to print \"Hello, World!\" in Java?\n" +
                    "\n" +
                    "A) print(\"Hello, World!\");\n" +
                    "B) System.out.println(\"Hello, World!\");\n" +
                    "C) Console.WriteLine(\"Hello, World!\");\n" +
                    "D) System.Console.WriteLine(\"Hello, World!\");");
            expectedWord = "B";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("b")){
                System.out.println("Your answer is correct!");
                incrementCount();
            }
            else {
                System.out.print("Incorrect :( \n"+"The correct answer is: B");}

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("Question 2: "+"Which of the following methods is used to take input from the user in Java?\n" +
                        "\n" +
                        "A) System.in.read();\n" +
                        "B) Scanner.next();\n" +
                        "C) Console.readLine();\n" +
                        "D) System.out.print();");
                expectedWord = "B";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("b")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: B");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 3: "+"Which of the following is the correct way to write single-line comments in Java?\n" +
                        "\n" +
                        "A) // This is a comment\n" +
                        "B) /* This is a comment */\n" +
                        "C) <!-- This is a comment -->\n" +
                        "D) # This is a comment");
                expectedWord = "A";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("a")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: A");}

        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("Question 4: "+"Which of the following is a valid way to declare an integer variable named \"count\" and assign it the value of 10?\n" +
                        "\n" +
                        "A) int count = 10;\n" +
                        "B) count = 10;\n" +
                        "C) integer count = 10;\n" +
                        "D) var count = 10;");
                expectedWord = "A";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("a")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: A");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("Question 5: "+"Which of the following data types is used to store whole numbers in Java?\n" +
                        "\n" +
                        "A) double\n" +
                        "B) boolean\n" +
                        "C) char\n" +
                        "D) int");
                expectedWord = "D";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("d")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: D");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 6: "+"Which of the following options correctly displays the value of the variable \"x\" and declares three variables \"a\", \"b\", and \"c\"?\n" +
                    "\n" +
                    "A) System.out.println(x); int a, b, c;\n" +
                    "B) System.out.println(a); int x; int b, c;\n" +
                    "C) int x; System.out.println(x); int a; int b; int c;\n" +
                    "D) int a, b, c; System.out.println(a); int x;");
                expectedWord = "C";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("c")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: C");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 7: "+"Which of the following options are valid identifiers in Java?\n" +
                    "\n" +
                    "A) _myVariable\n" +
                    "B) 123abc\n" +
                    "C) user-name\n" +
                    "D) class\n");
                expectedWord = "A";
                System.out.print("write your answer here (A,B,C,D): ");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("a")){
                    System.out.println("Your answer is correct!");
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: A");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 8: "+"Which of the following options represents a primitive data type in Java?\n" +
                    "\n" +
                    "A) String\n" +
                    "B) Boolean\n" +
                    "C) char\n" +
                    "D) Integer");
            expectedWord = "C";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("c")){
                System.out.println("Your answer is correct!");
                incrementCount();
            }
            else {
                System.out.print("Incorrect :( \n"+"The correct answer is: C");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 9: "+"Which of the following operators is used for performing logical AND operation in Java?\n" +
                    "\n" +
                    "A) &&\n" +
                    "B) ||\n" +
                    "C) !\n" +
                    "D) &");
            expectedWord = "A";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("a")){
                System.out.println("Your answer is correct!");
                incrementCount();
            }
            else {
                System.out.print("Incorrect :( \n"+"The correct answer is: A");}
        }
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 10: "+"Which of the following options represents the correct syntax for an if statement in Java?\n" +
                    "\n" +
                    "A) if (condition) { // code block }\n" +
                    "B) if (condition) then { // code block }\n" +
                    "C) if condition then { // code block }\n" +
                    "D) if (condition) [code block]\n" +
                    "\n");
            expectedWord = "A";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine();
            if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("a")){
                System.out.println("Your answer is correct!");
                incrementCount();
            }
            else {
                System.out.print("Incorrect :( \n"+"The correct answer is: A");}

        }

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");




    }

}


