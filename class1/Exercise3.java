package class1;

import java.util.Scanner;

public class Exercise3 {

    /**
     * Exercise 3: Ask user inputs with Scanner
     */

    public static void main(String[] args) {

        Scanner reader =  new Scanner (System.in);

        System.out.print("Enter first name: ");
        String firstname = reader.nextLine();
        System.out.print("Enter last name: ");
        String lastname = reader.nextLine();
        System.out.print("Enter your mmr: ");
        String mmr = reader.nextLine();
        System.out.print("Enter age: ");
        byte age = reader.nextByte();

        System.out.println();
        System.out.println("Hello World! ");
        System.out.println("I'm " + age + " years old.");
        System.out.println("My name is " + firstname + lastname + ".");
        System.out.print("My mmr is " + mmr + ".");
        System.out.print(" pls help.");

        reader.close();

    }

}
