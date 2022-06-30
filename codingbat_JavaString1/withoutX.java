package codingbat_JavaString1;

public class withoutX {

    public static void main(String[] args) {
        System.out.println(withoutX("xHix"));
        System.out.println(withoutX("xHi"));
        System.out.println(withoutX("Hxix"));
        System.out.println(withoutX("xxHi"));
        System.out.println(withoutX("xaxbx"));
        System.out.println(withoutX("xx"));
        System.out.println(withoutX("x"));
        System.out.println(withoutX("") );
    }

    public static String withoutX(String str) {

        if (str.length()==0) {
            return str;
        }

        if (str.length()==1) {
            if (str.charAt(0) == 'x') {
                return "";
            }
            return str;
        }

        if (str.charAt(0) == 'x') {
            if (str.charAt(str.length()-1) == 'x') {
                return str.substring(1,str.length()-1);
            }
            return str.substring(1,str.length());
        } else {
            if (str.charAt(str.length()-1) == 'x') {
                return str.substring(0,str.length()-1);
            }
        }
        return str;
    }

}
