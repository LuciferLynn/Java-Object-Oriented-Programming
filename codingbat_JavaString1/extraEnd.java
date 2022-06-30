package codingbat_JavaString1;

public class extraEnd {

    public static void main(String[] args) {
        System.out.println(extraEnd("Hello"));
    }

    public static String extraEnd(String str) {
        String out = "";
        for (int i = 0; i < 3; i++) {
            out += str.substring(str.length()-2);
        }
        return out;
    }

}
