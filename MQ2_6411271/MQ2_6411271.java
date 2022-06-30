package MQ2_6411271;

public class MQ2_6411271 {

    public static void main(String[] args) {
        System.out.println(removeStars("ab*cd"));
        System.out.println(removeStars("a*b"));
        System.out.println(removeStars("star"));
        System.out.println(removeStars("juststartexam"));
        System.out.println(removeStars("xastarbd"));
        System.out.println(removeStars("abcstardef"));
        System.out.println(removeStars("haa*bcstarde*fha"));
        System.out.println(removeStars("aa*bcstarde*ff"));
        System.out.println(removeStars("abcd*"));
        System.out.println(removeStars("*abcd*"));
    }

    public static String removeStars(String inStr) {

        String modified_str = inStr.replace("star","*");

        int len = modified_str.length();
        String out = "";
        for (int i = 0; i < len; i++) {
            if (i == 0 && modified_str.charAt(i) != '*') {
                out += modified_str.charAt(i);
            }

            if (i > 0 && modified_str.charAt(i) != '*'
                    && modified_str.charAt(i-1) != '*') {
                out += modified_str.charAt(i);
            }

            if (i > 0 && modified_str.charAt(i) == '*'
                    && modified_str.charAt(i-1) != '*') {
                out = out.substring(0,out.length()-1);
            }
        }
        return out;
    }

}
