package Practice.Loops;

import java.util.Scanner;

public class WhileLoops {
    public static void main(String[] args) {

        //Print 1 ~ 10

        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;

        }

        //write a program to ask user to enter two number and math operator,
        //and return the result.

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a Number: ");
        int num1 = scan.nextInt();

        System.out.println("Please enter a Number: ");
        int num2 = scan.nextInt();

        System.out.println("Please enter an Operator: ");
        char operator = scan.next().charAt(0);

        while (!(operator=='+'|| operator=='-'|| operator=='*'||operator=='/')){

            System.err.println("Invalid Operator, Please re-enter: " );
            operator = scan.next().charAt(0);
        }
        if (operator=='+'){
            System.out.println(num1 + num2);
        }
    }
}
