package day17_While_DoWhileLoops;

import java.util.Locale;
import java.util.Scanner;

public class EligibletoVote {
    public static void main(String[] args) {


        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = scan.nextInt(); //valid age: 1~120

        while ( !(age<=120 && age>=1)){ // while age is invalid
            System.err.println("Invalid age, Please re-enter");
            System.err.println("Enter your age: ");
            age =scan.nextInt();
        }

        System.out.println("Are you a US citizen? Yes/No");
        String answer = scan.next().toLowerCase();

        while ( !(answer.equals("yes") || answer.equals("no"))) {
            System.err.println("Invalid entry, Please re-enter");
            System.err.println("Are you a US citizen? Yes/No");
            answer = scan.next().toLowerCase();
        }

        if (age>= 18 && answer.equals("yes")){
            System.out.println("You are Eligible to vote");
        }else {
            System.out.println("You are not eligible to vote");
        }

        scan.close();


    }
}
