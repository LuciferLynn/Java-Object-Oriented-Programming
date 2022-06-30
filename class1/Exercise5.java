package class1;

import java.util.Scanner;

public class Exercise5 {

    /**
     * Exercise 5: If-else statement
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.print("Enter age: ");
        byte age = reader.nextByte();

        if (age >= 18) {
            System.out.print("You are allowed to enter!");
        } else {
            System.out.print("You are not allowed to enter!");
        }

        reader.close();

    }

}
