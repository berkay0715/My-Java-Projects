package day09_IfStatements;

import java.util.Scanner;

public class vote {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name: ");
        String name = input.next();

        System.out.println("please enter your age: ");
        int age = input.nextInt();

        input.nextLine();

        System.out.println("Please enter your Country: ");
        String country = input.nextLine();

        if (age>=18 && country.equals("Sweden")){
            System.out.println("You can vote");
        }else{
            System.out.println("You can Not vote");
        }
    }
}
