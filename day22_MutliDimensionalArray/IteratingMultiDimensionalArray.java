package day22_MutliDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {

    public static void main(String[] args) {

        //index of elements:
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
        //      index:      0        1            2


        for (int i = 0; i < arr2D.length; i++) { //i: index numbers of single dimensional arrays

           // System.out.println(Arrays.toString(arr2D[i]));
            for (int j = 0; j < arr2D[i].length; j++) {//j: index number of elements


                System.out.print(arr2D[i][j] + " ");
            }

            System.out.println();

        }

        System.out.println("-------------------------------------------------------------");

        for (int i = arr2D.length - 1; i >= 0; i--) {// i: index number of 1 dimensional array starting from last index to 0

            for (int j = 0; j < arr2D[i].length; j++) {

                System.out.print(arr2D[i][j]+ " ");
            }
            System.out.println();

        }

        System.out.println("---------------------------------------------------------");


        for (int i = 0; i < arr2D.length; i++) {

            for (int j = arr2D[i].length - 1; j >= 0; j--) {

                System.out.print(arr2D[i][j]+" ");
            }
        }



/*
task1:
                9 10 11 12 13
                4 5 6 7 8
                1 2 3
task2:
                3 2 1
                8 7 6 5 4
                13 12 11 10 9
 task3:
                13 12 11 10 9
                8 7 6 5 4
                3 2 1
 */






    }


}
