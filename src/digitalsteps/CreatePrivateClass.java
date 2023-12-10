/*
 Renad alkahtani 
this two classes is to create a quiz system 
 */
package digitalsteps;
import java.util.*;

class Student{
   
    private String name;
    private int score;
    private List<String> quizNames;
    private List<Integer> quizScores;

    public Student (String name) {
        this.name = name;
        this.score = 0;
        this.quizNames = new ArrayList<>();
        this.quizScores = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public void addQuizScore(String quizName, int score) {
        quizNames.add(quizName);
        quizScores.add(score);
        this.score += score;
    }

    public void printReport() {
        System.out.println(DesingText.ANSI_Purple_BACKGROUND+DesingText.ANSI_White+"Report for " + name + ":"+DesingText.ANSI_RESET);
        for (int i = 0; i < quizNames.size(); i++) {
            String quizName = quizNames.get(i);
            int score = quizScores.get(i);
            System.out.println(DesingText.ANSI_Purple+"Quiz: " + quizName);
            System.out.println("Score: " + score);
            System.out.println();
        }
        System.out.println("Total Score: " + score+DesingText.ANSI_RESET);
    }
}//end of class

class Quizz {
    private String name;
    private List<String> questions;
    private List<List<String>> options;
    private List<Integer> answers;

    public Quizz(String name) {
        this.name = name;
        this.questions = new ArrayList<>();
        this.options = new ArrayList<>();
        this.answers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addQuestion(String question, List<String> options, int answer) {
        questions.add(question);
        this.options.add(options);
        answers.add(answer);
    }

    public void takeQuiz(Student student) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("----- " + name + " Quiz -----");

        // Check if student has already taken the quiz
        if (student.getScore() > 0) {
            System.out.println(DesingText.ANSI_Red+"You have already taken this quiz."+DesingText.ANSI_RESET);
            return;
        }

        int totalScore = 0;
        int numQuestions = questions.size();

        // Display and process each question
        for (int i = 0; i < numQuestions; i++) {
            System.out.println("\nQuestion " + (i + 1) + ":");
            System.out.println(questions.get(i));

            List<String> currentOptions = options.get(i);
            for (int j = 0; j < currentOptions.size(); j++) {
                System.out.println((j + 1) + ") " + currentOptions.get(j));
            }

           System.out.print("Enter your answer (1-" + currentOptions.size() + "), or 's' to skip, or 'b' to go back: ");
           String input = scanner.nextLine();


           if (input.equals("s")) {
               System.out.println("Question skipped.");
           } else if (input.equals("b")) {
               if (i > 0) {
                   System.out.println("Going back to the previous question.");
                   i -= 2;
               } else {
                   System.out.println("Cannot go back. This is the first question.");
                 i--;
                }
            } else {
               int answer;
               try {
                 answer = Integer.parseInt(input);
               } catch (NumberFormatException e) {
                    System.out.println("Invalid input. Question skipped.");
                   continue;
                }

                if (answer >= 1 && answer <= currentOptions.size()) {
                  if (answer == answers.get(i)) {
                        System.out.println("Correct answer!");
                     totalScore++;
                   } else {
                     System.out.println("Wrong answer!");
                 }
                } else {
                    System.out.println("Invalid input. Question skipped.");
                    continue;
                }
            }
        }

        // Calculate score and store it in the student object
        int score = (int) ((totalScore / (double) numQuestions) * 100);
        student.addQuizScore(name, score);

        // Prompt for quiz submission if not all questions were answered
        if (totalScore < numQuestions) {
         System.out.print(DesingText.ANSI_Cyan_BACKGROUND+"\nYou have not answered all the questions. Do you want to submit the quiz? (y/n): "+DesingText.ANSI_RESET);
        String input = scanner.nextLine();
            if (input.equalsIgnoreCase("y")) {
                System.out.println("Quiz submitted successfully.");
            } else {
                System.out.println("Quiz not submitted.");
                student.addQuizScore(name, 0); // Set score to 0 if quiz is not submitted
            }
        } else {
          System.out.println("\nQuiz submitted successfully.");
       }
   }
}
