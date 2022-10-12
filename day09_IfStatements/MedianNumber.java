package day09_IfStatements;

public class MedianNumber {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        // if we have 3 different numbers, one MUST be maximum, one MUST be minimum and one MUST be median


        //                a = 15, b = 10, c = 20   a = 15, b = 10, c = 20
        boolean aIsMedian = (a > b && a < c) || (a > c && a > b);

        /*
        in order for a to be the media number:
            1. if c is the maximum number & b is the minimum number, then a is the median number
            2. if b is the maximum number & c is the minimum number, then a is the median number
         */

        //                b = 15, a = 20, c = 10   a = 15, b = 20, c = 20
        boolean bIsMedian = (b > c && b < a) || ( b > a && b < c);
        //                a = 15, b = 10, c = 20
        boolean cIsMedian = !aIsMedian && !bIsMedian;
        //boolean cIsMedian = (c > a && c < b) || (c < a && c > b);

        if (aIsMedian){ // if a is the median number
            System.out.println( a + " is median");
        }

        if (bIsMedian){ // if b is the median number
            System.out.println( b + " is median");
        }

        if (cIsMedian){ // if c is the median number
            System.out.println(c + " is median");
        }




    }
}
