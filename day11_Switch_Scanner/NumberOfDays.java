package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int number = 9;

        if (number>=1 && number<=12){ //Number:1~12

            switch (number){

                case 2:
                    System.out.println("28 Days");
                    break;

                case 4: case 6: case 9: case 11:
                    System.out.println("30 Days");
                    break;

                default: //1,3,5,7,9,10,12
                    System.out.println("31Days");

            }


        }else {
            System.out.println("Invalid Number");
        }




    }

}

/*
4.NumberOfDays
        28 Days: 2
        30 Days: 4,6,9,11
        31 Days: 1,3,5,7,8,10,12
 */
