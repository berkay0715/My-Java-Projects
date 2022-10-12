package Practice;

public class increment {
    public static void main(String[] args) {

        int a = 12;
        int b = 8;

        a+=b;
        System.out.println(a);

        a--;
        b++;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        a/=b;
        System.out.println("a = " + a);

        b*=3;
        System.out.println("b = " + b);

    }
}
