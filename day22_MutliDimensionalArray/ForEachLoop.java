package day22_MutliDimensionalArray;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {

        //index of elements:
        int [][] arr2D={{1,2,3},{4,5,6,7},{8,9,10,11,12,13}};
        //      index:      0        1            2

/*
        for(int[] each1DArray : arr2D){
            System.out.println(Arrays.toString(each1DArray));
        }


 */


        for (int[] each1DArray : arr2D) {

            for (int eachElement : each1DArray) {
                System.out.println(eachElement);
            }
        }









    }
}
