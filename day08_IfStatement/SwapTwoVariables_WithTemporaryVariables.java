package day08_IfStatement;

public class SwapTwoVariables_WithTemporaryVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        //-------------------------------------------------------------------
        int c = b; // c=15;

        b = a; // 10
        a = c;
//----------------------------------------------------------------------------
        System.out.println("a = " + a);// 15
        System.out.println("b = " + b);//10
    }

}
