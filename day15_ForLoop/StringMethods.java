package day15_ForLoop;

import java.util.Locale;

public class StringMethods {
    public static void main(String[] args) {

        String str= " ";

        str.isEmpty();

        boolean r = str.isEmpty();
        System.out.println(r);

        boolean r1 = str.isBlank();
        System.out.println(r1);

        String  str2 = "Cydeo    ";
        System.out.println(str2.isBlank());

        System.out.println("-----------------------------------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2)); //false
        System.out.println(s1.equalsIgnoreCase(s2)); // true

        // Ye, YES, yEs, yES, YEs...

        System.out.println("yEs".equalsIgnoreCase("Yes"));

        System.out.println("---------------------------------------------");

        String sentence = "My favoirte programming language is Java";
       boolean hasCSharp = sentence.contains("C#");
       boolean hasJava = sentence.contains("Java");
       boolean hasJava2 = sentence.contains("java");
       boolean hasJava3= sentence.toLowerCase().contains("java");

        System.out.println("hasCSharp = " + hasCSharp);
        System.out.println("hasJava = " + hasJava);
        System.out.println("hasJava2 = " + hasJava2);
        System.out.println("hasJava3 = " + hasJava3);

        System.out.println("--------------------------------------------");

        String input1= "I love jAvA";
        String input2= "Java";

        System.out.println(input1.equals(input2)); // false
        System.out.println(input1.equalsIgnoreCase(input2)); // false

        System.out.println(input1.contains("Java"));// true

        System.out.println(input1.toLowerCase().contains("java")); // true
        System.out.println(input1.toUpperCase().contains("JAVA")); // true

        System.out.println("---------------------------------------------------");

        String a = " Wooden Spoon";

        boolean x =a.startsWith("Woo");
        System.out.println(x);

        boolean y = a.endsWith("Spoon");
        System.out.println(y);

        boolean z = a.toLowerCase().startsWith("wooden");
        // in order to ignore the case sensitivity we first create the lower case/upper case version of string and then compare it with lowercase o uppercase
















    }
}
