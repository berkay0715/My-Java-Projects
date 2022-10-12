package day08_IfStatement;

public class EvenlyDivisible {

    public static void main(String[] args) {

        int number = 100;

        boolean divisibleBy2= number % 2 == 0; // if the remainder of the number divided by 2 is zero, then its evenly divisible by 2
        boolean divivibleBy3= number % 3 == 0;
        boolean divisibleBy5= number % 5 == 0;

        System.out.println(number + " Is divisible by 2: " + divisibleBy2);
        System.out.println(number + " is divisible by 3: " + divivibleBy3);
        System.out.println(number + " is divisible by 5: " + divisibleBy5);

        System.out.println("----------------------------------------------------------");

        int year = 2000;

        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is leap year: " + isLeapYear);


    }

}
/*
Create a class called EvenlyDivisible,and write a program that can check if a number is evenly divisible by 2, 3, 5
    		Ex:
				number = 65;

			output:
				65 is divisible by 2: false
				65 is divisible by 3: false
				65 is divisible by 5: true
 */