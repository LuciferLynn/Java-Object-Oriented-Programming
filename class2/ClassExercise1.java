package class2;

import java.util.Scanner;

public class ClassExercise1 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter an integer");
        int integer = reader.nextInt();

        System.out.println(ispositive(integer));

    }

    public static String ispositive(int a) {
        if (a >= 0) {
            return ("The integer is positive");
        } else {
            return ("The integer is negative");
        }
    }
}
