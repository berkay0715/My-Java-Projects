package day10_NestedIf;

public class Nested_If_Statement {

    public static void main(String[] args) {

        int score = 90;

      // boolean passed = score>=60 && score<=100; // can be used
        // boolean failed = !passed;

        if (score >= 0 && score <=100){ // if score is valid

            if (score>= 60){
                System.out.println("Passed");
            }else {
                System.out.println("Failed");
            }
        }else { // if the score is NOT valid
            System.out.println("Invalid Score");
        }




    }
}
