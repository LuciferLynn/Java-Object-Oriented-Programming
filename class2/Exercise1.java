package class2;

public class Exercise1 {

    public static void main(String[] args) {
        System.out.println();

        int num = '7' - '0';
        System.out.println("The result of '7' - '0' is " + num);

        int char7 = '7';
        System.out.println("The ASCII value of '7' is " + char7);

        int char0 = '0';
        System.out.println("The ASCII value of '0' is " + char0);

        // 8-bit code ASCII code
        for (int i = 0; i < 256; i++) {
            System.out.println("#" + i + ": " + (char)i);
        }
        // Keep in mind for the usage of (char) for character conversion
        System.out.println((char)65);
    }

}
