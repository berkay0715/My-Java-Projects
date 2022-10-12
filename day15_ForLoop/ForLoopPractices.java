package day15_ForLoop;

public class ForLoopPractices {
    public static void main(String[] args) {

        //15 16 17 18 ... 45

        /*
        System.out.println(15);
        System.out.println(16);
        ...
        System.out.println(45);
        */


        for ( int i= 15;i <=45; i++ ) { // i: 15 16 17 18 .... 45
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Hello ");

        System.out.println("---------------------------------");

        //100~50   100, 99, 98, 97, .... 50
        for (int i = 100; i>=50; i--) { //i: 100, 99, 98, 97 ... 50
            System.out.print(i+ " ");
        }
        System.out.println();

        System.out.println("----------------------------------------");

        //Print all even numbers between 1~55

        for (int i= 1; i<=55; i++){
            if(i%2 == 0){
                System.out.print(i+" ");
            }
        }
        System.out.println();

        System.out.println("-----------------------------------------------------");

        //OR
        /*
        for(int i = 2; i>=54; i+=2){
            System.out.println(i + " ");
        }
        System.out.println();
         */

        /*
    A~Z
    a~z
    Z~A
    z~a
         */


        for (char a = 97; a>122; a++){
            System.out.println(a+" ");
        }





    }
}
