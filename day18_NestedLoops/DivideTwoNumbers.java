package day18_NestedLoops;

public class DivideTwoNumbers {

    public static void main(String[] args) {

        int a = 50; // 30-7=23-7=16 -7=9-7 = 2
        int b = 9;
        int count = 0;// count =1+1=2+1 = 3+1 =4

        while (a>=b){
            a-=b;
            count++;
        }
        System.out.println(count+ " with a remainder of "+ a);




    }
}
/*
1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators
 */
