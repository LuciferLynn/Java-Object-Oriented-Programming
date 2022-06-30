package codingbat_JavaString1;

public class startWord {

    public static void main(String[] args) {
    }

    public static String startWord(String str, String word) {
        if (str.length()>0 && str.substring(1).startsWith(word.substring(1))) {
            return str.substring(0,word.length());
        }
        return "";
    }

}
