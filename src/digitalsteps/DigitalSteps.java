/*
project name : digital steps 
team members :
 2220003572 Renad Alkhtani
 2220001911 Miad Alosaimi 
 2220000572 Nourah Alanzi
 2220000552 Nada alrashidi
 2220001372 Waad Alshammari
 2220001292 Wajood Al Jearah
 2230040060 Sarah Alhethily
 */
package digitalsteps;
import java.io.*;
import java.util.*; 

public class DigitalSteps {
 
    public static Scanner input = new Scanner(System.in);// input Scanner can see it any whare
   
 public static void main(String[] args) {
             
        ArrayList<Player> players = new ArrayList<>();
        ArrayList<Admin> admins = new ArrayList<>();
        
        //renad part object
        Scanner scanner = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        List<Quizz> quizzes = new ArrayList<>();
        Scanner scanner2 = new Scanner(System.in);
        //end of renad part
        boolean registeredUser = false;
        String continueChoice;

        System.out.println(DesingText.ANSI_Green + "*********************** Welcome to Digital Steps *********************** "+ DesingText.ANSI_RESET);

        do {
            
            System.out.println("\n\nDo you want to continue as a Player or an Admin? (1 for Player, 2 for Admin)");
            String choice = input.next();

            while (!choice.equals("1") && !choice.equals("2")) {
                System.out.println(DesingText.ANSI_Red + "You have entered a wrong response. Please enter 1 or 2"+ DesingText.ANSI_RESET);
                choice = input.next();
            }

            if (choice.equals("1")) {
                Player player = new Player();

                System.out.println("Do you have an account? (y/n)");
                input.nextLine();
                String answer = input.nextLine();

                if (inputValidation(answer)) {
                    System.out.println("Enter username");
                    String username = input.nextLine();

                    if (User.searchForAccount(players, username)) {
                        System.out.println("Account is found Welcome agine to DigitalSteps!");
                        registeredUser = true;   
                    }
                }

                if (!registeredUser) {
                    player.createAccount();
                    players.add(player);
                }

                if (player.playerPolicy()) {
                    player.aboutTheGame();
                    System.out.println("For security purposes, please sign in.");
                    System.out.println("Enter username");
                    String username = input.nextLine();
                    System.out.println("Enter password");
                    String password = input.nextLine();
                    player.Sign(username, password);
                    //start playing:
                      String choose;
        System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("Are you new to programming? (Yes/No):");
          String isNewToProgramming ;
          
            System.out.println(DesingText.ANSI_Cyan_BACKGROUND+"Are you new to programming? (yes/no):"+DesingText.ANSI_RESET);
            isNewToProgramming = input.nextLine();
            boolean isValidInput = false;
     while (!isValidInput) {
    System.out.println(DesingText.ANSI_Cyan_BACKGROUND + "Are you new to programming? (Yes/No):" + DesingText.ANSI_RESET);
    isNewToProgramming = input.nextLine();

    if (isNewToProgramming.equalsIgnoreCase("Yes") || isNewToProgramming.equalsIgnoreCase("Y") || isNewToProgramming.equalsIgnoreCase("y")) {
        Quiz.programingBasic();
        isValidInput = true;
    } else if (isNewToProgramming.equalsIgnoreCase("No") || isNewToProgramming.equalsIgnoreCase("N") || isNewToProgramming.equalsIgnoreCase("n")) {
        // Handle the case when the user is not new to programming
        isValidInput = true;
    } else {
        System.out.println(DesingText.ANSI_Red + "Invalid input. Please enter 'Yes' or 'No'." + DesingText.ANSI_RESET);
    }
}
           
                  
        System.out.println("Do you want to take a quiz Or choose your level(Q/C):");
        choose= input.nextLine();
        if(choose.equalsIgnoreCase("Q")||choose.equalsIgnoreCase("q")){
            Quiz quiz;
            quiz = new Quiz();
            quiz.startQuiz();
            quiz.displayResult();
            int score = quiz.QplayerDdegree[0];
            if (score >= 1 && score <= 3) {
                System.out.println("Your Level is Beginner"+"\nLet's Start!");
                Beginner beginner = new Beginner();
                beginner.training();
                int pointBeg = beginner.getCountPointBeg();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your point: "+ pointBeg);
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                if (pointBeg >= 8) {
                    BeginnerQuiz beginnerQ = new BeginnerQuiz();
                    beginnerQ.takeQuiz();

                    int pointBeg1 = beginnerQ.getCountPointBeg();
                    System.out.println("Your Score for the beginner level test:"+ pointBeg1);
                } else {
                    System.out.println("You need at least 8 points to take the beginner test.");
                    String replayChoice;
                    do {
                        System.out.println("Do you want to replay the quiz? (Y/N)");
                        replayChoice = input.nextLine().toUpperCase();

                        if (replayChoice.equalsIgnoreCase("Y")) {
                            BeginnerQuiz beginnerQ = new BeginnerQuiz();
                            beginnerQ.takeQuiz();

                            int pointBeg1 = beginnerQ.getCountPointBeg();
                            System.out.println("Your Score for the beginner level test: " + pointBeg1);
                        }
                    } while (replayChoice.equalsIgnoreCase("Y"));
                }

            } else if (score >= 4 && score <= 6) {
                System.out.println("Your Level is Intermediate"+"\nLet's Start!");
                Intermediate intermediate = new Intermediate();
                intermediate.training();
                int pointBeg2 = intermediate.getCountPointBeg();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your point: "+ pointBeg2);
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                if (pointBeg2 >= 8) {
                    IntermediateQuiz IntermediateQ = new IntermediateQuiz();
                    IntermediateQ.takeQuiz2();
                    int pointBeg4 = IntermediateQ.getCountPointBeg();
                    System.out.println("Your Score for the beginner level test:"+ pointBeg4);
                } else {
                    System.out.println("You need at least 8 points to take the beginner test.");
                    String replayChoice;
                    do {
                        System.out.println("Do you want to replay the quiz? (Y/N)");
                        replayChoice = input.nextLine().toUpperCase();

                        if (replayChoice.equalsIgnoreCase("Y")) {
                            IntermediateQuiz intermediateQ = new IntermediateQuiz();
                            intermediateQ.takeQuiz2();

                            int pointBeg4 = intermediateQ.getCountPointBeg();
                            System.out.println("Your Score for the intermediate level test: " + pointBeg4);
                        }
                    } while (replayChoice.equalsIgnoreCase("Y"));
                }
            } else if (score >= 7 && score <= 9) { // wajood
                System.out.println("Advance Class Level");
                Advance advance = new Advance();
                advance.training();

            } else {
                System.out.println("There is Error");
            }

            Quiz.programingBasic();

        }
        else if(choose.equalsIgnoreCase("C")||choose.equalsIgnoreCase("c")){
            System.out.println("Is your level: Beginner, Intermediate, Advance. (B,I,A)");
            choose= input.nextLine();
            if(choose.equalsIgnoreCase("B")||choose.equalsIgnoreCase("b")){
                Beginner beginner = new Beginner();
                beginner.training();
                int pointBeg = beginner.getCountPointBeg();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your point: "+ pointBeg);
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                if (pointBeg >= 8) {
                    BeginnerQuiz beginnerQ = new BeginnerQuiz();
                    beginnerQ.takeQuiz();

                    int pointBeg1 = beginnerQ.getCountPointBeg();
                    System.out.println("Your Score for the beginner level test:"+ pointBeg1);
                } else {
                    System.out.println("You need at least 8 points to take the beginner test.");
                    String replayChoice;
                    do {
                        System.out.println("Do you want to replay the quiz? (Y/N)");
                        replayChoice = input.nextLine().toUpperCase();

                        if (replayChoice.equalsIgnoreCase("Y")) {
                            BeginnerQuiz beginnerQ = new BeginnerQuiz();
                            beginnerQ.takeQuiz();

                            int pointBeg1 = beginnerQ.getCountPointBeg();
                            System.out.println("Your Score for the beginner level test: " + pointBeg1);
                        }
                    } while (replayChoice.equalsIgnoreCase("Y"));
                }

            } else if (choose.equalsIgnoreCase("I")||choose.equalsIgnoreCase("i")) {
                Intermediate intermediate = new Intermediate();
                intermediate.training();
                int pointBeg2 = intermediate.getCountPointBeg();
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("Your point: "+ pointBeg2);
                System.out.println("\n----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                if (pointBeg2 >= 8) {
                    IntermediateQuiz IntermediateQ = new IntermediateQuiz();
                    IntermediateQ.takeQuiz2();
                    int pointBeg4 = IntermediateQ.getCountPointBeg();
                    System.out.println("Your Score for the beginner level test:"+ pointBeg4);
                } else {
                    System.out.println("You need at least 8 points to take the beginner test.");
                    String replayChoice;
                    do {
                        System.out.println("Do you want to replay the quiz? (Y/N)");
                        replayChoice = input.nextLine().toUpperCase();

                        if (replayChoice.equalsIgnoreCase("Y")) {
                            IntermediateQuiz intermediateQ = new IntermediateQuiz();
                            intermediateQ.takeQuiz2();

                            int pointBeg4 = intermediateQ.getCountPointBeg();
                            System.out.println("Your Score for the intermediate level test: " + pointBeg4);
                        }
                    } while (replayChoice.equalsIgnoreCase("Y"));
                }

            } else if (choose.equalsIgnoreCase("A")||choose.equalsIgnoreCase("a")) {
                Advance advance = new Advance();
                advance.training();
            }
            

            else
                System.out.println("Error");
        }
        else
            System.out.println("Error");




    }
                
                
                else {
                    System.out.println("Sorry You can't play.");
                }
                
        }
        
        //*******************************************************************************************************************
        
        
        
            //Admin start here:
            else {
                Admin admin = new Admin();

                System.out.println("Do you have an account? (y/n)");
                input.nextLine();
                String answer = input.nextLine();
                 
                if (inputValidation(answer)) {
                    System.out.println("Enter username");
                    String username = input.nextLine();
                
                    if (User.searchForAccount(admins, username)) {
                        System.out.println("Account is found Welcome agine to DigitalSteps!");
                        registeredUser = true;
                    }
                }

                if (!registeredUser) {
                    admin.createAccount();
                    admins.add(admin);
                }

                if (admin.AdminPolicy()) {
                   
                    System.out.println("For security purposes, please sign in.");
                    System.out.println("Enter username");
                    String username = input.nextLine();
                    System.out.println("Enter password");
                    String password = input.nextLine();
                    admin.Sign(username, password);
                    //renad start here for admine 
                    System.out.println("Welcome to the Quiz System!"+"\n"+"Whether you're a teacher or a student, our platform allows you to easily create and participate in quizzes to test your knowledge."+"\n"+"As a teacher, you have the flexibility to design custom quizzes tailored to your students' learning objectives."+"\n"+"  Start creating your quizzes today and unlock the potential of knowledge evaluation in a fun and interactive way. "+"\n"+"Would you like to enter the Quiz system? (y/n)");
       char quizSystemEnter;

do {
    quizSystemEnter = scanner.next().charAt(0);
    
    if (quizSystemEnter != 'y' && quizSystemEnter != 'Y' && quizSystemEnter != 'n' && quizSystemEnter != 'N') {
        System.out.println(DesingText.ANSI_Red+"Invalid input. Please enter 'y' or 'n'."+DesingText.ANSI_RESET);
    }
} while (quizSystemEnter != 'y' && quizSystemEnter != 'Y' && quizSystemEnter != 'n' && quizSystemEnter != 'N');

if (quizSystemEnter == 'y' || quizSystemEnter == 'Y'){  
        
         while (true) {
            System.out.println(DesingText.ANSI_Purple_BACKGROUND+DesingText.ANSI_White+"===== Quiz System ====="+DesingText.ANSI_RESET);
            System.out.println(DesingText.ANSI_Purple+"1. Administrator");
            System.out.println("2. Student");
            System.out.println("3. Exit"+DesingText.ANSI_RESET);
            System.out.print("Enter your choice: ");
            int choiceForQuizSystem;
            try {
            choiceForQuizSystem = scanner.nextInt(); // Error handling added for choice input
        } catch (InputMismatchException e) {
            scanner.nextLine(); // Consume the invalid input
            System.out.println(DesingText.ANSI_Red+"Invalid choice. Please enter a number."+DesingText.ANSI_RESET);
            continue;
        }
        scanner.nextLine(); // Consume newline character


            if (choiceForQuizSystem == 1) {
                System.out.println(DesingText.ANSI_Blue+"----------- welcome "+username +"-----------"+DesingText.ANSI_RESET);
                System.out.println(DesingText.ANSI_White+DesingText.ANSI_Blue_BACKGROUND+"===== Administrator Menu ====="+DesingText.ANSI_RESET);
                System.out.println(DesingText.ANSI_Blue+"1. Create Quiz");
                System.out.println("2. View Student Progress");
                System.out.println("3. Exit"+DesingText.ANSI_RESET);
                System.out.print("Enter your choice: ");
                 int adminChoice;
            try {
                adminChoice = scanner.nextInt(); // Error handling added for adminChoice input
            } catch (InputMismatchException e) {
                scanner.nextLine(); // Consume the invalid input
                System.out.println(DesingText.ANSI_Red+"Invalid choice. Please enter a number."+DesingText.ANSI_RESET);
                continue;
            }
            scanner.nextLine(); // Consume newline character

                if (adminChoice == 1) {
                    do{
                    System.out.print(DesingText.ANSI_Yellow_BACKGROUND+"Enter the name of the quiz: "+DesingText.ANSI_RESET);
                    String quizName = scanner.nextLine();

                    Quizz quiz = new Quizz(quizName);

                    System.out.print(DesingText.ANSI_Yellow_BACKGROUND+"Enter the number of questions: "+DesingText.ANSI_RESET);
                    int numQuestions;
                    try {
                        numQuestions = scanner.nextInt(); // Error handling added for numQuestions input
                    } catch (InputMismatchException e) {
                        scanner.nextLine(); // Consume the invalid input
                        System.out.println(DesingText.ANSI_Red+"Invalid input. Please enter a number."+DesingText.ANSI_RESET);
                        continue;
                    }
                    scanner.nextLine(); // Consume newline character

                    for (int i = 0; i < numQuestions; i++) {
                        System.out.print("Enter question " + (i + 1) + ": ");
                        String question = scanner.nextLine();

                        List<String> options = new ArrayList<>();
                        for (int j = 0; j < 4; j++) {
                            System.out.print("Enter option " + (j + 1) + ": ");
                            String option = scanner.nextLine();
                            options.add(option);
                        }

                        System.out.print("Enter the answer (1-4): ");
                         int answerForQuizSystem;
                        try {
                            answerForQuizSystem = scanner.nextInt(); // Error handling added for answer input
                        } catch (InputMismatchException e) {
                            scanner.nextLine(); // Consume the invalid input
                            System.out.println(DesingText.ANSI_Red+"Invalid input. Please enter a number."+DesingText.ANSI_RESET);
                            continue;
                        }
                        scanner.nextLine(); // Consume newline character
                        quiz.addQuestion(question, options, answerForQuizSystem);
                    }

                    quizzes.add(quiz);
                    System.out.println("Quiz created successfully.");
                        System.out.println("do you want to create another quiz ?(y/n)");
                       quizSystemEnter = scanner.nextLine().charAt(0);
                    }while(quizSystemEnter == 'y'|| quizSystemEnter == 'Y');//loop to let admine create new one 
                
                } else if (adminChoice == 2) {
                    System.out.println(DesingText.ANSI_Blue);
                    System.out.println("===== Student Progress =====");
                    System.out.println("1. View All Students");
                    System.out.println("2. View Specific Student");
                    System.out.print("Enter your choice: "+DesingText.ANSI_RESET);
                     int progressChoice;
                try {
                    progressChoice = scanner.nextInt(); // Error handling added for progressChoice input
                } catch (InputMismatchException e) {
                    scanner.nextLine(); // Consume the invalid input
                    System.out.println(DesingText.ANSI_Red+"Invalid choice. Please enter a number."+DesingText.ANSI_RESET);
                    continue;
                }
                scanner.nextLine(); // Consume newline character

                    if (progressChoice == 1) {
                        System.out.println(DesingText.ANSI_Purple_BACKGROUND+DesingText.ANSI_White+"===== All Students Progress ====="+DesingText.ANSI_RESET);
                        for (Student student : students) {
                            System.out.println(DesingText.ANSI_Purple);
                            student.printReport();
                            System.out.println("--------------------");
                        }
                        System.out.println(DesingText.ANSI_RESET);
                    } else if (progressChoice == 2) {
                        System.out.print("Enter the name of the student: ");
                        String studentName = scanner.nextLine();

                        boolean found = false;
                        for (Student student : students) {
                            if (student.getName().equalsIgnoreCase(studentName)) {
                                student.printReport();
                                found = true;
                                break;
                            }
                        }

                        if (!found) {
                            System.out.println(DesingText.ANSI_Red+"Student not found."+DesingText.ANSI_RESET);
                        }
                    }
                } else if (adminChoice == 3) {
                   System.out.println(DesingText.ANSI_Red+"Exiting..."+DesingText.ANSI_RESET);
                 System.out.println(DesingText.ANSI_RED_BACKGROUND+DesingText.ANSI_White_BACKGROUND+"you been exite from Quiz System succsefully "+DesingText.ANSI_RESET);
                break;
                } else {
                    System.out.println(DesingText.ANSI_Red+"Invalid choice. Please try again."+DesingText.ANSI_RESET);
                }
            } //end of admine of Quiz System 
            else if (choiceForQuizSystem == 2) {
                System.out.print("Enter your name: ");
                String studentName = scanner.nextLine();

                boolean existingStudent = false;
                Student currentStudent = null;
                for (Student student : students) {
                    if (student.getName().equalsIgnoreCase(studentName)) {
                        existingStudent = true;
                        currentStudent = student;
                        break;
                    }
                }

                if (existingStudent) {
                    System.out.println("Welcome back, " + studentName + "!");
                    System.out.println(DesingText.ANSI_Green+"Your current score: " + currentStudent.getScore()+DesingText.ANSI_RESET);
                    System.out.println("You can only answer quizzes and view your own score.");
                    System.out.println("--------------------");

                    System.out.println(DesingText.ANSI_Blue_BACKGROUND+DesingText.ANSI_White+"Available Quizzes: "+DesingText.ANSI_RESET);
                    for (Quizz quiz : quizzes) {
                        System.out.println(DesingText.ANSI_Blue+"\n- " + quiz.getName());
                    }

                    System.out.print("Enter the name of the quiz you want to take: ");
                    String quizName = scanner.nextLine();

                    boolean foundQuiz = false;
                    for (Quizz quiz : quizzes) {
                        if (quiz.getName().equalsIgnoreCase(quizName)) {
                            quiz.takeQuiz(currentStudent);
                            foundQuiz = true;
                            break;
                        }
                    }

                    if (!foundQuiz) {
                        System.out.println(DesingText.ANSI_Red+"Quiz not found."+DesingText.ANSI_RESET);
                    }
                } else {
                    Student newStudent = new Student(studentName);
                    students.add(newStudent);

                    System.out.println(DesingText.ANSI_Purple+"Welcome, " + studentName + "!"+DesingText.ANSI_RESET);
                    System.out.println("You are a new student. Please take a quiz to get started.");
                    System.out.println("--------------------");

                    System.out.println(DesingText.ANSI_Blue_BACKGROUND+DesingText.ANSI_White+"Available Quizzes: "+DesingText.ANSI_RESET);
                    for (Quizz quiz : quizzes) {
                        System.out.println(DesingText.ANSI_Blue+"- " + quiz.getName()+DesingText.ANSI_RESET);
                    }

                    System.out.print("Enter the name of the quiz you want to take: ");
                    String quizName = scanner.nextLine();

                     
                boolean foundQuiz = false;
                while (!foundQuiz) {
                for (Quizz quiz : quizzes) {
                if (quiz.getName().equalsIgnoreCase(quizName)) {
                quiz.takeQuiz(newStudent);
                foundQuiz = true;
                break;
                }
                }

                 if (!foundQuiz) {
                System.out.println(DesingText.ANSI_Red+"Quiz not found."+DesingText.ANSI_RESET);
                System.out.println("Please enter the name of the quiz:");
                quizName = scanner.nextLine();
                }
                }

                      
                    
                    
                }
            } //end of student of Quiz System 
            else if (choiceForQuizSystem == 3) {
                System.out.println(DesingText.ANSI_Red+"Exiting..."+DesingText.ANSI_RESET);
                 System.out.println(DesingText.ANSI_RED_BACKGROUND+DesingText.ANSI_White_BACKGROUND+"you been exite from Quiz System succsefully "+DesingText.ANSI_RESET);
                break;
            } else {
                System.out.println(DesingText.ANSI_Red+"Invalid choice. Please try again."+DesingText.ANSI_RESET);
            }
        }}//end of quiz system 
                    //end renad part
                } 
                else {
                    System.out.println("Sorry, you cannot access as an admin.");}
          }

            System.out.println(DesingText.ANSI_Blue+"\n\nDo you want to continue playing in Digital Steps? (enter y/n)"+DesingText.ANSI_RESET);
            continueChoice = input.nextLine();
        } while (continueChoice.charAt(0) == 'Y' || continueChoice.charAt(0) == 'y');
        //renad part
        /* scoreetable compitition 
         first read from file the quistion 
         then calclute score 
         after that read from file called table ptint score table and add new score 
       */
         System.out.println("Do you want to enter word wide competion ? (y/n)");
         String requset = input.nextLine();
         //httt
         if(inputValidation (requset)){
             if(requset.charAt(0) == 'Y' || requset.charAt(0) == 'y')
           Scoretable.getTheAnswer();
        
    // Assuming you have a variable called ScoreForPlayerRenad that holds the score
        double ScoreForPlayerOfCompInTable = Scoretable.scoreOfPlayerFromCompetion;

        System.out.print(DesingText.ANSI_White+DesingText.ANSI_Blue_BACKGROUND+"Enter player name: "+DesingText.ANSI_RESET);
        String playerName = scanner2.nextLine();
        Table scoreTable = new Table();
        
        scoreTable.readFromFile("data.txt");
        // Print the initial table
        scoreTable.printTable();
        // Check if the score can enter the top 10
        scoreTable.checkAndUpdateTopScores(ScoreForPlayerOfCompInTable, playerName);
        System.out.println("");
        
                
        System.out.println("# Updated Score Table : ");
        System.out.println("");
        // Print the updated table
        scoreTable.printTable();
             
         }
        
        Table table = new Table();
        //writing to file for leaving feadback
        Scanner writeToFile = new Scanner(System.in);
        System.out.print(DesingText.ANSI_Cyan_BACKGROUND+"Enter a comment to leave for evreyone : "+DesingText.ANSI_RESET);
        System.out.println(DesingText.ANSI_Blue);
        String comment = writeToFile.nextLine();
        table.writeCommentToFile(comment, "score.txt");
         
         System.out.println(DesingText.ANSI_Cyan_BACKGROUND+"Thank you for your participation in our Digital Steps game. We appreciate your contribution and support. "+DesingText.ANSI_RESET);
        


    }//end of main class
`
        
         

    public static boolean inputValidation(String answer) {
        while (!answer.equalsIgnoreCase("y") && !answer.equalsIgnoreCase("n")) {
            System.out.println(DesingText.ANSI_Red + "You have entered a wrong response. Please enter 'y' or 'n'"+DesingText.ANSI_RESET);
            answer = input.nextLine();
        }

        return answer.equalsIgnoreCase("y");
    }

   
    //Norah Alanzi- method for reding from diffrint file by passing the file name to the  method prameter
    //overlaoding mothed
    public static void FileRead(String fileName) {

        try {

            // Open the file that is the first
            // command line parameter
            FileInputStream fstream = new FileInputStream(fileName);
            // Get the object of DataInputStream
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String strLine;
            //Read File Line By Line
            while ((strLine = br.readLine()) != null) {
                // Print the content on the console
                System.out.println(strLine);
            }
            //Close the input stream
            in.close();
        } catch (Exception e) {//Catch exception if any
            System.err.println(DesingText.ANSI_Red+"Error: " + e.getMessage()+DesingText.ANSI_RESET);
        }


  }     
        
        //renad   
   public static void FileRead (){
       
     try{
  // Open the file that is the first 
  // command line parameter
  FileInputStream fstream = new FileInputStream("textfilemcq.txt");
  // Get the object of DataInputStream
  DataInputStream in = new DataInputStream(fstream);
  BufferedReader br = new BufferedReader(new InputStreamReader(in));
  String strLine;
  //Read File Line By Line
  while ((strLine = br.readLine()) != null)   {
  // Print the content on the console
  System.out.println (DesingText.ANSI_Blue + strLine);
  }
  //Close the input stream
  in.close();
    }catch (Exception e){//Catch exception if any
  System.err.println(DesingText.ANSI_Red+"Error: " + e.getMessage()+DesingText.ANSI_RESET);
 }     
        
        
}   
}    
        
        
        
        
        
        
        
        
        
        
        
  



        