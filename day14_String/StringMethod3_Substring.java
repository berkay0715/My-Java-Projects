package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring( beginning index, ending index )

        String word = "Cydeo School";
        //             12345...

       String brand=  word.substring(0,4+1);

        System.out.println(brand);
        int s =word.indexOf("S");
        System.out.println("S = " + s);
        int l = word.indexOf("l");
        System.out.println("l = " + l);

        String word2 = word.substring(6,11+1);
        System.out.println("word2 = " + word2);

        System.out.println("---------------------------------------");

        String word3 = "Java Programming Language";

        String s1= word3.substring(0, word3.indexOf(" ")); //"Java"
        String s2 =word3.substring(word3.indexOf(" ")+1 , word3.lastIndexOf(" ") );// "Programming"
        String s3 = word3.substring(word3.lastIndexOf(" ")+1);// "Language"

        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);


    }
}
