package codingbat_JavaString1;

public class deFront {

    public static void main(String[] args) {

    }

    public static String deFront(String str) {
        String out = "";
        if (str.charAt(0)!='a' && str.charAt(1)!='b') {
            return str.substring(2);
        }
        if (str.charAt(0)=='a') {
            if (str.charAt(1)=='b') {
                return str;
            }
            out += str.substring(0,1);
        }
        if (str.charAt(1)=='b') {
            out += str.substring(1,2);
        }
        out += str.substring(2,str.length());
        return out;
    }

}
