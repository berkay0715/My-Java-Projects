package day08_IfStatement;

public class IfStatementIntro {

    public static void main(String[] args) {

        int number = 300;

        boolean evenNumber = number%2 == 0;

        if (evenNumber){ // even numbers
            System.out.println(number + " is even number");
        }

        if (!evenNumber){ // not even
            System.out.println(number + " is odd number");
        }

        System.out.println("-----------------------------------------------------------------------");

        int n = 200;


        //positive
        if (n > 0){ // if the n is greater than zero, then it's positive
            System.out.println(n + " is positive");
        }

        //negative
        if ( n < 0 ){ // if the n is less than  zero, then it's negative
            System.out.println(n + " is negative");
        }

        //zero
        if (n == 0){ // if the n is equal
            System.out.println(n + " is zero");
        }



    }


}
