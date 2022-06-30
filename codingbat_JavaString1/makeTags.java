package codingbat_JavaString1;

public class makeTags {

    public static void main(String[] args) {
        System.out.println(makeTags("i", "Yay"));
    }

    public static String makeTags(String tag, String word) {
        return "<" + tag + ">" + word + "</" + tag + ">";
    }

}
