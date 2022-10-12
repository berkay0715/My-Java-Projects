package Practice;

import java.util.Scanner;

public class SwitchStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen sectiginiz gunu rakam olarak giriniz: ");
        String gun = scan.nextLine();

        boolean haftaici = false;

        switch (gun){

            case "Pazartesi":


            case "Sali":



            case "Carsamba":


            case "Persembe":

            case "Cuma":

                System.out.println("Hafta ici");









        }


    }
}
