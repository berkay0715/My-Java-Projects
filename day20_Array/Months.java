package day20_Array;

import java.util.Scanner;

public class Months {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        String[]Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November","December"};

        System.out.println("Please enter a number:");
        int number = scan.nextInt();

        if (number<1||number>12){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println("Month:"+ Months[number-1]);



    }
}
