package day04_Variables;

public class PrimitiveIntro {
    public static void main(String[] args) {

      /*
      Primitives:
            int:for all integers
            double: for decimals
            char: for single characters
            boolean: True/False
       */

        // age: 38 years old
        byte age = 38;

        // weight: 160 pounds
        //  byte weight = 160;  // 160 is out of byte' range
        //  byte num = -129; // -129 is out of byte' range
        short weight = 160; // 160 is within the range of short

        //salary: 100000 $
        // short salary = 100000; // 100000 is out of short' range
        int salary = 100_000; // int is the preferred data type for integer numbers

        long asset = 3_333_333_333L;


        //tax: 0.26
        float tax = 0.26F;

        double PI = 3.14;

        //#  char is designed for single characters
        char ch1 = '#';
        System.out.println("ch1= " + ch1);

        char ch2 = 35;
        System.out.println("ch2= " + ch2);

        char ch3 = 35000;
        System.out.println("ch3 = " + ch3);

        char ch4 = 15000;
        System.out.println("ch4 = " + ch4);

        char gender = 'f';

        char grade = 'f';

        char yesNo = 'Y';

        System.out.println(yesNo);

        boolean isEmployeed = true;
        boolean isMarried = false;


        boolean result = 100 > 300;


        String name = "Berkay Celik";
        String city = "Huddinge";
        String country = "Sweden";
        System.out.println("name = " + name);
        System.out.println("country = " + country);
        System.out.println("city = " + city);





    }
}
