package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        String str = "Java";
        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        for (char each:str.toCharArray()){
            System.out.println(each);
        }

        System.out.println("--------------------------------------------------------------------");

        String sentence = "Wooden Spoon";

        String[] words=sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("------------------------------------------------------------------------");

        String email ="WoodenSpoom@Cydeo.com";

        String[]arr= email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("--------------------------------------------------------------------------");

        String s = "Today is a nice day. Today is Monday.Today we learn Java";

       String[]sentences= s.split("\\."); // if you want to split from dot you have to give double slash for others you don't need anything

        System.out.println(Arrays.toString(sentences));




    }
}
