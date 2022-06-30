package class3;

public class SwapVariable {

    /**
     * SwapVariable: Passed-by-value will not affect the original variable's value
     */

    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        swap(a,b);

        System.out.println(a);
        System.out.println(b);

    }

    public static void swap(int x, int y) {
        int temp = 0;
        temp = x;
        x = y;
        y = temp;
        System.out.println(x);
        System.out.println(y);
    }

}
