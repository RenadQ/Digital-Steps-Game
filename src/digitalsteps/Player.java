/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package digitalsteps;
import java.io.*;
import java.util.Scanner ;
/**
 *
 * @author Huawei
 */
public class Player extends User{
   
    //This attribute  is counter for the number of players
    public static int numberOfPlayer = 0;

    //Default constructor with numberOfPlayer counter increment.
    public Player() {
        numberOfPlayer++;
    }

  

    // This method verifies the acceptance of the user for game term and policy with input validation on user answer
    public boolean playerPolicy() {
        Scanner input = new Scanner(System.in);
        boolean choise = false;

        //policy and privcy condition":
        System.out.println(DesingText.ANSI_Cyan + "DigitalStep game Privacy and Policy conditions: " + "\n" + "1.Fair Play: You should engage in the game without resorting to cheating, hacking, or any other unfair practices."
                + "\n" + "2.Respectful Behavior: You must treat other players and Admin with respect and refrain from engaging in any form of harassment, discrimination, or offensive behavior."
                + "\n" + "3.Data Privacy: You should understand and agree to the collection and use of their personal data as outlined in the game's privacy policy." + "\n"
                + "5.Intellectual Property: You must respect the intellectual property rights of the game and any third-party content used within it."+"\n\n");
        System.out.println(DesingText.ANSI_RESET);
       

        //asking the players about thier answer
        System.out.println("Do you agree to the term and policy of the DigitalStep Gmae? (Enter yes or No)" + DesingText.ANSI_Red + "\nIf you did not agree you will not be able to enter the game.");
        System.out.println(DesingText.ANSI_RESET);


        //storing the players answer
        String answer = input.nextLine();

        //input valditaion loop to ensure that the player enters a yes or no onlay
        while (true) {

            if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y' || answer.charAt(0) == 'N' || answer.charAt(0) == 'n') {
                break;

            } else {
                System.out.println(DesingText.ANSI_Red + "You have enterd wrong respond please enter yes or no");
                System.out.println(DesingText.ANSI_RESET);
                answer = input.nextLine();
                

            }

        }

        //idintfy the player answer
        if (answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {

            choise = true;
        }

        if (answer.charAt(0) == 'N' || answer.charAt(0) == 'n') {
            choise = false;
        }

        return choise;
    }

    //This method displays basic information about the game for the player
    @Override
    void aboutTheGame() {
        System.out.println("\n" + DesingText.ANSI_Purple + "**** Welcome to DigitalStep game ****" + "\n" + "\n" + "DigitalSteps  is a game created by CS students in IAU. The game aims to enhance the learning process for java language as joyful game." + "\n"
                + "The game provides two directions " + "\n" + "\n" + "First directions: play once without testing your  level and without taking the learning process " + "\n" + "\n"
                + "Second direction: you can choose I want to learn with steps, and you will pass through the following:" + "\n" + "\n"
                + "1. you will take a Level test to identify your level" + "\n"
                + "2. you will be playing on the most appropriate level for your score" + "\n"
                + "3. once you become an expert on your level, you will get to the next level" + "\n"
                + "I hope you enjoy your journey with DigitalSteps (:");
                System.out.println(DesingText.ANSI_RESET);

    }



}