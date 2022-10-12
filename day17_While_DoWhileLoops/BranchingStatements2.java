package day17_While_DoWhileLoops;

public class BranchingStatements2 {
    public static void main(String[] args) {

        for (char i = 'A'; i <= 'E'; i++) {

            if (i == 'C') {
                continue;
            }
            System.out.println(i);// A B

        }
        System.out.println("------------------------------------------");

        for (int i = 0; i <= 10; i++) {//i: 1,2,3,4,5....
            if (i % 2 != 0) {//1,3,5,7,9
                continue;
            }
            System.out.println(i);
        }

        System.out.println("--------------------------------------------");
        for (int i = 0; i <= 10; i++) {//i: 1,2,3,4,5....
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);


        }
    }
}
