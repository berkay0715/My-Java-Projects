package day09_IfStatements;

public class PassOrFailed {
    public static void main(String[] args) {

        int score = 75;

        boolean passed = score >= 60;

        boolean failed = score <= 59;

        if (passed){
            System.out.println("Congrats, you passed");
        }else{
            System.out.println("Failed");
        }

        System.out.println("----------------------------------------------------------------------");




    }
}
