
package digitalsteps;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class User { //wajood 3 Dec
public static Scanner input = new Scanner(System.in);
     /*// this class is a super class for Admin & Player subclasses, in this class the account in the game is created from here
    the accoun is created from user basic informations, there's some attributes that should be checked (according to a conditions), for example, phone
    number will only be saved if the number consits of 10 digits. also an accoun will be only created if all inputs are valid and unique.
    //*/ 
    private String name;
    private String age;
    private String country;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;
    public static int numberOfAccounts = 0;
    public User [] users;
    
    public User(){
     
        numberOfAccounts++;
        users = new User[50];
    }
    
  
    
  public User(String name, String age, String country, String email, String password, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.country = country;
        this.email = email;
        this.password = password;
        this.phoneNumber = phoneNumber;
        numberOfAccounts++;
        users = new User[50];
    }
   
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getUsername() {
        username = "@" + this.name + this.age;
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }
ArrayList<User> userList = new ArrayList<>(50); // not true, just to run the program

    public void setEmail(String email) {
        do{
            boolean isEmailUnique = uniqueEmail(userList, email); // Assuming 'users' is an ArrayList<User> accessible within the class
        
        if (isEmailUnique && checkEmail(email) ) {
            this.email = email;
            break; // Break out of the loop if email is valid and unique
        } else if (!checkEmail(email)) {
            System.out.println(DesingText.ANSI_Red+"You have entered an invalid email, kindly try again."+DesingText.ANSI_RESET);
            email = input.nextLine();
        } else {
            System.out.println(DesingText.ANSI_Red+"This Email is already used, please try again."+DesingText.ANSI_RESET);
            email = input.nextLine();
        }
        } while(true);
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        do{
            if (checkPassword(password)){
                this.password = password;
                break;
            } else
            {
                System.out.println(DesingText.ANSI_Red+"You have enterd invalid Password, Please try again."+DesingText.ANSI_RESET);
                password = input.nextLine();
            }
            
        }while (true);
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        do {
            if (checkPNumber(phoneNumber)) {
                this.phoneNumber = phoneNumber;
                break;
            } else if (!checkPNumber(phoneNumber)) {
                System.out.println("You have entered invalid Phone Number, kindly try again.");
                phoneNumber = input.nextLine();
            } else {
                System.out.println(DesingText.ANSI_Red+"An Account with this number does exist, kindly try again."+DesingText.ANSI_RESET);
                phoneNumber = input.nextLine();
            }

        } while (true);
    }
       
    // methods
    
    public void createAccount() {

        Scanner input = new Scanner(System.in);
        
            System.out.println("Enter your name:");
            String Name = input.nextLine();
            setName(Name);

            System.out.println("Enter your age:");
            String Age = input.nextLine();
           // input.nextLine(); // Consume newline
            setAge(Age);

            System.out.println("Enter your country:");
            String Country = input.nextLine();
            setCountry(Country);

            System.out.println("Enter your email:");
            String Email = input.nextLine();
            setEmail(Email);
            
            System.out.println("                           " +
                    DesingText.ANSI_Green+"Your Password must:\n" +
                            "1- Be between 8 and 15 characters. \n" +
                            "2- Include at least one letter.\n" +
                            "3- Include at least one number.\n" +
                            "4- Include at least one symbol (@,#,%,$,&)\n"+ DesingText.ANSI_RESET);
                           

            System.out.println("Enter your password:");
            String Password = input.nextLine();
            setPassword(Password);

            System.out.println("Enter your phone number:");
            String PhoneNumber = input.nextLine();
            setPhoneNumber(PhoneNumber);

            String Username = "@" + Name + Age;
            System.out.println("Your username: " + Username);
            setUsername(Username);


    }
    
    public void printUserInfo(String Username) { // not used?
        if (this.username.equals(Username)) {
            System.out.println("User Information:");
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Country: " + this.country);
            System.out.println("Email: " + this.email);
            System.out.println("Phone Number: " + this.phoneNumber);
        } else {
            System.out.println(DesingText.ANSI_Red+"User not found."+DesingText.ANSI_RESET);
        }
    }
    
    public void Sign(String Username, String Password){
        if (this.username.equals(Username)&& this.password.equals(Password)) {
            System.out.println("User Information:");
            System.out.println("Name: " + this.name);
            System.out.println("Age: " + this.age);
            System.out.println("Country: " + this.country);
            System.out.println("Email: " + this.email);
            System.out.println("Phone Number: " + this.phoneNumber);
        } else {
            System.out.println(DesingText.ANSI_Red+"User not found."+DesingText.ANSI_RESET);
        }
        
    }
    
    
    public static boolean searchForAccount(ArrayList<? extends User> users, String username) {
        for (User user : users) {
            if (user.getUsername().equals(username)) {
                return true; // Account found
            }
        }

        System.out.println(DesingText.ANSI_Red+"Account wasn't found. Let's start creating your account" + DesingText.ANSI_RESET);
        return false; // Account not found
    }
    
    
    
    // methods that check if the input Email && Password && Phone number are entered according to our conditions
    
    public static boolean checkEmail(String email) {
        String emailRegex = "^[\\w.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}$"; 
        return email.matches(emailRegex);
    }
    
    public static boolean checkPassword(String password) { // method that return true only if the password is valid to the conditions
        // pass should be > 8 charecter
        // at least 1 letter
        // at least 1 number
        // at least one spical char (@ , & , %, $, #)
      
        boolean hasLetter = false;
        boolean hasNumber = false;
        boolean hasChar = false;

        if (password.length() >= 8 && password.length() <= 15) {

            for (int i = 0; i < password.length(); i++) {

                char ch = password.charAt(i); // to make strings to char

                if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                    hasLetter = true;
                } else if (ch >= '0' && ch <= '9') {
                    hasNumber = true;
                } else if (ch == '@' || ch == '#' || ch == '%' || ch == '$' || ch == '&') {
                    hasChar = true;
                }
            }
        }
        return hasLetter && hasNumber && hasChar;
    }
    
    public static boolean checkPNumber(String pNumber) {
        return pNumber.length() == 10; // true onlyif phone number is 10 digits
    }
    
    
    // methods that check the uniqueness of Email & Phone number

    public static boolean uniqueEmail(ArrayList<? extends User> users, String email) {
        for (User user : users) {
            if (user.getEmail().equals(email)) {
                return false; // not unique
            }
        }
        return true; // unique
    }

    public static boolean uniquePNumber(ArrayList<? extends User> users, String phoneNumber) {
        for (User user : users) {
            if (user.getPhoneNumber().equals(phoneNumber)) {
                return false; // not unique
            }
        }
        return true; // unique
    }
    
    
    // method that display a message that talk about the game
    void aboutTheGame() {

        System.out.println(DesingText.ANSI_Purple + "DigitalSteps is an interactive game designed to teach the fundamentals of Object-Oriented Programming (OOP) in Java.\n"
                + "Offering two distinct pathways, Player and Admin, the application caters to both learners and educators.\n"
                + "Players playon an exciting journey to master OOP concepts through engaging game mechanics,\n"
                + "while Admins can create quizezz to improve learning needs." + DesingText.ANSI_RESET);
    }
   
    
}// end of class