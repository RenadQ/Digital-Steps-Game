package digitalsteps;

import java.util.*;
public class Beginner extends Quiz{
    public Beginner() {
        super();
    }

    /*private int countPointBeg;
    public Beginner(){
        countPointBeg = 0;
    }*/

    public void training(){
        Scanner input = new Scanner(System.in);
        String yesOrNo;
        String expectedWord;
        String answer;

        boolean isCorrect = false;
        System.out.println("Welcome!");
        System.out.println("-Programming languages enable humans to write instructions that a computer can perform. " + "With precise instructions, coordinated computers applications and systems that run the modern world.\n"+"-One reason people love Java is the Java Virtual Machine," + "which ensures the same Java code can be run on different operating systems and platforms.\n" + "Sun Microsystems’ slogan for Java was “write once, run everywhere”.");
        System.out.println("Do we begin? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("YOU ARE NOW IN PART ONE");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Lesson 1\n"+"Syntax");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Let's start with a simple program that prints \"Hello World\" to the screen.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Write this -> System.out.println(\"Hello World\");\n" + "Note: Pay attention to uppercase and lowercase letters, as well as spaces");
            expectedWord = "System.out.println(\"Hello World\");";
            do{
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("public void HelloWorld {\n"+"public static void main(String[] args){");
                System.out.print("write your code here: ");
                answer = input.nextLine();
                System.out.println("} }");
                if (answer.equalsIgnoreCase(expectedWord)){
                    System.out.println("Well done!");
                    isCorrect = true;
                    incrementCount();
                }
                else {
                    System.out.print("Incorrect :( \n"+"The correct answer is: System.out.println(\"Hello World\");\n"+"Do you want to Try again or Exit ?  (t/e): ");
                    String choice = input.nextLine().toLowerCase();
                    isCorrect = choice.equalsIgnoreCase("e");}
            }while(!isCorrect);

            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Go to next lesson? (y/n)");
            yesOrNo=input.nextLine();
            //lesson2
            if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Lesson 2\n"+"Input and Output");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("We previously reviewed how printing was done -> System.out.println(\"what do you want to print\")");
                System.out.println("Now we will learn how take an input");
                System.out.println("You must write this sentence to be able to take any input from the user, " +
                        "and write it only once in one class. -> Scanner input = new Scanner(System.in);\n"+
                        "You can replace \"input\" with what ever you want.");
                System.out.println("Then a variable is defined, and we will learn what variables are in the next lessons, \n" +
                        "but for now the variable we will be working on, is Integer.");
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("For example -> int x \"x is the name of the variable\"");
                    System.out.println("Then, you will write this sentence "+
                            "-> x = input.nextInt(); \n" +
                            "from which the input will be taken");
                    System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                    expectedWord = "x = input.nextInt();";
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("public void HelloWorld {\n"+"public static void main(String[] args){\n"+
                            "Scanner input = new Scanner(System.in);");
                    System.out.print("write your code here: ");
                    answer = input.nextLine();
                    System.out.println("} }");
                    if (answer.equalsIgnoreCase(expectedWord)|| answer.equalsIgnoreCase("x= input.nextInt();")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }

                    else {
                        System.out.print("Incorrect :( \n"+"The correct answer is: x = input.nextInt();\n"+"Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");
                    }
                }while(!isCorrect);}
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Go to next lesson? (y/n)");
            yesOrNo=input.nextLine();
            //lesson3
            if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Lesson 3\n"+"Comments");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Its benefit:\n" +
                        "The purpose of writing comments inside the code file that contains the code is to explain what the code does. \n" +
                        "Java supports single and multi-line comments. \n" +
                        "All characters written inside the comment will be ignored by the Java compiler. \n" +
                        "The language compiler will not translate them because they are not programming commands and are seen as text. \n" +
                        "It has no software function.");
                System.out.println("-Single line comment -> // ");
                System.out.println("-Multiline comment -> //* */");
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Write this comment -> // this is scanner");
                    expectedWord="// this is scanner";
                    System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("public void HelloWorld {\n"+"public static void main(String[] args){");
                    System.out.print("write your code here: ");
                    answer = input.nextLine();
                    System.out.println("Scanner input = new Scanner(System.in);");
                    System.out.println("} }");
                    if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("//this is scanner")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("Incorrect :( \n"+"The correct answer is: // this is scanner\n"+"Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);}
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Go to next lesson? (y/n)");
            yesOrNo=input.nextLine();
            //lesson4
            if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Lesson 4\n"+"Variables");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Variables are containers for storing data values.\n" +
                        "In Java, there are different types of variables, for example:\n" +
                        "String - stores text, such as \"Hello\". String values are surrounded by double quotes\n" +
                        "int - stores integers (whole numbers), without decimals, such as 123 or -123\n" +
                        "float - stores floating point numbers, with decimals, such as 19.99 or -19.99\n" +
                        "char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes\n" +
                        "boolean - stores values with two states: true or false");
                System.out.println("here is some examples: ");
                System.out.println("1: Create a variable called numberFive of type int and assign it the value 5 -> int numberFive = 5; " );
                System.out.println("2: Create a variable called name of type String and assign it the value \"Miad\" -> String name = \"Miad\";");
                System.out.println("Other examples: \n" +
                        "int myNum = 33;\n" +
                        "float myFloatNum = 5.99f;\n" +
                        "char myLetter = 'M';\n" +
                        "boolean myBool = true;\n" +
                        "String myText = \"Jubail\";");
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Now it is your turn!");
                    System.out.println("Create a variable called myNumber of type int and assign it the value 20");
                    expectedWord= "int myNumber= 20;";
                    System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("public void HelloWorld {");
                    System.out.println("public static void main(String[] args){\n"+
                            "Scanner input = new Scanner(System.in);");
                    System.out.print("write your code here: ");
                    answer = input.nextLine();
                    System.out.println("} }");
                    if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("int myNumber=20;")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("Incorrect :( \n"+"The correct answer is: int myNumber= 20;\n"+"Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}

                }while(!isCorrect);}
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Well Done!"+"\n"+"You Finished Part One");
            System.out.println("Do you want to start part two? (y/n)");
            yesOrNo=input.nextLine();
            if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("YOU ARE NOW IN PART TWO");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                //lesson 5
                System.out.println("Lesson 5\n"+"Display Variables & Declare Many Variables");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("The println() method is often used to display variables.\n" +
                        "To combine both text and a variable, use the + character:");
                System.out.println("Example:" +
                        "String name = \"Miad\";\n" +
                        "System.out.println(\"Hello \" + name);");
                System.out.println("The Output: Hello Miad");
                System.out.println("For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):");
                System.out.println("Example: ");
                System.out.println("int x = 4;\n" +
                        "int y = 8;\n" +
                        "System.out.println(x + y); // Print the value of x + y:");
                System.out.println("The Output: 12");
                System.out.println("To declare more than one variable of the same type, you can use a comma-separated list:");
                System.out.println("Instead of writing:\n" +
                        "\n" +
                        "int x = 50;\n" +
                        "int y = 60;\n" +
                        "int z = 70;\n" +
                        "System.out.println(x + y + z);\n" +
                        "You can simply write:\n" +
                        "\n" +
                        "int x = 50, y = 60, z = 70;\n" +
                        "System.out.println(x + y + z);");
                System.out.println("One Value to Multiple Variables:\n"+
                        "Example\n" +
                        "int x, y, z;\n" +
                        "x = y = z = 4;\n" +
                        "System.out.println(x + y + z);\n");
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("It's been a long lesson.\n" +"It's time to test yourself");
                    System.out.println("find the missing part. (hint: it is just one character)");
                    expectedWord =",";
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("int x=12 __ y=14 __ z=16;");
                    System.out.print("The missing part is: ");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("Incorrect :( \n"+"The correct answer is: , \n"+"Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                //lesson6
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Lesson 6\n"+"Identifiers");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("All Java variables must be identified with unique names.\n" +
                            "These unique names are called identifiers.\n" +
                            "Identifiers can be short names (like x and y) or more descriptive names (age, sum, totalVolume).\n" +
                            "Rules For Defining Java Identifiers\n" +
                            "There are certain rules for defining a valid Java identifier. These rules must be followed, otherwise, we get a compile-time error. \n" +
                            "These rules are also valid for other languages like C, and C++. \n" +
                            "\n" +
                            "The only allowed characters for identifiers are all alphanumeric characters([A-Z],[a-z],[0-9]), ‘$‘(dollar sign) and ‘_‘ (underscore).\n" +
                            "For example “geek@” is not a valid Java identifier as it contains a ‘@’ a special character.\n" +
                            "Identifiers should not start with digits([0-9]). For example “123geeks” is not a valid Java identifier.\n" +
                            "Java identifiers are case-sensitive.\n" +
                            "There is no limit on the length of the identifier but it is advisable to use an optimum length of 4 – 15 letters only.\n" +
                            "Reserved Words can’t be used as an identifier. For example “int while = 20;” is an invalid statement as a while is a reserved word. There are 53 reserved words in Java.\n"+
                            "Note: It is recommended to use descriptive names in order to create understandable and maintainable code:");
                    System.out.println("Example:");
                    System.out.println("// Good\n" +
                            "int numOfCourses = 6;\n" +
                            "// OK, but not so easy to understand what m actually is\n" +
                            "int num = 6;");
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Test Yourself!");
                        //System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                        expectedWord = "B";
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Which of the following options is a valid Java identifier?\n" +
                                "\n" +
                                "A) 123identifier\n" +
                                "B) _myIdentifier\n" +
                                "C) $identifier@\n" +
                                "D) public\n" +
                                "\n" +
                                "Please select the correct option (A, B, C, or D).");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("b")){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }

                        else {
                            System.out.print("Incorrect :( \n"+"The correct answer is: B\n"+"Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");
                        }
                    }while(!isCorrect);}
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                //countPointBeg++;
                //lesson7
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Lesson 7\n"+"Data Types");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Data types are divided into two groups:\n" +
                            "Primitive data types - includes byte, short, int, long, float, double, boolean and char\n" +
                            "Non-primitive data types - such as String, Arrays and Classes (you will learn more about these in a later chapter)");
                    System.out.println("Primitive Data Types\n" +
                            "A primitive data type specifies the size and type of variable values, and it has no additional methods.\n" +
                            "There are eight primitive data types in Java:");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" Data Type  |    Size      |     Description                                                             | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" byte       |    1 byte    |    Stores whole numbers from -128 to 127                                    | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" int        |    4 bytes   |    Stores whole numbers from -2,147,483,648 to 2,147,483,647                | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" float      |    4 bytes   |     Stores fractional numbers. Sufficient for storing 6 to 7 decimal digits | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" double     |    8 bytes   |    Stores fractional numbers. Sufficient for storing 15 decimal digits      | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" boolean    |    1 bytes   |     Stores true or false values                                             | ");
                    System.out.println("-----------------------------------------------------------------------------------------------------------");
                    System.out.println(" char       |    2 bytes   |    Stores a single character/letter or ASCII values                         | ");
                    System.out.println("---------------------------------------------------------------------------------------------------------\n");

                    System.out.println("Non-Primitive Data Types\n" +
                            "Non-primitive data types are called reference types because they refer to objects.\n" +
                            "The main difference between primitive and non-primitive data types are:\n" +
                            "Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).\n" +
                            "Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.\n" +
                            "A primitive type has always a value, while non-primitive types can be null.\n" +
                            "A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.\n" +
                            "Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc. You will learn more about these in a later chapter.");
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Test Yourself!");
                        //System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                        expectedWord = "C";
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Which of the following options is a non-primitive data type in Java?\n" +
                                "\n" +
                                "A) Float\n" +
                                "B) Integer\n" +
                                "C) String\n" +
                                "D) Double\n" +
                                "\n" +
                                "Please select the correct option (A, B, C, or D).");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord) || answer.equalsIgnoreCase("c")){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }

                        else {
                            System.out.print("Incorrect :( \n"+"The correct answer is: C\n"+"Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");
                        }
                    }while(!isCorrect);}
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                //countPointBeg++;
                //lesson8
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Lesson 8\n"+"Operators");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Operators are used to perform operations on variables and values.\n" +
                            "In the example below, we use the + operator to add together two values:\n"+"int x = 100 + 50;\n"+"The Output: 150");
                    System.out.println("Java divides the operators into the following groups:\n" +
                            "\n" +
                            "Arithmetic operators\n" +
                            "Assignment operators\n" +
                            "Comparison operators\n" +
                            "Logical operators\n" +
                            "Bitwise operators");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Arithmetic Operators");
                    System.out.println("( + for addition) and ( - for subtraction) and ( * for multiplication) and (/ for division)\n"
                            +"Also: ( % for modulus) and ( ++ for increment) and ( -- for Decrement)");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Assignment Operators");
                    System.out.println("Assignment operators are used to assign values to variables.\n" +
                            "In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:\n"+ "Example: x = 50;");
                    System.out.println("The addition assignment operator (+=) adds a value to a variable:\n" + "Example: \n" + "int x = 10;\n" +
                            "x += 5;\n"+"The Output: 15\n"+"Note: we can do the same with other operators, -= , *= , /= , %= ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Comparison Operators");
                    System.out.println("Comparison operators are used to compare two values (or variables). This is important in programming, because it helps us to find answers and make decisions.\n" +
                            "The return value of a comparison is either true or false. These values are known as Boolean values, and you will learn more about them in the Booleans and If..Else chapter.\n" +
                            "In the following example, we use the greater than operator (>) to find out if 5 is greater than 3:\n"+
                            "Example: \n"+"int x = 10;\n" +
                            "int y = 2;\n" +
                            "System.out.println(x > y)\n"+"The Output: it will returns true because 5 is higher than 3");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n------------------------------------------------------------------------------");
                    System.out.println("  Operator   |    Name                    |     Example                     | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    ==       |   Equal to                 |    x == y                       | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    !=       |   Not equal                |    x != y                       | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    >        |   Greater than             |    x > y                        | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    <        |   Less than                |    x < y                        | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    >=       |   Greater than or equal to |    x >= y                       | ");
                    System.out.println("------------------------------------------------------------------------------");
                    System.out.println("    <=       |   Less than or equal to    |    x <= y                       | ");
                    System.out.println("------------------------------------------------------------------------------\n");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Logical Operators");
                    System.out.println("You can also test for true or false values with logical operators.\n" +
                            "Logical operators are used to determine the logic between variables or values:");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("  Operator   |     Name      |  Description                                             | ");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("  &&         |     AND       |  Returns true if both statements are true                | ");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("  ||         |     OR        |  Returns true if one of the statements is true           | ");
                    System.out.println("------------------------------------------------------------------------------------------");
                    System.out.println("  !          |     NOT       |  Reverse the result, returns false if the result is true | ");
                    System.out.println("--------------------------------------------------------------------------------------------\n");
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("If we want to get the remainder by dividing it by 15 by 2");
                        System.out.println("System.out.println( 15 __ 2 )");
                        System.out.print("The missing part is: ");
                        answer = input.nextLine();
                        expectedWord="%";
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("Incorrect :( \n"+"the correct answer is : % \n"+"Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}

                    }while(!isCorrect);
                }
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                //lesson9
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Lesson 9\n"+"IF-Else Statement");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("You already know that Java supports the usual logical conditions from mathematics:\n" +
                            "Less than: a < b\n" +
                            "Less than or equal to: a <= b\n" +
                            "Greater than: a > b\n" +
                            "Greater than or equal to: a >= b\n" +
                            "Equal to a == b\n" +
                            "Not Equal to: a != b\n" +
                            "You can use these conditions to perform different actions for different decisions.\n" +
                            "Java has the following conditional statements:\n" +
                            "Use if to specify a block of code to be executed, if a specified condition is true\n" +
                            "Use else to specify a block of code to be executed, if the same condition is false \n" +
                            "which means: It executes the if block if condition is true otherwise else block is executed. \n"+
                            "Use else if to specify a new condition to test, if the first condition is false\n" +
                            "Use switch to specify many alternative blocks of code to be executed"+ "  Note: Don't worry, We will discuss this in next lesson");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("The if Statement\n" +
                            "Use the if statement to specify a block of Java code to be executed if a condition is true.\n"+"Syntax:\n"+
                            "if (condition) {\n" +
                            "  // block of code to be executed if the condition is true\n" +
                            "}");
                    System.out.println("Example:\n"+"if (20 > 18) {\n" +
                            "  System.out.println(\"20 is greater than 18\");\n" +
                            "}");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("The else Statement\n" +
                            "Use the else statement to specify a block of code to be executed if the condition is false.\n" + "Syntax:\n"+
                            "if (condition) {\n" +
                                    "  // block of code to be executed if the condition is true\n" +
                                    "} else {\n" +
                                    "  // block of code to be executed if the condition is false\n" +
                                    "}");
                    System.out.println("Example:\n"+"int time = 20;\n" +
                            "if (time < 18) {\n" +
                            "  System.out.println(\"Good day.\");\n" +
                            "} else {\n" +
                            "  System.out.println(\"Good evening.\");\n" +
                            "}\n" +
                            "// Outputs \"Good evening.\"");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("The else if Statement\n" +
                            "Use the else if statement to specify a new condition if the first condition is false.\n" +"Syntax:\n"+
                            "if (condition1) {\n" +
                            "  // block of code to be executed if condition1 is true\n" +
                            "} else if (condition2) {\n" +
                            "  // block of code to be executed if the condition1 is false and condition2 is true\n" +
                            "} else {\n" +
                            "  // block of code to be executed if the condition1 is false and condition2 is false\n" +
                            "}");
                    System.out.println("Example:\n"+"int time = 22;\n" +
                            "if (time < 10) {\n" +
                            "  System.out.println(\"Good morning.\");\n" +
                            "} else if (time < 18) {\n" +
                            "  System.out.println(\"Good day.\");\n" +
                            "} else {\n" +
                            "  System.out.println(\"Good evening.\");\n" +
                            "}\n" +
                            "// Outputs \"Good evening.\"");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Short Hand If...Else\n" +
                            "There is also a short-hand if else, which is known as the ternary operator because it consists of three operands.\n" +
                            "\n" +
                            "It can be used to replace multiple lines of code with a single line, and is most often used to replace simple if else statements:"+"Syntax:\n"+
                            "\nvariable = (condition) ? expressionTrue :  expressionFalse;");
                    System.out.println("\nExample:\n"+"int time = 20;\n" +
                            "String result = (time < 18) ? \"Good day.\" : \"Good evening.\";\n" +
                            "System.out.println(result);" );

                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Test Yourself:");
                        System.out.println("Find the missing parts (Just two parts!), I want you to solve the problem so that the output is: Hello World"+
                                "write the first and spaces and then write the second ;)");
                        System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                        expectedWord = "if >";
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("public void HelloWorld {\n"+"public static void main(String[] args){\n"+
                                "Scanner input = new Scanner(System.in);");
                        System.out.println("int x = 50;\n" +
                                "int y = 10;\n" +
                                "____(x___y) {\n" +
                                "  System.out.println(\"Hello World\");\n" +
                                "}");
                        System.out.print("The missing two parts are: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("if > ")){
                            System.out.println("Excellent!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("Incorrect :( \n"+"The correct answers are: if >\n"+"Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");
                        }
                    }while(!isCorrect);}
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                //lesson10
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Lesson 10\n"+"Switch Statements");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Instead of writing many if..else statements, you can use the switch statement.\n" +
                            "The switch statement selects one of many code blocks to be executed:\n"+ "Syntax:\n"+
                            "switch(expression) {\n" +
                            "  case x:\n" +
                            "    // code block\n" +
                            "    break;\n" +
                            "  case y:\n" +
                            "    // code block\n" +
                            "    break;\n" +
                            "  default:\n" +
                            "    // code block\n" +
                            "}");
                    System.out.println("This is how it works:\n" +
                            "\n" +
                            "The switch expression is evaluated once.\n" +
                            "The value of the expression is compared with the values of each case.\n" +
                            "If there is a match, the associated block of code is executed.\n" +
                            "The break and default keywords are optional, and will be described later in this chapter");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Example:\n");
                    System.out.println("int day = 4;\n" +
                            "switch (day) {\n" +
                            "  case 1:\n" +
                            "    System.out.println(\"Monday\");\n" +
                            "    break;\n" +
                            "  case 2:\n" +
                            "    System.out.println(\"Tuesday\");\n" +
                            "    break;\n" +
                            "  case 3:\n" +
                            "    System.out.println(\"Wednesday\");\n" +
                            "    break;\n" +
                            "  case 4:\n" +
                            "    System.out.println(\"Thursday\");\n" +
                            "    break;\n" +
                            "  case 5:\n" +
                            "    System.out.println(\"Friday\");\n" +
                            "    break;\n" +
                            "  case 6:\n" +
                            "    System.out.println(\"Saturday\");\n" +
                            "    break;\n" +
                            "  case 7:\n" +
                            "    System.out.println(\"Sunday\");\n" +
                            "    break;\n" +
                            "}\n" +
                            "// Outputs \"Thursday\" (day 4)");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Here is some note that you should pay attention to:\n" +
                            "The break Keyword\n" +
                            "When Java reaches a break keyword, it breaks out of the switch block.\n" +
                            "\n" +
                            "This will stop the execution of more code and case testing inside the block.\n" +
                            "\n" +
                            "When a match is found, and the job is done, it's time for a break. There is no need for more testing.\n" +
                            "!!!A break can save a lot of execution time because it \"ignores\" the execution of all the rest of the code in the switch block.!!!\n" +
                            "The default Keyword\n" +
                            "The default keyword specifies some code to run if there is no case match:\n"+"Example:\n" +
                            "int day = 4;\n" +
                            "switch (day) {\n" +
                            "  case 6:\n" +
                            "    System.out.println(\"Today is Saturday\");\n" +
                            "    break;\n" +
                            "  case 7:\n" +
                            "    System.out.println(\"Today is Sunday\");\n" +
                            "    break;\n" +
                            "  default:\n" +
                            "    System.out.println(\"Looking forward to the Weekend\");\n" +
                            "}\n" +
                            "// Outputs \"Looking forward to the Weekend\"" +
                            "!!!Note that if the default statement is used as the last statement in a switch block, it does not need a break.!!!");
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("Test Yourself!");
                        System.out.println("Note: Pay attention to uppercase and lowercase letters, as well as spaces");
                        expectedWord = "break";
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("public void HelloWorld {\n"+"public static void main(String[] args){\n"+
                                "Scanner input = new Scanner(System.in);");
                        System.out.println("int day = 2;\n"+
                                "switch(day){\n"+
                                "case 1:\n" + "    System.out.println(\"Saturday\");\n"+"case 2:\n"+"    System.out.println(\"Sunday\");\n"+"}");
                        System.out.print("what do you think it's missing: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("Break") || answer.equalsIgnoreCase("Break;") || answer.equalsIgnoreCase("break;")){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }

                        else {
                            System.out.print("Incorrect :( \n"+"The correct answer is: break;\n"+"Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");
                        }
                    }while(!isCorrect);}
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Well Done!"+"\n"+"You Finished Part Two");

            }
        }
        else
        {
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("It's good to see you");
        }
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Thank you for playing!");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }


    /*public void incrementCount() {
        countPointBeg++;
    }

    public int getCountPointBeg() {

        return countPointBeg;
    }*/



    /*public boolean canTakeBeginnerQuiz() {
        return countPointBeg >= 8;
    }*/
}

