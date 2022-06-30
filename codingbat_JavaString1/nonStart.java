package codingbat_JavaString1;

public class nonStart {

    public static void main(String[] args) {
        System.out.println(nonStart("Hello", "There"));
    }

    public static String nonStart(String a, String b) {
        return a.substring(1,a.length()) + b.substring(1,b.length());
    }

}
