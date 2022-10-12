package day18_NestedLoops;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (true){

            System.out.println("Please enter your age: ");
            int age = scan.nextInt();

            while (!(age >= 1 && age<= 120)){ //  while the age is invalid
                System.err.println("Invalid entry, Please re-enter your age: ");
                age = scan.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a = scan.next().toLowerCase();

            while (!(a.equals("no")|| a.equals("yes"))){
                System.err.println("Invalid entry, Please re-enter. Would you like to continue?");
                a=scan.next();
            }

            if (a.equals("no")){
                break;
            }
        }

        scan.close();







    }
}
