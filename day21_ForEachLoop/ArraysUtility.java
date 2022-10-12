package day21_ForEachLoop;

import java.util.Arrays;

public class ArraysUtility {
    public static void main(String[] args) {

        int [] numbers = {1,2,3,4,5};

        System.out.println(numbers); //hashcode        // if you want to print any single dimensional array you must call "to.String"
        System.out.println(Arrays.toString(numbers));

        System.out.println(numbers[0]);

        /*
        String str = "Java";
        System.out.println(str);
        System.out.println(str.toString());
         */

        System.out.println("------------------------------------------------------------------");

        int[] scores = {95,100,55,65,85,78};

        Arrays.sort(scores); // {55,65,78,85,95,100}
        System.out.println(Arrays.toString(scores));// Prints the Array

        System.out.println("Min score: "+ scores[0]); // to find the min number in the array
        System.out.println("Max score: "+ scores[scores.length-1]); // to find the max number is the Array

        System.out.println("-------------------------------------------------------------------");

        String [] names = {"Gunay","Anna","Zuhal", "Ahmet","Maria","Sinem"};
        Arrays.sort(names); // sorts the names from the ASCII table (lower number to higher number)

        System.out.println(Arrays.toString(names));

        System.out.println("---------------------------------------------------------------------");

        String[] words = {"Anna","ANNA"};

        Arrays.sort(words);
        System.out.println(Arrays.toString(words));

        System.out.println("-----------------------------------------------------------------------------");

        int[] arr1= {1,3,2};
        int[] arr2= {1,2,3};

        boolean  r1=Arrays.equals(arr1,arr2);
        System.out.println("r1 = " + r1);

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        boolean r2 = Arrays.equals(arr1,arr2);
        System.out.println("r2 = " + r2);

        System.out.println("----------------------------------------------------------------------------------");

        //"acb", "bac"
        char[] ch1 = {'a','c','b'};
        char[] ch2 = {'b','a','c'};

        Arrays.sort(ch1);//{a,b,c}
        Arrays.sort(ch2);//{a,b,c}

        boolean anagram = Arrays.equals(ch1,ch2);

        System.out.println("anagram = " + anagram);


    }
}
