package codingbat_JavaString1;

public class withoutEnd {

    public static void main(String[] args) {
        System.out.println(withoutEnd("Hello"));
    }

    public static String withoutEnd(String str) {
        return str.substring(1,str.length()-1);
    }

}
