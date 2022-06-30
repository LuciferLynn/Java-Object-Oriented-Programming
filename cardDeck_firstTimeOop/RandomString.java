package Homework_Assignments;

import com.sun.jdi.IntegerValue;

import java.util.Random;

public class RandomString {

    public static void main(String[] args) {

        String strings[] = {"J","K","Q","A"};

        for (String each:strings) {
            System.out.println(each);
        }

        Random rand = new Random();

        int select = rand.nextInt(strings.length);
        System.out.println("Your suit is: "+strings[select]);

        String myString = "9 of Club";
        String rank = myString.substring(0,1);
        int rank_int = Integer.valueOf(rank);
        System.out.println(rank);
        System.out.println(rank_int+2);
    }

}
