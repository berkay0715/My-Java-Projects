package day15_ForLoop;

import java.util.Scanner;

public class MaximumNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int max = -2147483648;
        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number: ");
            int num= scan.nextInt();//1,2,3,4,5

            if (num >max){
                max = num;
            }
        }

        System.out.println("max = " + max);

scan.close();

    }
}
/*
Write a program that asks the user to enter a number for 5 times.
return the maximum number
 */