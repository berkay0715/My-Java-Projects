package day20_Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysIntro {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //create a variable that's capable enough to contain 5 names

        String[] myGroup = new String[5];
        myGroup[0] = "Gunay";
        myGroup[1]= "Neira";
        myGroup[2]="Suat";
        myGroup[3]="Hulya";
        myGroup[4]="Mikael";

        //System.out.println(myGroup);//hashcode
        System.out.println(Arrays.toString(myGroup)); // ["Gunay","Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("------------------------------------------------------------------------");

        String[]days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        //Index:           0         1          2           3         4         5         6

        System.out.println(Arrays.toString(days));

        System.out.println("Please enter a number: ");
        int number= scan.nextInt();

        if (number<1 || number>7){
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number-1]);





    }
}
