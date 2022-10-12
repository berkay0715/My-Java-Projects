package Practice;

import java.util.Scanner;

public class Boy {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your height:");
        double height = scan.nextDouble();

        if (height<=175){
            System.out.println("You are short");
        }else {
            System.out.println("You are tall");
        }

    }
}
/*
/*Klavyeden bir boy uzunluğu isteyiniz. 175’e eşit veya küçükse ekrana ‘KISA BOYLUSUNUZ.’,
        175’den büyükse ekrana “UZUN BOYLUSUNUZ.’ mesajını yazdıracak şekilde programı yazınız.
 */
