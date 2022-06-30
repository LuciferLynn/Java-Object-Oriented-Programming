package codingbat_JavaString1;

public class firstHalf {

    public static void main(String[] args) {
        System.out.println(firstHalf("HelloThere"));
    }

    public static String firstHalf(String str) {
        int n = str.length();
        return str.substring(0,n/2);
    }

}
