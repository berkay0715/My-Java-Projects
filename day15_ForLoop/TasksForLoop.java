package day15_ForLoop;

public class TasksForLoop {
    public static void main(String[] args) {

        //Task 1
        for (int i = 1; i<= 8; i++){
            System.out.println("* * * * * *");
        }
        System.out.println();
        //Task 2
        for (int i = 1; i<=100; i++){

            if (i%15 == 0 ){ // 15,30,45,60,75,90
                System.out.print("Finra ");
            } else if (i%3 ==0) {
                System.out.print("FIN ");//3,6,9,12,99
            } else if (i%5==0){
                System.out.print("RA ");//5,10,15,20..200
            }else { //1,2,4,7....
                System.out.print(i + " ");
            }
        }

    }
}
