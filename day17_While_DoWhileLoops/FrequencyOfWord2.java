package day17_While_DoWhileLoops;

public class FrequencyOfWord2 {

    public static void main(String[] args) {

        String sentence = "Cat Cat Dog Dog cAt CAT caT";

        int frequency = 0;

        //                           8 - 4

        for (int i = 0; i <= sentence.length()-3; i++) { //i: 0, 1, 2 ,3
            String eachSub = sentence.substring(i,i+3);
            //System.out.println(eachSub);

            if (eachSub.equalsIgnoreCase("Cat")){
                frequency++;
            }
        }

        System.out.println(frequency);









    }
        }
