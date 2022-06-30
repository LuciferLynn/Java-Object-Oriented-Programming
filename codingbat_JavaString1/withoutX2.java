package codingbat_JavaString1;

public class withoutX2 {

    public static void main(String[] args) {
        System.out.println(withoutX2("x"));
    }

    public static String withoutX2(String str) {

        if (str.length()>1) {
            if (str.length() != 0) {
                if (str.charAt(0) == 'x') {
                    if (str.charAt(1) == 'x') {
                        return str.substring(2, str.length());
                    } else {
                        return str.substring(1, str.length());
                    }
                } else {
                    if (str.charAt(1) == 'x') {
                        return str.substring(0, 1) + str.substring(2, str.length());
                    }
                }
            }
            return str;
        } else if (str.length()==1 && str.charAt(0)=='x') {
            return "";
        }
        return str;

    }

}


