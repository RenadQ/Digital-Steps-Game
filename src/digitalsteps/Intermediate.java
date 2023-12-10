package digitalsteps;

import java.util.*;
public class Intermediate extends Quiz{
    public Intermediate() {
        super();
    }


  

    public void training(){
        Scanner input = new Scanner(System.in);
        String yesOrNo;
        String expectedWord;
        String answer;

        boolean isCorrect = false;
        System.out.println("Welcome to intermediate level");
        System.out.println("Do we begin? (y/n)");
        yesOrNo=input.nextLine();
        if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\n Lesson 3\n Loops");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
           System.out.println("\n Loops can execute a block of code as long as a specified condition is reached.\n The for loop consists of three parts: initialization, condition, and iteration statement.\n 1-While Loop:The while loop loops through a block of code as long as a specified condition is true\n In the example below, the code in the loop will run, over and over again, as long as a variable (i) is less than 5:\n int i = 0;\n while (i < 5) {\n System.out.println(i);\n i++;\n 2-Do/While Loop\n This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.\n in the example it uses a do/while loop. The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:\n int i = 0;\n do {\n System.out.println(i);\n i++;\n }\n while (i < 5);\n }\n 3-For Loop\n When you know exactly how many times you want to loop through a block of code, use the for loop instead of a while loop\n The example below will print the numbers 0 to 4:\n for (int i = 0; i < 5; i++) {\n System.out.println(i);\n }\n 4-Nested Loops\n It is also possible to place a loop inside another loop. This is called a nested loop \n The \"inner loop\" will be executed one time for each iteration of the \"outer loop\"\n \n // Outer loop\n for (int i = 1; i <= 2; i++) {\n System.out.println(\"Outer: \" + i); // Executes 2 times\n \n // Inner loop\n for (int j = 1; j <= 3; j++) {\n System.out.println(\"inner\" + j); // Executes 6 times (2 * 3)\n }\n }\n Now let's move on to the questions\n ");
            expectedWord = "once";
            do{
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("The do-while loop executes the loop body at least _______.");
                System.out.print("write your answer");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("i,j")||answer.equalsIgnoreCase("ij")){
                    System.out.println("Well done!");
                    isCorrect = true;
                    incrementCount();
                }
                else {
                    System.out.print("\n Incorrect :( \n The correct answer is:once\n Do you want to Try again or Exit ? (t/e): ");
                    String choice = input.nextLine().toLowerCase();
                    isCorrect = choice.equalsIgnoreCase("e");}
            }while(!isCorrect);
            expectedWord = "9";
            do{
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n int sum = 0;\n for (int i = 1; i <= 5; i++) {\n sum += i;\n if (i == 3) {\n break;\n }\n }\n System.out.println(sum);\n what will be the output?\n ");
                System.out.print("write your answer");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("i,j")||answer.equalsIgnoreCase("ij")){
                    System.out.println("Well done!");
                    isCorrect = true;
                    incrementCount();
                }
                else {
                    System.out.print("\n Incorrect :( \n The correct answer is:9\n Do you want to Try again or Exit ? (t/e): ");
                    String choice = input.nextLine().toLowerCase();
                    isCorrect = choice.equalsIgnoreCase("e");}
            }while(!isCorrect);
            expectedWord = "120";
            do{
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n int i = 1;\n int product = 1;\n while (i <= 5) {\n product *= i;\n i++;\n }\n System.out.println(product);\n what will be the output?\n ");
                System.out.print("write your answer");
                answer = input.nextLine();
                if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("i,j")||answer.equalsIgnoreCase("ij")){
                    System.out.println("Well done!");
                    isCorrect = true;
                    incrementCount();
                }
                else {
                    System.out.print("\n Incorrect :( \n The correct answer is:120\n Do you want to Try again or Exit ? (t/e): ");                    
                    String choice = input.nextLine().toLowerCase();
                    isCorrect = choice.equalsIgnoreCase("e");}
            }while(!isCorrect);






            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Go to next lesson? (y/n)");
            yesOrNo=input.nextLine();
            if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Lesson 12"+"Arrays");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n Arrays are used to store multiple values in a single variable, instead of declaring separate variables for each value.\n To declare an array, define the variable type with square brackets such as : String[] cars;\n We have now declared a variable that holds an array of strings. \n To insert values to it, you can place the values in a comma-separated list, inside curly braces:String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n or int[] myNum = {10, 20, 30, 40}; for integers.\n You can access an array element by referring to the index number.\n note : Array indexes start with 0: [0] is the first element. [1] is the second element, etc.\n This statement accesses the value of the first element in cars:\n String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n System.out.println(cars[0]); Which is Volvo\n -To change the value of a specific element, refer to the index number.\n -To find out how many elements an array has, use the length property.\n -\n ");
                expectedWord = "b";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n Which of the following options correctly declares an array of integers in Java?\n a) int[] numbers = new int();\n b) int[] numbers = new int[5];\n c) int numbers = new int[5];\n d) int numbers[] = {1, 2, 3, 4, 5};\n ");
                    System.out.print("write your answer, only the letter!:");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:b\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                expectedWord = "0";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n What is the index of the first element in an array?\n ");
                    System.out.print("write your answer:");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("zero")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:0\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                expectedWord = "length()";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n What method is used to find the length of an array in Java?\n ");
                    System.out.print("write your answer:");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)|| answer.equalsIgnoreCase("length")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:length()\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                expectedWord = "no";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n Can the size of an array be changed after it is created?\n ");
                    System.out.print("write your answer:");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:no\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                expectedWord = "2";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n To access the element at index 2 in an array named numbers, the syntax would be numbers[ ].\n Fill in the blank\n ");
                    System.out.print("write your answer:");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:2\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n Loop Through an Array\n You can loop through the array elements with the for loop, and use the length property to specify how many times the loop should run.\n Here's an example:\n String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n for (int i = 0; i < cars.length; i++) {\n System.out.println(cars[i]);\n }\n There is also a \"for-each\" loop, which is used exclusively to loop through elements in arrays\n This is an example of it :\n String[] cars = {\"Volvo\", \"BMW\", \"Ford\", \"Mazda\"};\n for (String i : cars) {\n System.out.println(i);\n }\n ");
                expectedWord = "a";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n a simple question\n int[] numbers = {1, 2, 3, 4, 5};\n for (int i = 0; i < numbers.length; i++) {\n System.out.print(numbers[i] + \" \");\n }\n What will be the output of the above code\n a) 1 2 3 4 5\n b) 5 4 3 2 1\n c) 1 3 5\n d) Compilation error\n ");
                    System.out.print("write your answer, only the letter!");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:a\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("\n Multidimensional Arrays is an array of arrays.\n To create a two-dimensional array, add each array within its own set of curly braces :\n int[][] myNumbers = { {1, 2, 3, 4}, {5, 6, 7} };\n myNumbers is now an array with two arrays as its elements.\n To access the elements of the myNumbers array, specify two indexes: one for the array, and one for the element inside that array.\n You can also change the value of an element.\n We can also use a for loop inside another for loop to get the elements of a two-dimensional array\n Now let's move on to the questions\n ");
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                expectedWord = "matrix[i][j]";
                do{
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n To access the element at row i and column j in a 2D array named matrix, the syntax would be matrix[i][j].\n Fill the Space\n ");
                    System.out.print("write your answer");
                    answer = input.nextLine();
                    if (answer.equalsIgnoreCase(expectedWord)||answer.equalsIgnoreCase("i,j")||answer.equalsIgnoreCase("ij")){
                        System.out.println("Well done!");
                        isCorrect = true;
                        incrementCount();
                    }
                    else {
                        System.out.print("\n Incorrect :( \n The correct answer is:matrix[i][j]\n Do you want to Try again or Exit ? (t/e): ");
                        String choice = input.nextLine().toLowerCase();
                        isCorrect = choice.equalsIgnoreCase("e");}
                }while(!isCorrect);









                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Go to next lesson? (y/n)");
                yesOrNo=input.nextLine();
                if(yesOrNo.equalsIgnoreCase("Yes") || yesOrNo.equalsIgnoreCase("yes") || yesOrNo.equalsIgnoreCase("Y") || yesOrNo.equalsIgnoreCase("y")){
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n Lesson 11\n Methods\n ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Let's start .");
                    System.out.println("\n A method in Java is a block of code that, when called, performs specific actions mentioned in it.\n An example of a method:\n \n public int addNumbers (int a, int b){\n //method body\n }\n \n 1- Access specifier:\n It is used to define the access type of the method. \n *Public: You can access it from any class\n *Private: You can access it within the class where it is defined\n *Protected: Accessible only in the same package or other subclasses in another package\n *Default: It is the default access specifier used by the Java compiler\n \n 2-ReturnType:\n It defines the return type of the method. In the above syntax, “int” is the return type.\n We can mention void as the return type if the method returns no value.\n \n 3-Method name:\n It is used to give a unique name to the method. In the above syntax, “addNumbers” is the method name.\n \n 4-Parameter list:\n It is a list of arguments (data type and variable name) that will be used in the method.\n In the above syntax, “int a, int b” mentioned within the parentheses is the parameter list.\n You can also keep it blank if you don’t want to use any parameters in the method.\n \n 5- Method signature:\n The method signature is just a combination of the method name and parameter list.\n ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                   System.out.println("\n Let's start with a simple question : \n ");
                    expectedWord = "public";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n public void greet(String name) {\n System.out.println(\"Hello, \" + name + \"!\");\n }\n What is the Access Specifier ?");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: public\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

                    expectedWord = "void";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n public void greet(String name) {\n System.out.println(\"Hello, \" + name + \"!\");\n }\n What is the Return Type?");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: void\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

                    expectedWord = "greet";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n public void greet(String name) {\n System.out.println(\"Hello, \" + name + \"!\");\n }\n What is the Method Name?");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: greet\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

                    expectedWord = "(String name)";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n public void greet(String name) {\n System.out.println(\"Hello, \" + name + \"!\");\n }\n What is the Parameter List?");                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: (String name)\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

                    expectedWord = "greet(String name)";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n public void greet(String name) {\n System.out.println(\"Hello, \" + name + \"!\");\n }\n What is the Method Signature?");
                        System.out.print("write your answer here: ");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: greet(String name)\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("\n You need to call a method to execute and use its functionalities.\n You can call a method by using its name followed by the parentheses and a semicolon, like this: add();\n Methods in Java can be broadly classified into two types:\n \n 1- Predefined methods:\n They can be called and used anywhere in our program without defining them.\n There are numerous predefined methods, such as length(), sqrt(), max(), and print().\n \n 1.1- Java Math:\n - Trigonometric Methods:\n sin(double a), cos(double a), tan(double a), acos(double a), asin(double a), atan(double a)\n - Exponent Methods:\n exp(double a): Returns e raised to the power of a.\n log(double a): Returns the natural logarithm of a.\n log10(double a): Returns the 10-based logarithm of a.\n pow(double a, double b): Returns a raised to the power of b.\n sqrt(double a): Returns the square root of a.\n - min, max: Returns the maximum or minimum of two parameters.\n - abs: Returns the absolute value of the parameter.\n - random Methods: Returns a random double value in the range [0.0, 1.0).\n \n 1.2- Java String:\n length(): Returns the number of characters in this string.\n charAt(index): Returns the character at the specified index from this string.\n concat(s1): Returns a new string that concatenates this string with string s1.\n toUpperCase(): Returns a new string with all letters in uppercase.\n toLowerCase(): Returns a new string with all letters in lowercase.\n trim(): Returns a new string with whitespace characters trimmed on both sides.\n \n 2- User-defined methods:\n It is possible to modify and tweak these methods according to the situation.\n ");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Let's move on to the questions now");
                    expectedWord = "Predefined";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n String text = \"Hello, World!\";\n System.out.println(text.length());\n Is length a Predefined method or a User-defined?\n ");
                        System.out.print("write your answer:");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: Predefined\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    expectedWord = "c";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n String text = \"Hello, World!\";\n int length = text.length();\n System.out.println(length);\n What will be the output of the above code?\n a) 5\n b) 12\n c) 13\n d) 14\n ");
                        System.out.print("write your answer,write only the letter :");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\n Incorrect :( \n The correct answer is: c\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    expectedWord = "c";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n double x = 4.5;\n double y = -2.7;\n double result = Math.pow(x, y);\n System.out.println(result);\n What will be the output of the above code?\n a) 0.0\n b) 1.0\n c) 6.25\n d) -6.75\n ");
                        System.out.print("write your answer,write only the letter :");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                           System.out.print("\n Incorrect :( \n The correct answer is: c\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    expectedWord = "b";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\n double num = -7.8;\n double absValue = Math.abs(num);\n System.out.println(absValue);\n What will be the output of the above code?\n a) -7.8\n b) 7.8\n c) -7.0\n d) 7.0\n ");
                        System.out.print("write your answer,write only the letter :");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                           System.out.print("\n Incorrect :( \n The correct answer is: b\n Do you want to Try again or Exit ? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("Methods in Java can also be classified into the following types: 1-Static Method :Static methods are the ones that belong to a class and not an instance of a class.It is possible to create a static method by using the “static” keyword. 2-Instance Method:The instance method is a non-static method that belongs to the class and its instance. Creating an object is necessary to call the instance method. 2.1-Accessor Method. It is used to get a private field’s value, accessor methods in Java can only read instance variables. They are always prefixed with the word ‘get’. 2.2-Mutator Method. It is used to get and set the value of a private field, mutator methods in Java can read and modify instance variables. They are always prefixed with the word ‘set’. Here is an example of Accessor and Mutator : public class Person { private String name; private int age; Getter for name public String getName() { return name; } Setter for name public void setName(String name) { this.name = name; } Getter for age public int getAge() { return age; } Setter for age public void setAge(int age) { this.age = age; } }");           
                    expectedWord = "no";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\nIs the following method call correct:\nmyMethod(\"Hello\", 5) (assuming myMethod does not accept two arguments)?\nyes or no ?\n");
                        System.out.print("write your answer:");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\nIncorrect :(\nThe correct answer is: no\nDo you want to Try again or Exit? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    expectedWord = "c";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\nWhat is the difference between a static method and an instance method?\na) Static methods can only be called within the same class, while instance methods can be called from other classes.\nb) Static methods do not have a return type, while instance methods do.\nc) Static methods belong to the class itself, while instance methods belong to individual objects of the class.\nd) Static methods can only be used with primitive data types, while instance methods can be used with objects.\n");
                        System.out.print("write your answer, only the letter!:");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\nIncorrect :(\nThe correct answer is: c\nDo you want to Try again or Exit? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);
                    expectedWord = "c";
                    do{
                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                        System.out.println("\nHow do you call a user-defined method in Java?\na) By using the new keyword\nb) By importing the method from another class\nc) By using the method name followed by parentheses and passing any required arguments\nd) By declaring the method as static\n");
                        System.out.print("write your answer, only the letter!:");
                        answer = input.nextLine();
                        if (answer.equalsIgnoreCase(expectedWord)){
                            System.out.println("Well done!");
                            isCorrect = true;
                            incrementCount();
                        }
                        else {
                            System.out.print("\nIncorrect :(\nThe correct answer is: c\nDo you want to Try again or Exit? (t/e): ");
                            String choice = input.nextLine().toLowerCase();
                            isCorrect = choice.equalsIgnoreCase("e");}
                    }while(!isCorrect);

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

        }
    }

   
}