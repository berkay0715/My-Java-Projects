package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("How many numbers would you like to enter?");
        int length = scan.nextInt();//5

        if (length<=0){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        int[]numbers = new int[length]; //[10,20,0,0,0]

        for (int i = 0; i < length; i++) {
            System.out.println("Enter a Number:");
            numbers[i]=scan.nextInt();//10, 20
        }

        System.out.println(Arrays.toString(numbers));
        scan.close();



    }
}
