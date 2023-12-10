/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package digitalsteps;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author Huawei
 */
// Wajood 3 DEC
/* this class is about the ADVANCE level, it has 7 lessons & 10 Questions*/
public class Advance extends Quiz{ 
   
    Scanner input = new Scanner(System.in);
    
    String continuePlay ;
     
    static int countPointAdv;
    
    String lines1 = "----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
    
    
   
    public  void training(){ // method that calls all the lessons in the level
        System.out.println(lines1); // print lines
        System.out.println("                                                       Welcome To The Advance Level!"); // add color
        System.out.println(lines1); // print lines
        System.out.println("In this level, you're expected to learn the main concepts of Object-Oriented Programming (OOP):\n"
                + "OOP is a programming paradigm that organizes software design around data, or \"objects,\" encapsulating data (attributes) and behavior (methods) that manipulate the data.\n"
                + "OOP concepts like abstraction, encapsulation, inheritance, and polymorphism help programmers create modular, reusable, and maintainable code.\n"
                + "In Java, OOP is a core principle, allowing developers to create robust applications by leveraging these principles.");
        System.out.println(lines1);
        System.out.println("Do we begin? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonOne(); // Lesson1 method calling
            
        }else 
        
        // after each lesson, we ask the player if he wants to continue or not
        System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonTwo();
            
        }
        
        System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonThree();
            
        }
        
       System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonFour();
            
        }
        
        System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonFive();
            
        }
        
        System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonSix();
            
        }
        
        System.out.println(lines1); // print lines
        System.out.println("Do you wish to go to the next lesson? (y/n)");
        continuePlay = input.nextLine() ;
        
        if (continuePlay.equalsIgnoreCase("Yes") || continuePlay.equalsIgnoreCase("yes") || continuePlay.equalsIgnoreCase("Y") || continuePlay.equalsIgnoreCase("y")){
            
            LessonSeven();
            
        }
        System.out.println(lines1); // print lines
        System.out.println("Congratlations !! You've Finished the Advance Level :)");
        System.out.println(lines1); // print lines
        
        System.out.println("Your total points in this Level= " + returnCountPointAdv()); 
        
    } 
     
    
    public void LessonOne() { // Lesson1 Classes and Object
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;
        System.out.println();
        System.out.println("YOU ARE NOW IN PART ONE");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 1:\nClasses and Object");
        System.out.println(lines1); // print lines
        System.out.println(DesingText.ANSI_Blue+"\tWhat are Classes and Objects?"+ DesingText.ANSI_RESET);
        System.out.println("\u2022 Class is the basic unit of OOP, it encapsulates variables and methods.\n"
                + "\u2022 An instance of class is a creation of object from a class.");

        System.out.println("\t Now let’s create your first class in Java!\n"
                + "\n1-To create a class, use the keyword class.\n"
                + "2- Let's create a class called FirstStep with a variable x.\n"
                + "(Remember that a class should always start with an uppercase first letter and that the name \n"
                + "of the java file should match the class name.)\n\n");
   
        displayCodes(1);
        System.out.println(lines1);
        System.out.println("Now let's create your first object, an object is created from a class. We have already created \n"
                + "the class named FirstStep, so now we can use this to create objects.\n"
                + "Create an object called “Obj1” , and print the value of x.");
        System.out.println(" ");
        displayCodes(2); // method that print the code of the lesson
        System.out.println("Also you can create multiple objects of one class:");
        displayCodes(3); // method that print the code of the lesson
        System.out.println(lines1); // print lines

        do { // do ask the user question while he isn't answering correctly or entrinng e
            System.out.println(DesingText.ANSI_Blue+"\t \t Now test yourself and create an object of “MyClass” called “myObj”:"+ DesingText.ANSI_RESET);
            userAnsw = input.nextLine();

            correctAnsw = "MyClass myObj = new MyClass();"; // the correct anser

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done!"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++; // +1 Ponint for each question
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e"); // keep making the player reanswering until he enter a correct answer || e
            }

        } while (!isCorrect);

    }// end of lesson1
    
    public void LessonTwo(){ // Lesson 2 Constructors
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;
        
        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART TWO");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 2:\nConstructors\n"
                + lines1 + "\n"
                + "\u2022 First of all, a constructor in Java is a special method that is used to initialize objects.\n"
                + "\u2022 The constructor is called when an object of a class is created. It can be used to set initial values\n"
                + "for object attributes.\n"
                + "\u2022 All classes have constructors by default, if you do not create a class constructor yourself,\n"
                + "Java creates one for you.\n");
        System.out.println(DesingText.ANSI_Blue+"Let’s create a constructor for the FirstStep:");
        displayCodes(4); // method that print the code of the lesson
        System.out.println(lines1); // print lines

        do {

            System.out.println("Take a little break and test yourself with the following question:\n"
                    +DesingText.ANSI_Blue+ "Why do we use constructors? (a/b/c)\"\n"
                    + "a- to call an object.\n"
                    + "b- to initialize objects.\n"
                    + "c- to create an object."+ DesingText.ANSI_RESET);


            userAnsw = input.nextLine();
            correctAnsw = "b";

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! We use Constructors to initlize objects"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }

        } while (!isCorrect);

        System.out.println(lines1); // print lines
        System.out.println("Now let’s continue our lesson and learn about the second constructor type:");
        System.out.println("\u2022 Constructors can also take parameters, which are used to initialize attributes.\n"
                + "\u2022 The following example adds an int y parameter to the constructor. Inside the constructor,\n"
                + "we set x to y (x=y). When we call the constructor, we pass a parameter to the constructor (5),\n"
                + "which will set the value of x to 5:");

        displayCodes(5); // method that print the code of the lesson
        System.out.println(lines1); // print lines

        do {

            System.out.println("Now after the lesson is done, let’s test your knowledge\n\n"
                    + DesingText.ANSI_Blue+"Find the output from the following code: "+ DesingText.ANSI_RESET);

            displayCodes(6); // method that print the code of the lesson
            userAnsw = input.nextLine();
            correctAnsw = "DigitalSteps";

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The Right Answer Is DigitalSteps"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }

        } while (!isCorrect);
    } // end of Lesson2
    
    public void LessonThree(){ // Lesson3 Access Modifiers
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;
        
        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART THREE");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 3:\nAccess Modifiers\n"
                + lines1 + "\n"
                + "\u2022 By now, you are quite familiar with the public keyword that appears in almost all of our codes.\n"
                + "\u2022 The public keyword is an access modifier, meaning that it is used to set the access level\n"
                + "for classes, attributes, methods, and constructors.\n");


        System.out.println("\t\tAccess modifiers for classes: \n");
        System.out.println("| Modifier |                Description                                   |\n"
                + "|----------|--------------------------------------------------------------|\n"
                + "| public   | The class is accessible by any other class.                  |\n"
                + "| default  | The class is only accessible by classes in the same package. |");

        System.out.println("\tAccess modifiers for attributes, methods and constructors: \n");
        System.out.println("| Modifier  |               Description                                  |\n"
                + "|-----------|------------------------------------------------------------|\n"
                + "| public    | The code is accessible for all classes.                    |\n"
                + "| private   | The code is only accessible within the declared class.     |\n"
                + "| default   | The code is only accessible in the same package.           |\n"
                + "| protected | The code is accessible in the same package and subclasses. |");

        System.out.println(lines1); // print lines
        do {

            System.out.println("Now let's take a small test:");
            System.out.println("Q: Which access modifier restricts visibility to the class in which the member is declared? (a/b/c)\n"
                    + "(a) private\n"
                    + "(b) protected\n"
                    + "(c) public");

            userAnsw = input.nextLine();
            correctAnsw = "a";

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The Answer is Private"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }

        } while (!isCorrect);
        System.out.println(lines1); // print lines
        System.out.println("Let's take another question");
        System.out.println(lines1); // print lines
        
        do {
            System.out.println(DesingText.ANSI_Blue + "Q: Which access modifier can be used to make a class accessible outside of the package in which it is declared? (a/b/c)\n"
                    + "(a) private\n"
                    + "(b) protected\n"
                    + "(c) public"+ DesingText.ANSI_RESET);

            userAnsw = input.nextLine();
            correctAnsw = "c";
            
            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The Answer is Public"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");}
            
        }while (!isCorrect);
    }//end of lesson3
    
    public void LessonFour(){ // Lesson4 Getter & Setter
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;

        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART FOUR");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 4:\nGetter & Setter\n"
                + lines1 + "\n"
                + "In the previous lesson, you learned that private variables can only be accessed within the same class.\n"
                + "So how can we use it outside the class? To access a private we provide public get and set methods.\n"
                + "• The get method returns the variable value, and the set method sets the value.\n"
                + "• Now let’s see in codes how to access a private variable:\n");
        displayCodes(7);
        System.out.println( "• The get method returns the value of the variable name.\n"
                + "• The set method takes a parameter (newName) and assigns it to the name variable.\n"
                + "• Now to access and update the variable we use the getName() and setName() methods.");

        displayCodes(8); // method that print the code of the lesson
        System.out.println(lines1); // print lines

        do {
            System.out.println(DesingText.ANSI_Blue + "Now can you guess what's the output? (write your answer)"+ DesingText.ANSI_RESET);
            userAnsw = input.nextLine();
            correctAnsw = "John";

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The Output is John"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }

        } while (!isCorrect);
    } // end of lesson4
    
    public void LessonFive(){ // Lesson5 Classes Relationships
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;  
        
        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART FIVE");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 5:\nClasses Relationships\n"
                + lines1 + "\n"
                + "Class Abstraction\n"
                + "• Class abstraction means separating class implementation from the use of the class because the user of the \n"
                + "  class does not need to know how the class is implemented.\n"
                + "Class Encapsulation\n"
                + "• Encapsulation in Java is a process of wrapping code and data together into a single unit, \n"
                + "  we can create a fully encapsulated class in java by making all the data members of the class private.\n\n"
                + "Class Relationships\n"
                + "• Association: is a relation between two separate classes that describes an activity between two \n"
                + "  classes and is established through their Objects.\n"
                + "• Aggregation: is a specialized form of association where one class (the whole) contains or \n"
                + "  is composed of other classes (parts).\n"
                + "• Composition: is a stronger form of aggregation. It is a relationship where one class (the whole) \n"
                + "  owns or is composed of other classes (parts), and the parts cannot exist without the whole.");

        System.out.println(lines1); // print lines
        System.out.println("Before we go to the next lesson let’s test you: ");
        do {
         
            System.out.println(DesingText.ANSI_Blue +"A ......... relationship in which two entities are dependent on each other. (write your answer)"+ DesingText.ANSI_RESET);
            userAnsw = input.nextLine();
            correctAnsw = "Composition";
            
            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The correct answer is Composition"+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }
            
            
            
            
        } while (! isCorrect);
        
        
    }// end of lesson5
    
    public void LessonSix(){ // Lesson6 Inheritance
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;
        
        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART SIX");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 6:\nInheritance\n"
                + lines1 + "\n"
                + "Do you know in Java, it is possible to inherit attributes and methods from one class to another?\n"
                + "Interesting right? Let’s learn together one of the Important concepts of OOP which is inheritance.\n\n"
                + "We group the \"inheritance concept\" into two categories: \n"
                + "• subclass (child) - the class that inherits from another class\n"
                + "• superclass (parent) - the class being inherited from\n\n"
                + "What’s the benefit of inheritance?\n"
                + "• Inheritance supports the concept of reusability, when we want to create a new class and \n"
                + "  there’s already a class that includes some of the code that we want, we can derive our \n"
                + "  new class from the existing class.\n"
                + "• “Note that if I change something in the superclass, it will also change in the subclass.”\n\n"
                + "How to inherit from a class? To inherit from a class, use the extends keyword.\n"
                + "---------------------------------------------------\n"
                + "Now let’s see an example:");

        displayCodes(9); // method that print the code of the lesson
        System.out.println("• The keyword extends tells the compiler that the Car class extends the Vehicle class.");
        System.out.println(lines1); // print lines
        
        do {
            System.out.println(DesingText.ANSI_Blue + "Do you think if the variable “brand” in the superclass was a private data field, would it be accessible\n"
                    + "or used directly outside the superclass? (yes/No)"+ DesingText.ANSI_RESET );

            userAnsw = input.nextLine();
            correctAnsw = "no";

            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The answer is no it cannot be accessed directly."+ DesingText.ANSI_RESET);
                System.out.println(lines1); // print lines
                System.out.println("• Private data fields, as we learned in the third lesson, are not accessible outside the class,\n"
                        + "  which means a subclass can’t inherit a private data field directly without using setters/getters.");
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }

        } while (!isCorrect);
        
        System.out.println(lines1); // print lines
        System.out.println("Caution with Inheritance!");
        System.out.println("• Each subclass has only one superclass, if a subclass has more than one superclass it’s called multiple Inheritance which is not allowed in Java.\n"
                + "• A subclass and its superclass must have the is-a relationship.\n\n"
                + "Constructors and Inheritance\n"
                + "• Constructors are not members, so they can’t be inherited by subclasses.\n"
                + "• But the constructor of the superclass can be invoked using the keyword super.\n"
                + "• The super keyword is used to refer parent-class instances as well as static members.");
        System.out.println(lines1); // print lines
        System.out.println("Now after this long lesson let’s take a small test:");
        
        do{
           
            displayCodes(10); // method that print the code of the lesson;
            System.out.println(lines1); // print lines
            System.out.println(DesingText.ANSI_Blue + "The output is 120, do you think it’s true? (yes/no)"+ DesingText.ANSI_RESET);
            userAnsw = input.nextLine();
            correctAnsw = "yes";
            
            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! Yes, you’re right the answer is 120."+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }
            
            
        }while (!isCorrect);
    }// end of lesson6
    
    public void LessonSeven(){ //Lesson7 Polymorphism
        
        String correctAnsw;
        String userAnsw;
        boolean isCorrect = false;
        
        System.out.println(lines1); // print lines
        System.out.println("YOU ARE NOW IN PART SEVEN");
        System.out.println(lines1); // print lines
        System.out.println("Lesson 7:\nPolymorphism\n"
                + lines1 + "\n"
                + "Like we specified in the previous chapter; Inheritance lets us inherit attributes and methods\n"
                + "from another class. Polymorphism uses those methods to perform different tasks. This allows us \n"
                + "to perform a single action in different ways.\n\n"
                + "Polymorphism means \"many forms\", and it occurs when we have many classes that are related to\n"
                + "each other by inheritance.");

        System.out.println(lines1); // print lines
        System.out.println("Let's see an example of Polymorphism");
        displayCodes(11); // method that print the code of the lesson
        System.out.println(lines1); // print lines
        System.out.println("For example, think of a superclass called Animal that has a method called animalSound().\n"
                + "Subclasses of Animals could be Birds, Cats - And they also have their own\n"
                + "implementation of an animal sound (the cat meows, etc.)");
        System.out.println(lines1); // print lines
        System.out.println("Now, the lesson is done what about testing yourself?");
        do{
          
            System.out.println(DesingText.ANSI_Blue +"Q: Which among the following can’t be used for polymorphism? (a/b/c)\n"
                    + "(a) Member functions overloading\n"
                    + "(b) Static member functions\n"
                    + "(c) Predefined operator overloading"+ DesingText.ANSI_RESET);

            userAnsw = input.nextLine();
            correctAnsw = "b";
            
            if (userAnsw.equalsIgnoreCase(correctAnsw)) { // if the answer is correct
                System.out.println(DesingText.ANSI_Green+"Well done! The Correct Answer is Static member functions."+ DesingText.ANSI_RESET);
                isCorrect = true;
                countPointAdv++;
            } else { // answer is not correct
                innCorrectAnsw(); // calling to a method that displays the msg
                String choice = input.nextLine();
                isCorrect = choice.equalsIgnoreCase("e");
            }
            
            
        } while (!isCorrect);
    } // end of lesson7
            

    
    public void innCorrectAnsw(){ // method that print an "inncorect" message in case of a wrong answer
        
        String incorrectAnsw = "Do you want to Try again or Exit ?(t/e)\n(make sure you write it is in lowercase): ";
        System.out.println(DesingText.ANSI_Red+"Incorrect :( "+ incorrectAnsw + DesingText.ANSI_RESET);
        
    } //method that prints the msg of inncorect anserwr
    
    public void displayCodes(int code){ // method that print "codes" that are used dureing the lessons
        
        String code1 = "public class FirstStep {\n  int x = 5;\n}";
        String code2 = "public class FirstStep {\n"
                + "  int x = 5;\n"
                + "  \n"
                + "  public static void main(String[] args) {\n"
                + "    FirstStep Obj1 = new FirstStep();\n"
                + "    System.out.println(Obj1.x);\n"
                + "  }\n"
                + "}";

        String code3 = "public class FirstStep {\n"
                + "  int x = 5;\n"
                + "  public static void main(String[] args) {\n"
                + "    FirstStep Obj1 = new FirstStep();\n"
                + "    FirstStep Obj2 = new FirstStep();\n"
                + "    System.out.println(Obj1.x);\n"
                + "    System.out.println(Obj2.x);\n"
                + "  }\n"
                + "}";

       String code4 = "public class FirstStep {\n" +
               "  int x;\n" +
               "  \n" +
               "  public FirstStep() { // Note that name of constructor should match exactly the class name\n" +
               "    x = 1; // Set the initial value for the class attribute x\n" +
               "  }\n" +
               "}";

       String code5 = "public class FirstStep {\n" +
               "  int x;\n" +
               "  \n" +
               "  public FirstStep(int y) {\n" +
               "    x = y;\n" +
               "  }\n" +
               "  \n" +
               "  public static void main(String[] args) {\n" +
               "    FirstStep obj1 = new FirstStep(5);\n" +
               "    System.out.println(obj1.x);\n" +
               "  }\n" +
               "} // Output: 5";

       String code6 = "public class Main {\n" +
               "  String myGame;\n" +
               "  \n" +
               "  public Main(String game) {\n" +
               "    myGame = game;\n" +
               "  }\n" +
               "  \n" +
               "  public static void main(String[] args) {\n" +
               "    Main game = new Main(\"DigitalSteps\");\n" +
               "    System.out.println(\"My favorite Game is: \" + game.myGame);\n" +
               "  }\n" +
               "}";

       String code7 = "public class Person {\n" +
               "  private String name; // private = restricted access\n" +
               "  \n" +
               "  public String getName() {  // Getter\n" +
               "    return name;\n" +
               "  }\n" +
               "  \n" +
               "  public void setName(String newName) {  // Setter\n" +
               "    this.name = newName; // Note: The this keyword is used to refer to the current object.\n" +
               "  }\n" +
               "}";

       String code8 = "public class Main {\n" +
               "  public static void main(String[] args) {\n" +
               "    Person myObj = new Person();\n" +
               "    myObj.setName(\"John\"); // Set the value of the name variable to \"John\"\n" +
               "    System.out.println(myObj.getName());\n" +
               "  }\n" +
               "}";

       String code9 = "class Vehicle { // superclass\n" +
               "  protected String brand = \"Ford\"; // Vehicle attribute\n" +
               "  \n" +
               "  public void honk() { // Vehicle method\n" +
               "    System.out.println(\"Tuut, tuut!\");\n" +
               "  }\n" +
               "}\n" +
               "\n" +
               "class Car extends Vehicle { // subclass\n" +
               "  private String modelName = \"Mustang\"; // Car attribute\n" +
               "  \n" +
               "  public static void main(String[] args) {\n" +
               "    // Create a myCar object\n" +
               "    Car myCar = new Car();\n" +
               "    \n" +
               "    myCar.honk(); // Call the honk() method (from the Vehicle class) on the myCar object\n" +
               "    // Display the value of the brand attribute (from the Vehicle class) and the value of the modelName from the Car class\n" +
               "    System.out.println(myCar.brand + \" \" + myCar.modelName);\n" +
               "  }\n" +
               "}";

       String code10 = "class Vehicle {\n" +
                "  int maxSpeed = 120;\n" +
                "}\n" +
                "\n" +
                "class Car extends Vehicle {\n" +
                "  int maxSpeed = 180;\n" +
                "  \n" +
                "  void display() {\n" +
                "    System.out.println(\"Maximum Speed: \" + super.maxSpeed);\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "/* Driver program to test */\n" +
                "class Test {\n" +
                "  public static void main(String[] args) {\n" +
                "    Car small = new Car();\n" +
                "    small.display();\n" +
                "  }\n" +
                "}";

      String code11 = "class Animal {\n" +
                "  public void animalSound() {\n" +
                "    System.out.println(\"The animal makes a sound\");\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "class Cat extends Animal {\n" +
                "  public void animalSound() {\n" +
                "    System.out.println(\"The pig says: meow meow\");\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "class Dog extends Animal {\n" +
                "  public void animalSound() {\n" +
                "    System.out.println(\"The dog says: bow wow\");\n" +
                "  }\n" +
                "}\n" +
                "\n" +
                "class Main {\n" +
                "  public static void main(String[] args) {\n" +
                "    Animal myAnimal = new Animal();  // Create an Animal object\n" +
                "    Animal myCat = new Cat();  // Create a Cat object\n" +
                "    Animal myDog = new Dog();  // Create a Dog object\n" +
                "    myAnimal.animalSound();\n" +
                "    myCat.animalSound();\n" +
                "    myDog.animalSound();\n" +
                "  }\n" +
                "}";

       
       
       switch (code) {
           case 1:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND + code1+ DesingText.ANSI_RESET);
               break;
            case 2:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code2+ DesingText.ANSI_RESET);
               break;
            case 3:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code3+ DesingText.ANSI_RESET);
               break;
            case 4:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code4+ DesingText.ANSI_RESET);
               break;
            case 5:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code5+ DesingText.ANSI_RESET);
               break;
            case 6:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code6+ DesingText.ANSI_RESET);
               break;
            case 7:
                System.out.println(DesingText.ANSI_Purple_BACKGROUND+code7+ DesingText.ANSI_RESET);
                break;
            case 8:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code8+ DesingText.ANSI_RESET);
               break;
            case 9:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code9+ DesingText.ANSI_RESET);
               break;
            case 10:
                System.out.println(DesingText.ANSI_Purple_BACKGROUND+code10+ DesingText.ANSI_RESET);
                break;
            case 11:
               System.out.println(DesingText.ANSI_Purple_BACKGROUND+code11+ DesingText.ANSI_RESET);
               break;
       }
       
    } // method that display the codes for the lessons
    
    public int returnCountPointAdv(){ // to return the counter
        return countPointAdv;
    }
     
     
}
