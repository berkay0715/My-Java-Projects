package day05_Concatenation;

public class carInfo {

    public static void main(String[] args) {

        String year ="2022",
                make = "Audi",
                model = "RS6",
                miles = "5082 miles",
                color = "Black",
                price = "SEK 700,000";

        String carInfo = (year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price);

        System.out.println(carInfo);

        System.out.println(year + " " + make + " " + model + ", " + miles + ", " + color + ", " + price);


    }
}
