/*
Nada Alrshidi
*/
package digitalsteps;



import java.io.*;
import java.util.Scanner;



public class Admin extends User {
    
    //number of admin
   public static int numberOfAdmin;
    
    //MOthod: 
    // Defult constracter with numberofadmin counter increment :  
     public Admin(){ 
     ++numberOfAdmin;
     }
      
      // its mothod to verfiy the accseptence of the user for game term and policy:
      public boolean AdminPolicy(){
          
      Scanner input= new Scanner(System.in);
      boolean choise =false;
       
        System.out.println(DesingText.ANSI_Cyan+" DigitalStep game Privacy and Policy conditions:\n"+
                "1.Account Management: Yuo must create and manage their own account with secure login credentials.\n"+
                "2.Content Management: You should have the ability to create, edit, and delete learning content, including lessons, exercises, quizzes, and tutorials.\n"+
                "3.Data Privacy: You must ensure the protection of user data and comply with applicable data privacy laws and regulations.\n"+
                "4.Fair Play: You should ensure that the game environment is fair and free from any form of cheating or unfair advantage.\n"+DesingText.ANSI_RESET);
   
        System.out.println("Do you agree to the term and policy of the DigitalStep Gmae? (Enter yes or No)"+DesingText.ANSI_Red+"\nIf you did not agree you will not be able to enter the game."+DesingText.ANSI_RESET);
       String answer=input.nextLine();
       
        //input valditaion loop to ensure the user enters a yes or no onlay: 
      while (true){
          
           if(answer.charAt(0)=='Y' ||answer.charAt(0) =='y'|| answer.charAt(0) =='N' ||answer.charAt(0) =='n') {
             break;
           
           }
           else{
               
                System.out.println(DesingText.ANSI_Red+"You have enterd wrong respond please enter yes or no"+DesingText.ANSI_RESET);
                
                 answer = input.nextLine();
        }

        }
      
       if(answer.charAt(0)=='Y' ||answer.charAt(0) =='y'){
      
       choise= true; 
      }
          
          
        if (answer.charAt(0)=='N' ||answer.charAt(0) =='n'){
           choise= false; 
        }
     
             
        return choise;
             
             

        
    }


    
            
    
}