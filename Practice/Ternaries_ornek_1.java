package Practice;

import java.util.Scanner;

public class Ternaries_ornek_1 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz :");

        int yas = scan.nextInt();


        /*
        if (yas >= 18){
            System.out.println("Oy verebilir");
        }else if (yas < 18) {
            System.out.println("Oy veremez");
        }else {
            System.out.println("Yas 0 dan kucuk olamaz");
        }

         */

        String result = (yas > 18)? "Oy verebilir" : "Oy veremez";
        System.out.println(result);

        String result2 = (yas < 0)? "Yas 0 dan kucuk olamaz" :(yas >= 18)?"Oy verebilir" : "Oy veremez";
        System.out.println(result2);

    }
}
