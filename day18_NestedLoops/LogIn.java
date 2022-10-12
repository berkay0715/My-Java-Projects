package day18_NestedLoops;

import java.util.Scanner;
import java.util.SortedMap;

public class LogIn {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your Username: ");
        String username = scan.next();

        System.out.println("Please enter your Password: ");
        String password = scan.next();


        if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
            System.out.println("Logged in");
        } else {
            int attempts = 3;
            while (!(username.equals("Cydeo") && password.equals("WoodenSpoon")) && attempts > 0) {

                if (attempts == 1) {
                    System.out.println("THIS IS YOUR LAST CHANCE");
                }
                System.out.println("Invalid Username or Password, Please re-enter");
                System.out.println("Enter your Username: ");
                username = scan.next();

                System.out.println("Enter your Password: ");
                password = scan.next();
                attempts--;
            }
            if (username.equals("Cydeo") && password.equals("WoodenSpoon")) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked");
            }

        }
        scan.close();
    }
}
/*
  2. You are writing a code for the log-in function of the Cydeo Application, assume that your credentials are:
                            username: Cydeo
                            password: WoodenSpoon

                Ask the user to enter their credentials.
                        If credentials are matched, your program should print "Logged in."
                        If the credentials are not matched, the program should allow the user to have three attempts to enter correct credentials and
                        if all three attempts are failed, then print "Your account is locked."
 */
