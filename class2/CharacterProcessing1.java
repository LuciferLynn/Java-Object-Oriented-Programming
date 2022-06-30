package class2;

public class CharacterProcessing1 {

    public static void main(String[] args) {

        System.out.println("According to Character.IsDigit:");

        char checkIsDigit = '8';
        if (Character.isDigit(checkIsDigit)) {
            System.out.println(checkIsDigit + " is a digit");
        } else {
            System.out.println(checkIsDigit + "is not a digit");
        }

        char checkIsDigit2 = '#';
        if (Character.isDigit(checkIsDigit2)) {
            System.out.println(checkIsDigit2 + " is a digit");
        } else {
            System.out.println(checkIsDigit2 + " is not a digit");
        }

        System.out.println("According to Character.isLetter");
        char checkIsLetter = 'A';
        if (Character.isLetter(checkIsLetter)) {
            System.out.println(checkIsLetter + " is a letter");
        } else {
            System.out.println(checkIsLetter + "is not a letter");
        }
    }
}
