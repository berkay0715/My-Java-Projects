package day10_NestedIf;

public class CharacterIdentity {
    public static void main(String[] args) {

        char ch= '@';

        if (ch>=0 && ch<=9){
            System.out.println("Digit");
        } else if (ch>= 'A' && ch<='Z' || (ch>='a' && ch<='c')) {
            System.out.println("Alphabetic");
        }else {
            System.out.println("Special character");
        }



    }
}
    /*
    4.Create a class called character Identity, and write an program that can identify if the given character is a digit or
    Alphabetic Character or special character
     */
