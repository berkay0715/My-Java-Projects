package day10_NestedIf;

public class DaysInWeek {

    public static void main(String[] args) {

        int n = 5; // 1 ~ 7

        boolean Monday = n==1;
        boolean Tuesday = n==2;
        boolean Wednesday = n==3;
        boolean Thursday = n == 4;
        boolean Friday = n == 5;
        boolean Saturday = n == 6;
        boolean Sunday = n == 7;



        if (Monday){
            System.out.println("Monday");
        } else if (Tuesday) {
            System.out.println("Tuesday");
        } else if (Wednesday) {
            System.out.println("Wednesday");
        } else if ( Thursday) {
            System.out.println("Thursday");
        } else if ( Friday) {
            System.out.println("Friday");
        } else if ( Saturday) {
            System.out.println("Saturday");
        }else{
            System.out.println("Sunday");
        }


        System.out.println("---------------------------------------------------");

       String result= (n==1)?"Monday" :(n==2)? "Tuesday" :(n==3)? "Wednesday" :(n==4)? "Thursday" :(n==5)? "Friday" :(n==6)? "Saturday" :"Sunday";

        System.out.println(result);




    }

}
/*
if:     (Condition)?
else:       :
else if:    :(Condition)?
 */