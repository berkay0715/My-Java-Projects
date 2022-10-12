package Practice;

import java.util.Scanner;

public class isim_Soyisim {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir isim soyisim giriniz");
        String isimSoyisim=scan.nextLine();

        String isim=isimSoyisim.substring(0,isimSoyisim.indexOf(" "));

        String isim2 = isimSoyisim.substring(isimSoyisim.indexOf(" ")+1,isimSoyisim.lastIndexOf(" "));


        String soyad=isimSoyisim.substring(isimSoyisim.lastIndexOf(" "),isimSoyisim.length());

        System.out.println(" isim : " + isim +"\n isim2 : " + isim2+ "\nsoyisim :" + soyad);




        scan.close();

    }
}
