package class2;

import java.util.Scanner;

public class Exercise2 {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter your username");
        String username = reader.nextLine();
        System.out.println("Enter your password");
        String password = reader.nextLine();

        if (username.equals("Admin") && password.equals("0000")) {
            System.out.println("What is your name?");
            String name = reader.nextLine();
            if (name.equalsIgnoreCase("Lynn")) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied");
            }
        } else {
            System.out.println("Access Denied");
        }

        reader.close();

    }

}
