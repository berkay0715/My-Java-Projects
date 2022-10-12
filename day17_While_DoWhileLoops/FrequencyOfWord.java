package day17_While_DoWhileLoops;

public class FrequencyOfWord {
    public static void main(String[] args) {

       String sentence = "JavaJavaJavaJavaJava";

       int frequency = 0;

       //                           8 - 4

        for (int i = 0; i <= sentence.length()-4; i++) { //i: 0, 1, 2 ,3
            String eachSub = sentence.substring(i,i+4);
           //System.out.println(eachSub);

            if (eachSub.equals("Java")){
               frequency++;
            }
        }

        System.out.println(frequency);


    }
}
