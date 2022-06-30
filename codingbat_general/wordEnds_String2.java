package codingbat;

public class wordEnds_String2 {

    public static void main(String[] args) {

        System.out.println(wordEnds("XY123XY", "XY"));
        System.out.println(wordEnds("abc1abc1abc", "abc"));

    }

    public static String wordEnds(String str, String word) {

        int strLen = str.length();
        int wordLen = word.length();
        String out = "";

        for (int i = 0; i < strLen-wordLen+1; i++) {
            String temp = str.substring(i,i+wordLen);
            if (temp.equals(word) && i>0) {
                out += str.charAt(i-1);
            }
            if (temp.equals(word) && i<strLen-wordLen) {
                out += str.charAt(i+wordLen);
            }
        }

        System.out.println("wordEnds function called");
        return out;

    }

}
