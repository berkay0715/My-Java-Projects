package day17_While_DoWhileLoops;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        //Username: "Cydeo"
        //password: "Cydeo123"

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Username: ");
        String userName = scan.nextLine();

        System.out.println("Please enter Password");
        String password = scan.nextLine();

        if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(userName.equals("Cydeo") && password.equals("Cydeo123")) && attempts > 0) {// while the credentials are invalid and the user has attempts
               if (attempts== 1){
                   System.out.println("THIS IS YOUR LAST CHANCE");
               }
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                userName = scan.next();

                System.out.println("Enter your password:");
                password = scan.next();
                attempts--;
            }
            if (userName.equals("Cydeo") && password.equals("Cydeo123")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }
        }


    }
}
