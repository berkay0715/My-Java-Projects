package day20_Array;

import java.util.Scanner;

public class AverageNumber {
    public static void main(String[] args) {

       int[]numbers = {10,20,30,40,50,60};

       int sum = 0;// +10+29+30...

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        double averaheNumber = sum/numbers.length;
        System.out.println("averaheNumber = " + averaheNumber);




    }
}
