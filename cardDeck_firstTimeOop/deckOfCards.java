package Homework_Assignments;

import java.util.ArrayList;
import java.util.Arrays;

public class deckOfCards {
    // 1. Data members
    String club[];
    String diamond[];
    String heart[];
    String spade[];
    String _fullDeck[][];

    // 2. Constructors

    deckOfCards() {
        club = new String[] {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        diamond = new String[] {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        heart = new String[] {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        spade = new String[] {"A","2","3","4","5","6","7","8","9","J","Q","K"};

        _fullDeck = new String[][] {club,diamond,heart,spade};

    }


    // 3, Methods


    public static void main(String[] args) {
        deckOfCards deck1 = new deckOfCards();
        for (int i = 0; i < deck1.club.length; i++) {
            System.out.println(deck1.club[i]);
        }
        System.out.println(deck1._fullDeck[0][5]);
    }

}
