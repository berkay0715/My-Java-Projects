package day12_Scanner;

import java.util.Scanner;

public class NextLinePractice {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Enter Full Name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your GPA: ");
        double GPA = input.nextDouble();

        input.nextLine();

        System.out.println("Enter your School name: ");
        String schoolName = input.nextLine();


        System.out.println("age = " + age);
        System.out.println("fullName = " + fullName);
        System.out.println("GPA = " + GPA);
        System.out.println("schoolname = " + schoolName);

        input.close();

    }
}
/*
1. Ask user to enter age (nextInt())
2.Ask user enter full name (nextline())
 */
