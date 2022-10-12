package day24_CustomMethod_Return;

public class BreakfastTasks {

    public static void main(String[] args) {

        initials("cydeo","school"); //C.S

        System.out.println("-----------------------------------------------");

        domain("Cydeo.School@amazon.com");

        System.out.println("---------------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {
            domain(email);
        }

        System.out.println("-----------------------------------------------------------------------------------");

        nameOfMonth(120);

        System.out.println("-----------------------------------------------------------------------------------");

        nameOfDay(5);

        System.out.println("-----------------------------------------------------------------------------------");

        daysInMonth(12);

    }

	//1. Create a method that can display the initials of the person.   initials(String firstNAme, Sting lastName)
    public static void initials(String firstName, String lastName){ // void does not have a return type

        String initial = firstName.charAt(0)+"."+lastName.charAt(0);
        initial=initial.toUpperCase();
        System.out.println("initial = " + initial);

    }

	//2. Create a method that can display the domain of the email. domain(String email)
    public static void domain(String email){

        String domain = email.substring(email.indexOf("@")+1,email.lastIndexOf("."));
        System.out.println("domain = " + domain);

    }

	//3. Create a method that can display the name of the month based on the given number to the method
    public static void nameOfMonth( int number){

        String name = "";

        if (number>1 && number<=12){

            name = (number==1)?"Jan" :(number==2)?"Feb" :(number==3)?"Mar" :(number==4)?"Apr" :(number==5)?"May"
                    :(number==6)?"Jun" :(number==7)?"Jul" :(number==8)?"Aug" :(number==9)?"Sep" :(number==10)?"Oct"
                    :(number==11)?"Nov" : "Dec";

        }else{
            name = "Invalid";
        }

        System.out.println("name = " + name);


    }

    //4. Create a method that can print the name of the day based on the given number to the method
    public static void nameOfDay(int number){

        String day = "";

        day=(number==1)?"Monday" :(number==2)?"Tuesday":(number==3)?"Wednesday":(number==4)?"Thrusday":(number==5)?"Friday":(number==6)?"Saturday":
                (number==7)?"Sunday": "Invalid";

        System.out.println("day = " + day);


    }

	//5. Create a method that can print how many days a month has
    public static void daysInMonth(int number){

        String daysInAMonth = "";

        daysInAMonth = (number==1)?"31":(number==2)?"28":(number==3)?"30":(number==4)?"31":(number==5)?"30":(number==6)?"31":(number==7)?"30"
                :(number==8)?"31":(number==9)?"30":(number==10)?"31":(number==11)?"30":(number==12)?"31": "Invalid";

        System.out.println("daysInAMonth = " + daysInAMonth);


    }








}




/*
Warmup tasks:





 */
