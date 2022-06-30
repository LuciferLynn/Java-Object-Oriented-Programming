package class4;

public class SwapVariableV2 {

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        a = a + b; // a = 30
        b = a - b; // b = 10
        a = a - b; // a = 20

        System.out.println("a value is: " + a);
        System.out.println("b value is: " + b);

    }

}
