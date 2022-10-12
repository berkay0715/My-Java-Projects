package day14_String;

public class StringMethods2 {
    public static void main(String[] args) {

        String str = "Java is fun, I love learning Java";
        String srt2 =str.replace("Java" , "Python"); // "Python is fun, I love learning Python

        System.out.println("str = " + str);
        System.out.println("srt2 = " + srt2);

        String email = "JohnSmith@yahoo.com";
        email = email.replace("yahoo", "Gmail");

        System.out.println("email = " + email);


        String sentence = " Java Java Python Python C# C# C++ C++ Python Python Python Python";

        System.out.println("sentence = " + sentence);

        String sentence2 = sentence.replace("Python" , "");

        System.out.println("sentence2 = " + sentence2);

               sentence2 = sentence2.replace("   ", " ");


        System.out.println("sentence2 = " + sentence2);


        String s = "Dog Dog Dog Dog Dog Dog";
        String s2 =  s.replace("Dog" , "Cat");

        System.out.println("s2 = " + s2);

        String s3 = "C# is fun, C# is cool";
        s3 = s3.replace(" C#", " Java");
        //s3 = s3.replace(" C# is c", " Java is c");

        System.out.println("s3 = " + s3);

        String s4 = "Java";

        s4=s4.replace("a", "e"); //"Jeve"
        System.out.println(s4);


        System.out.println("-----------------------------------");

        String result = "Java Java Java";
        //result = result.replace( "Java", "Python");
        result = result.replaceFirst("Java", "Pyhton");
        System.out.println("result = " + result);

        String result2 = "C# is fun, C# is cool";
        result2 = result2.replaceFirst("C#", "Java");
        System.out.println("result2 = " + result2);

        String result3 = "Java";
        result3 = result3.replaceFirst("a", "o"); // "Jova"
        System.out.println("result3 = " + result3);




    }
}
