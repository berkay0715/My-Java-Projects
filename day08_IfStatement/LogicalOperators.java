package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {

        String name = "Berkay";
        int age = 18;
        String citizen = "Turkey";

        boolean isEligible = age >= 18 && citizen == "Sweden";
        //                      19>= 18 && "Turkey" == "Sweden"
        //                      true && false ===> false
        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("---------------------------------------------------------------------------------");

        String name2 = "Josh";
        int creditScore = 720;
        int age2 = 23;
        int income = 40000;

        boolean isEligible2 = creditScore >= 700 && age2 >=21 && income >= 60000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);

        System.out.println("---------------------------------------------------------------------------------");

        String name3 = "Shay";

        int age3 =21;
        char gender = 'F';

        boolean isEligible3 = age3 >= 18 && (gender == 'M' || gender =='F');
        //                      21>= 18 && ('F' == 'M' || 'F' == 'F')
        //                      true    && (false      || true)
        //                      true && true
        //                      true

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("---------------------------------------------------------------------------------");

        String name4 = "James";
        String countryOfBirth = "USA";

        boolean marriedToUsCitizen = false;

        boolean isEligible4 =  countryOfBirth == "USA" || marriedToUsCitizen == true;
        //                      false                  || false

        System.out.println(name4 + " is eligible to apply for US citizenShip: " + isEligible4);

        System.out.println("---------------------------------------------------------------------------------");

        String name5 = "Anna";

        double gpa = 3.5;
        int familyIncome = 100000;

        boolean isEligible5 = gpa >=3.5 || familyIncome <= 60000;

        System.out.println( name5 + " is eligible for scholarship: " + isEligible5);

        System.out.println("---------------------------------------------------------------------------------");

        boolean result2 = true;
        System.out.println("result2 = " + result2);

        boolean result3 = !result2;
        System.out.println("result3 = " + result3);

        System.out.println("---------------------------------------------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);


    }
}
/*

 */
