package Practice;

import java.util.Scanner;

public class ifBiz {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girin: ");
       // int sayi = scan.nextInt();

      //  sayi = sayi%2==0? 2*sayi : sayi+10;

        //System.out.println("sayi = " + sayi);

        // oy verme kosullari
        //Yas 18 olmali

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scan.nextInt();

        scan.nextLine();

        System.out.println("Lutfen vatandasliginiz giriniz:");
        String vatan = scan.nextLine();



       // System.out.println(yas >= 18 ? "oy kullanabilir" : "Oy kullanamazsin");
        String sonuc = (yas>=18 && vatan.equals("Turk"))? "oy kullanabilirsin": "oy kullanamazsin";

        System.out.println("sonuc = " + sonuc);

    }
}
