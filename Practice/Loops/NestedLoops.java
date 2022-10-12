package Practice.Loops;

public class NestedLoops {
    public static void main(String[] args) {

    //Print 1 ~ 5 for 5 times


        for (int j = 1; j <=5; j++) {

            for (int i = 1; i < 6; i++) { // i: 1 ~ 5
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
