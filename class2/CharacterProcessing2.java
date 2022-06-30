package class2;

public class CharacterProcessing2 {
    public static void main(String[] args) {
        System.out.println();

        System.out.println("According to Character.isLowerCase");
        char checkIsLowerCase = 'p';
        if (Character.isLowerCase(checkIsLowerCase)) {
            System.out.println(checkIsLowerCase + " is a lowercase letter");
        } else {
            System.out.println(checkIsLowerCase + "is not a lowercase letter");
        }

        System.out.println("According to Character.isUpperCase");
        char checkIsUpperCase = 'P';
        if (Character.isUpperCase(checkIsUpperCase)) {
            System.out.println(checkIsUpperCase + " is a lowercase letter");
        } else {
            System.out.println(checkIsUpperCase + "is not a lowercase letter");
        }

        System.out.println();

        char smallcase = 'a';
        System.out.println("According to Character.toUpperCase:");
        System.out.println(smallcase + " is converted to " + Character.toUpperCase(smallcase));

        char bigcase = 'B';
        System.out.println("According to Character.toLowerCase");
        System.out.println(bigcase + " is converted to " + Character.toLowerCase(bigcase));

    }
}
