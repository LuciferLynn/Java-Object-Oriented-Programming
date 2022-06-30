package codingbat_JavaString1;

public class without2 {

    public static void main(String[] args) {

    }

    public static String without2(String str) {
        if (str.length()<=1) {
            return str;
        }

        String temp = str.substring(str.length()-2);

        if (str.length()>=2) {
            if (str.startsWith(temp)) {
                return str.substring(temp.length());
            }
        }
        return str;
    }

}
