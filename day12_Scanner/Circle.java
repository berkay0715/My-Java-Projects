package day12_Scanner;

import java.util.Scanner;

public class Circle {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter Radius of the circle");

         double r = scan.nextDouble();

        double radius = 3.14* (r*r);
        System.out.println("radius = " + radius);

        double Perimeter = 2*3.14*r;
        System.out.println("Perimeter = " + Perimeter);

        scan.close();


    }
}
/*
1. Circle:
            1.1 Ask the user to enter the radius of the circle
            1.1 Calculate the area and perimeter of the circle by using the radius
 */