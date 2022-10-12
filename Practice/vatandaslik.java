package Practice;

import java.util.Scanner;

public class vatandaslik {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        scan.nextLine();

        System.out.println("Lutfen vatandasliginiz giriniz:");
        String vatan = scan.nextLine().toLowerCase();


        // System.out.println(yas >= 18 ? "oy kullanabilir" : "Oy kullanamazsin");

        String sonuc = (yas >= 18 && vatan.equals("turk")) ? "oy kullanabilirsin" : "oy kullanamazsin";

        System.out.println("sonuc = " + sonuc);
    }
}