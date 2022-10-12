package day20_Array;

public class Months2 {
    public static void main(String[] args) {


        String[]Months = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October",
                "November","December"};


        for (int i = 0; i < Months.length; i++) { // i:represents the index numbers of array starting from 0
            System.out.println(Months[i]);
        }
        System.out.println("-----------------------------------------------------------");

        for (int i = Months.length-1; i >=0 ; i--) {//:represents the index numbers of array starting from last index
            System.out.println(Months[i]);
        }


    }
}
