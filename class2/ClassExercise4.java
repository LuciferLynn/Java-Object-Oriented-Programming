package class2;

import java.util.Scanner;

public class ClassExercise4 {
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
        if (Math.max(a,b) == a) {
            return a;
        } else if (Math.max(a,b) == b) {
            return b;
        } else {
            return c;
        }
    }

}

