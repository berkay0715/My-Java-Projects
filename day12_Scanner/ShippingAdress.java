package day12_Scanner;

import java.util.Scanner;

public class ShippingAdress {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your Full Name: ");
        String name = input.nextLine();

        System.out.println("Enter your building number: ");
       String buildnum = input.next();

        input.nextLine();

        System.out.println("Enter your Street name: ");
        String streetnName= input.nextLine();

        System.out.println("Enter your City name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your State: ");
        String stateName= input.next();

        input.nextLine();

        System.out.println("Enter your Zip code");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter Country Name: ");
        String counrtyName = input.nextLine();

        System.out.println("name = " + name);
        System.out.println("buildnum = " + buildnum);
        System.out.println("streetnName = " + streetnName);
        System.out.println("cityName = " + cityName);
        System.out.println("stateName = " + stateName);
        System.out.println("zipCode = " + zipCode);
        System.out.println("counrtyName = " + counrtyName);

        input.close();

    }
}
/*
1.Enter your Full Name (nextLine())
2.Enter your building number (next())
3.Enter your street name (nextLine())
4.Enter your city name (nextLine())
5.Enter your state (next())
6.Enter your zip code (next())
7.Enter your country name (nextline())

 */
