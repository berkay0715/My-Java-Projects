package day20_Array;

import java.util.Scanner;

public class ArrayPractice_3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers do you want to enter?");
        int length =scan.nextInt();

        if (length<=0){
            System.out.println("Invalid Number");
        }


    }
}
