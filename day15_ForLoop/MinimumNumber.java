package day15_ForLoop;

import java.util.Scanner;

public class MinimumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int Min = +2147483642; // any number that the user enters will be less than 2147483642

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number: ");
            int num = scan.nextInt();
            if (Min>num){
                Min = num;
            }
        }
        System.out.println("Min = " + Min);



    }
}
