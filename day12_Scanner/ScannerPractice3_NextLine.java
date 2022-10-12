package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3_NextLine {

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = input.nextLine(); //Berkay Sukru CelikEnter

        System.out.println("Enter your Programming Language: ");
        String programming = input.nextLine(); // Java Programming LanguageEnter

        System.out.println("Enter your age: "); //21
        int age = input.nextInt();

        // if we are using nextLine() method after the other methods of scanner, we MUST provide one addition nextLine()

        input.nextLine(); // Enter

        System.out.println("Enter your school name: "); //CydeoEnter
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
