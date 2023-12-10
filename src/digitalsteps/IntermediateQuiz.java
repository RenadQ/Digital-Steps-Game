package digitalsteps;


import java.util.*;

public class IntermediateQuiz extends Intermediate{
    public void takeQuiz2() {
        Scanner input = new Scanner(System.in);
        String yesOrNo;
        String expectedWord;
        String answer;
        System.out.println("Start the Quiz");
        System.out.println("Question 1: "+"The __ loop is used to execute a block of code at least once, and then repeatedly execute it as long as a certain condition is true.\n" +
                "a) do-while\n" +
                "b) while\n" +
                "c) for \n" +
                "d) for-each l\n");
        expectedWord = "A";
        System.out.print("write your answer here (A,B,C,D): ");
        answer = input.nextLine().toUpperCase();
        if (answer.equalsIgnoreCase(expectedWord)){
            System.out.println("Your answer is correct!");
            incrementCount();
        }
        else {
            System.out.print("Incorrect :( \n"+"The correct answer is: A");}

        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Go to next Question? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("Question 2: "+"Which of the following is the correct way to declare an array ?\n" +
                    "a) arrayName = new int[];\n" +
                    "b) int arrayName[];\n" +
                    "c) int[] arrayName;\n" +
                    "d) new int[] arrayName;\n");
            expectedWord = "C";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine().toUpperCase();
            if (answer.equalsIgnoreCase(expectedWord)){
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
            System.out.println("Question 3: "+"What is the index of the first element in an array?\n" +
                    "a) 0\n" +
                    "b) 1\n" +
                    "c) -1\n" +
                    "d) It varies depending on the array size\n");
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
            System.out.println("Question 4: "+"What is the output:"+"int i = 0;\n" +
                    "do {\n" +
                    "    System.out.print(i + \" \");\n" +
                    "    i++;\n" +
                    "} while (i < 5);\n" +
                    "a) 0 1 2 3 4\n" +
                    "b) 1 2 3 4 5\n" +
                    "c) 0 1 2 3\n" +
                    "d) 1 2 3 4\n");
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
            System.out.println("Question 5: "+"What is the output:\n" +
                    "int i = 0;\n" +
                    "while (i < 5) {\n" +
                    "    System.out.print(i + \" \");\n" +
                    "    i += 2;\n" +
                    "}\n" +
                    "a) 0 1 2 3 4\n" +
                    "b) 0 2 4\n" +
                    "c) 1 3\n" +
                    "d) 1 3 5\n");
            expectedWord = "B";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine().toUpperCase();
            if (answer.equalsIgnoreCase(expectedWord) ){
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
            System.out.println("Question 6: "+"What is a method in Java?\n" +
                    "a) A variable that holds data.\n" +
                    "b) A reusable block of code that performs a specific task.\n" +
                    "c) A conditional statement used for decision making.\n" +
                    "d) A reserved word used to declare variables.\n");
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
            System.out.println("Question 7: "+"What is the difference between a static method and an instance method?\n" +
                    "a) A static method belongs to a specific object, while an instance method belongs to the class itself.\n" +
                    "b) A static method can be called without creating an instance of the class, while an instance method requires an object.\n" +
                    "c) A static method can access instance variables directly, while an instance method cannot.\n" +
                    "d) There is no difference between a static method and an instance method.");
            expectedWord = "B";
            System.out.print("write your answer here (A,B,C,D): ");
            answer = input.nextLine().toUpperCase();
            if (answer.equalsIgnoreCase(expectedWord)){
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
            System.out.println("Question 8: "+"ublic class MyClass {\n" +
                    "    public static void main(String[] args) {\n" +
                    "        int result = sum(3, 5);\n" +
                    "        System.out.println(result);\n" +
                    "    }\n" +
                    "    \n" +
                    "    public static int sum(int a, int b) {\n" +
                    "        return a + b;\n" +
                    "    }\n" +
                    "}\n" +
                    "a) 3\n" +
                    "b) 5\n" +
                    "c) 8\n" +
                    "d) Compilation error\n");
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
            System.out.println("Question 9: "+"The keyword used to call a method from within the same class is ____.\n" +
                    "Answer: this\n" +
                    "\n" +
                    "String str = \"Hello, World!\";\n" +
                    "char ch = str.charAt(7);\n" +
                    "System.out.println(ch);\n" +
                    "a) W\n" +
                    "b) o\n" +
                    "c) ,\n" +
                    "d) Compilation error\n");
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
            System.out.println("Question 10: "+"String str = \"Hello\";\n" +
                    "String upperCaseStr = str.toUpperCase();\n" +
                    "System.out.println(upperCaseStr);\n" +
                    "a) Hello\n" +
                    "b) HELLO\n" +
                    "c) hello\n" +
                    "d) Compilation error\n");
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




    }
}
