package class2;

import java.util.Scanner;

public class ClassExercise3 {
    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter an integer");
        int integer1 = reader.nextInt();

        System.out.println("Enter another integer");
        int integer2 = reader.nextInt();

        System.out.println("Enter another integer");
        int integer3 = reader.nextInt();

        System.out.println(largest(integer1,integer2,integer3) + " is the largest value");

    }

    public static int largest(int a, int b, int c) {
        if (a > b && a > c) {
            return a;
        } else if (b > a && b > c) {
            return b;
        } else {
            return c;
        }
    }

}
