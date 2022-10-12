package Practice;

import java.util.Scanner;

public class PracticeWithNevzat {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter a number:");
        double n1 = scan.nextDouble();

        System.out.println("Please enter a number:");;
        double n2 = scan.nextDouble();

        System.out.println("Please enter a Operator: ");
        char operator = scan.next().charAt(0);
        double result = 0;

        if (operator == '+'){
            result = n1 + n2;
        }else if (operator == '-') {
            result= n1-n2;
        }else if (operator== '*'){
            result=n1*n2;
        }else if (operator== '%'){
            result= n1%n2;
        }else {
            System.out.println("None existing result");
        }
        System.out.println("result = " + result);
    }
}

//Given two double variables named n1
//& n2, and a char variable named mathOperator, write a program that can
//calculate result of n1&n2 based on the given math Operator.
//char operator -> -, +, *, /
//when operator is + : add num1, num2
//when operator: - : minus num1, num2
//when operator: * : multiply num1, num2
//when operator: / : divide num1, num2
//for any other operators: print "invalid operator"
//Ex:
//n1 = 10, n2= 20, mathOperator = '+'
//output:
//30
