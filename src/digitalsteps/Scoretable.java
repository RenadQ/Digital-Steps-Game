/*
 renad alkahtani 
here we going to creat a compitition between users (palyers) then creat a score table for them  
 */
package digitalsteps;
import java.io.*;
import java.util.*; 


public class Scoretable {
    
    public static double scoreOfPlayerFromCompetion = 0;
      
  /*in this modified code:

We create a character array playerAnswer to store the user's answers.

Inside the for loop, we prompt the user for the answer to each question and store it in the userInput string variable.

We then check if the userInput is already in lowercase by comparing it with its lowercase version using the equals() method. If the input is not in lowercase, we convert it to lowercase using the toLowerCase() method.

After ensuring that the input is lowercase, we store the first character of the userInput (which is guaranteed to be lowercase) in the playerAnswer array.

Finally, we print the player's answers by iterating over the playerAnswer array.*/
     
     public static double getTheAnswer (){
         
         char[] answerKey = {'c', 'd', 'b', 'c', 'a', 'd', 'b', 'c', 'a', 'a', 'c', 'b'};
        int[] playerAnswer = new int[12];
        char choice;
        int i = 1;
        Scanner scanner = new Scanner(System.in);
         
        
        do {
             int correctAnswer = 0, incorrectAnswer = 0;
            System.out.println(DesingText.ANSI_Blue_BACKGROUND + DesingText.ANSI_White + "       Round #" + (i)+ DesingText.ANSI_RESET);
            DigitalSteps.FileRead();
            System.out.println(DesingText.ANSI_RESET);
            for (int j = 0; j < 12; j++) {
                System.out.println("Answer of question number #" + (j + 1));
                String userInput = scanner.next();
                
                // Check if the user input is lowercase
                if (!userInput.equals(userInput.toLowerCase())) {
                    userInput = userInput.toLowerCase();
                }
                
                // Store the lowercase user input in the array
                playerAnswer[j] = userInput.charAt(0);
            }
            
            for (int j = 0; j < 12; j++) {
                if (playerAnswer[j] == answerKey[j]) {
                    correctAnswer++;
                } else {
                    incorrectAnswer++;
                }
            }
            
            System.out.println();
            System.out.println(DesingText.ANSI_Cyan_BACKGROUND+"You got " + correctAnswer + "correct answer(s) :)");
            System.out.println("You got " + incorrectAnswer + "incorrect answer(s) :("+DesingText.ANSI_RESET);
            System.out.println();
            
            scoreOfPlayerFromCompetion = (correctAnswer / 12.0) * 100.0;
            System.out.println(DesingText.ANSI_Green+"Average score: %" + scoreOfPlayerFromCompetion +DesingText.ANSI_RESET);
            
            System.out.println(DesingText.ANSI_Yellow_BACKGROUND+"Do you want to participate again? (y/n)"+DesingText.ANSI_RESET);
            choice = scanner.next().charAt(0);
            
            i++;
        } while (choice == 'y');
        
        return scoreOfPlayerFromCompetion;
        
        
       
    }
        
    }//close for class 

// here writing comment 
class FileWrite {
    public void writeCommentToFile(String comment, String filename) {
    try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
        writer.println(comment);
    } catch (IOException e) {
        System.out.println(DesingText.ANSI_Red+"Error writing to file: " + filename+DesingText.ANSI_RESET);
    }
}
}

class TableEntry {
    private int index;
    private String name;
    private double score;

    public TableEntry(int index, String name, double score) {
        this.index = index;
        this.name = name;
        this.score = score;
    }

    public int getIndex() {
        return index;
    }

    public String getName() {
        return name;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return String.format("%-6d%-12s%.2f", index, name, score);
    }
}

class Table {
    private List<TableEntry> entries;

    public Table() {
        entries = new ArrayList<>();
    }


    public void readFromFile(String filename) {
    try (Scanner scanner = new Scanner(new File(filename))) {
        // Skip the first line (column headers)
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] parts = line.split(",");
            if (parts.length >= 3) {
                try {
                    int index = Integer.parseInt(parts[0].trim());
                    String name = parts[1].trim();
                    double score = Double.parseDouble(parts[2].trim());
                    TableEntry entry = new TableEntry(index, name, score);
                    entries.add(entry);
                } catch (NumberFormatException e) {
                    // Handle the case when the value is not a valid number
                    System.out.println("Invalid number format in the file: " + line);
                }
            }
        }
    } catch (FileNotFoundException e) {
        System.out.println("File not found: " + filename);
    }
}

    public void printTable() {
        System.out.println(DesingText.ANSI_RED_BACKGROUND+DesingText.ANSI_White+"\n\n===== Worldwide Competition Score Table ====="+DesingText.ANSI_RESET);
        System.out.println("\n\nNumber  Name         Score");
        System.out.println("\n\n-------------------------");
        for (TableEntry entry : entries) {
            System.out.println(entry);
        }
        System.out.println("\n\n-------------------------");
    }

    public void updateTable(int index, double score) {
        boolean found = false;
        for (TableEntry entry : entries) {
            if (entry.getIndex() == index) {
                entry.setScore(score);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Entry not found with index: " + index);
        }
    }

    public void sortTableByScore() {
        Collections.sort(entries, Comparator.comparingDouble(TableEntry::getScore).reversed());
    }

    public void writeCommentToFile(String comment, String filename) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename, true))) {
            writer.println(comment);
        } catch (IOException e) {
            System.out.println("Error writing to file: " + filename);
        }
    }

    public void checkAndUpdateTopScores(double score, String playerName) {
        sortTableByScore();

        if (entries.size() < 10 || score > entries.get(entries.size() - 1).getScore()) {
            if (entries.size() >= 10) {
                entries.remove(entries.size() - 1);
            }
            TableEntry newEntry = new TableEntry(entries.size() + 1, playerName, score);
            entries.add(newEntry);
            sortTableByScore();
            System.out.println(DesingText.ANSI_Yellow_BACKGROUND+"Congratulations! Your score has entered the top 10."+DesingText.ANSI_RESET);
        } else {
            System.out.println(DesingText.ANSI_Red+"Sorry, your score is not in the top 10 :("+DesingText.ANSI_RESET);
        }
    }
}