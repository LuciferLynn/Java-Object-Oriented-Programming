package class2;

import java.util.Scanner;

public class Exercise4 {

    /**
     * Exercise 4: Function declaration
     */

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        System.out.println("Enter a: ");
        double a = reader.nextDouble();
        System.out.println("Enter b: ");
        double b = reader.nextDouble();

        double output = hypotenuse(a,b);
        System.out.println(output);
    }

    public static double hypotenuse(double a, double b)   {
        return Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    }

}
