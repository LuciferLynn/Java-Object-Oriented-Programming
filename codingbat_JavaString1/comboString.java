package codingbat_JavaString1;

public class comboString {

    public static void main(String[] args) {
        System.out.println(comboString("Hello", "hi"));
    }

    public static String comboString(String a, String b) {
        int nA = a.length();
        int nB = b.length();

        if (nA > nB) {
            return b + a + b;
        } else {
            return a + b + a;
        }

    }


}
