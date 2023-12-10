package digitalsteps;


import java.util.*;

public class Quiz{
    private int countPointBeg;

    public Quiz() {
        countPointBeg = 0;
    }


    public int getCountPointBeg() {
        return countPointBeg;
    }

    public String[] Qplayername;
    public int[] QplayerDdegree;
    public String[] questions;
    public String[][] options;
    public int[] correctAnswers;

    public Quiz(String[] Qplayername, int[] QplayerDdegree) {
        int QplayernameSize = Qplayername.length;
        int QplayerDdegreeSize = QplayerDdegree.length;

        if (QplayernameSize > 0) {
            this.Qplayername = new String[QplayernameSize];
            System.arraycopy(Qplayername, 0, this.Qplayername, 0, QplayernameSize);
        }

        if (QplayerDdegreeSize > 0) {
            this.QplayerDdegree = new int[QplayerDdegreeSize];
            System.arraycopy(QplayerDdegree, 0, this.QplayerDdegree, 0, QplayerDdegreeSize);

        }
    }

    public double levelQuiz() {
        return 0.0;
    }

    public double calculateScore(int correct, int total) {
        return correct * total;
    }

    public void displayResult() {
        System.out.println("Quiz Result:");
        System.out.println("Player: " + Qplayername[0]);
        System.out.println("Score: " + QplayerDdegree[0] + "/" + questions.length);
        System.out.println();
    }

    public void startQuiz() {
        String playerName = "Player 1";

        questions = new String[]{
                "Why do we use constructors?",
                "Which access modifier restricts visibility to the class in which the member is declared?",
                "Which of the following options is a valid Java identifier?",
                "Which of the following options is a non-primitive data type in Java?",
                "Which among the following can’t be used for polymorphism?",
                "If the condition of an IF-statement is false, which is true below.",
            "The __ loop is used to execute a block of code at least once, and then repeatedly execute it as long as a certain condition is true.",
                "Which of the following is the correct way to declare an array ?" ,
                 "What is a method in Java?"};

        options = new String[][]{
                {"to call an object.", "to initialize objects.", "to create an object."},
                {"private", "protected", "public"},
                {"123identifier", "_myIdentifier", "$identifier@"},
                {"Float", "Integer", "String"},
                {"Member functions overloading", "Static member functions", "Predefined operator overloading"},
                {"IF block is executed", "ELSE block is executed", "Both IF and ELSE blocks are executed"},
                {"do-while", "while" , "for" },
            {"arrayName = new int[];" , "int arrayName[];" , "int[] arrayName;"},
{ " A variable that holds data." , "A reusable block of code that performs a specific task.", "A conditional statement used for decision making."}};

        correctAnswers = new int[]{1, 0,1,2,1,1,0,2,1};
        Scanner scanner = new Scanner(System.in);
        int numQuestions = questions.length;
        int numOptions = options[0].length;

        int[] playerChoices = new int[1];
        int[] scores = new int[1];

        for (int i = 0; i < numQuestions; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i]);
            for (int j = 0; j < numOptions; j++) {
                System.out.println((char) ('A' + j) + "- " + options[i][j]);
            }
            System.out.print("Enter your choice (A, B, C): ");

            char choice = Character.toUpperCase(scanner.next().charAt(0));

            int choiceIndex = choice - 'A';
            playerChoices[0] = choiceIndex;

            if (playerChoices[0] == correctAnswers[i]) {
                scores[0]++;
            }
        }

        Qplayername = new String[]{playerName};
        QplayerDdegree = scores;

        displayResult();
    }
    // Norah Alanzi- this method display the basic programing topics for the user in form of text and mind map using reading from file
    public static void programingBasic (){

        Scanner enter = new Scanner (System.in);
        // varible string to print a line
        String line ="----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------";
        int select;// varible to store the user selected topic number
        int continu ;// varible to store the user answer if he/she want to continue or not
        // the execation starts from here
        do {
            //menue for the learning topics
            System.out.println(DesingText.ANSI_Cyan_BACKGROUND +"Please choose what you want to learn:\n" +DesingText.ANSI_RESET+
"                         \n" +
"                         1. What is Progarming ?\n" +
"                         2.How can i design a program?\n" +
"                         3.What is the Levels of Programing Languge? \n" +
"                         4.Famous Programing languages\n" +
"                         5.what is the type of Eroor in programming?"
                         );
            select=enter.nextInt();
            // input valdition to ensure the user select a number from the menue onlay
            while (true){

                if(select==1 ||select==2 || select==3||select==4||select==5) {
                    break;

                }
                else{
                    System.out.println(DesingText.ANSI_Red+"You have enterd wrong choise, please Enter (1 or 2 or 3 or 4 or 5)"+DesingText.ANSI_RESET);
                    select=enter.nextInt();
                }}

            // switch to print the learning topics content
            switch (select){
                case 1:
                    System.out.println("Programming is the process of creating instructions that tell computers what to do. It involves writing code using programming languages like Python or Java. \n" +
"                                 Programming allows us to solve problems, automate tasks, and build software applications. \n" +
"                                 It requires logical thinking, problem-solving skills, and creativity."
                                 );
                    break;
                case 2:
                    // calling method to print the learning content from a file
                    DigitalSteps.FileRead("Disign.txt");

                    break;
                case 3:
                    // calling method to print the learning content from a file
                   DigitalSteps.FileRead("PRlevel.txt");
                    break;
                case 4:
                    System.out.println("\n"+line+"\n"+"1.Paython: "+"\n"+"Python is a popular, high-level programming language known for its simplicity, readability, and versatility. "
                            +"\n"+"It is widely used for web development, data analysis, machine learning, and automation, thanks to its easy syntax and extensive library support.");
                    System.out.println("\n"+line+"\n"+"2.Java: "+"\n"+"Java is a popular, object-oriented programming language known for its platform independence. It is used for developing web, enterprise, mobile, and embedded applications. Java's \"write once, run anywhere\" principle enables cross-device compatibility. "
                            +"\n"+ "It has a vast ecosystem of libraries and frameworks, and emphasizes robustness, performance, and security.");
                    System.out.println("\n"+line+"\n"+"3.C++: "+"\n"+"C++ is a powerful, versatile programming language known for its efficiency and close-to-the-hardware control. It supports both procedural and object-oriented programming, making it suitable for various applications."
                            + "\n"+" With a large community and extensive libraries, C++ is favored for performance-critical tasks and system-level programming.");
                    break;
                case 5:
                    // calling method to print the learning content from a file
                    DigitalSteps.FileRead("ErrorType.txt");

                    System.out.println("the context of programming, an error refers to an unexpected or incorrect behavior that occurs during the execution of a program."+"\n"+"Errors can prevent the program from running properly or producing the desired results."+"\n"+"Understanding and addressing errors is an essential part of the debugging and troubleshooting process." );


                    break;




            }
            // the user answer for this question is loop contoling varible, if the answe was 1 it will repeat otherwise wiil exit
            System.out.println("Enter 1 if you want to learn somthing elase, and 0 if you wan to exit");
            continu=enter.nextInt();

        }
        while (continu==1);
        System.out.println(DesingText.ANSI_Blue+"I hope the informatins was helpfull for you (: \n" +
"                          We are excited to see you in the next stage of DigitalStep!!!! "+DesingText.ANSI_RESET);
    }
    //Norah Alanzi- method for reding from diffrint file by passing the file name to the  method prameter
   
    public void incrementCount() {
        countPointBeg++;
    }


}
