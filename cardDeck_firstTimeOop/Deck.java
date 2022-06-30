package Homework_Assignments;

import java.util.Random;

public class Deck {

    // 1. Data members

    String[] club = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
    String[] diamond = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
    String[] heart = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
    String[] spade = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
    String[][] fullDeck = {club, diamond, heart, spade};
    String drawn_card = "";
    String drawn_suit = "";
    String drawn_rank = "";

    // 2. Constructors


    // 3, Methods
    String draw_beta () { // draw and replace drawn card into deck

        // the deck should be reset after a few times because there is some inconsistency in the method
        // if the draw method is used several times without resetting the deck
        // some suits will no longer have any cards left
        // which leads to more problems

        Random rand = new Random();
        int suit_select_beta = rand.nextInt(4);
        if (suit_select_beta==0) {
            drawn_suit = "Club";
            int rank_select_beta = rand.nextInt(club.length);
            while (fullDeck[0][rank_select_beta].equals("")) { // so that the same card from the suit isn't drawn the next time
                rank_select_beta = rand.nextInt(club.length);
            }
            drawn_rank = fullDeck[0][rank_select_beta];
            fullDeck[0][rank_select_beta] = ""; // so that the same card from the suit isn't drawn the next time
        } else if (suit_select_beta==1) {
            drawn_suit = "Diamond";
            int rank_select_beta = rand.nextInt(diamond.length);
            while (fullDeck[1][rank_select_beta].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select_beta = rand.nextInt(diamond.length);
            }
            drawn_rank = fullDeck[1][rank_select_beta];
            fullDeck[1][rank_select_beta] = "";// so that the same card from the suit isn't drawn the next time
        } else if (suit_select_beta==2) {
            drawn_suit = "Heart";
            int rank_select_beta = rand.nextInt(heart.length);
            while (fullDeck[2][rank_select_beta].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select_beta = rand.nextInt(heart.length);
            }
            drawn_rank = fullDeck[2][rank_select_beta];
            fullDeck[2][rank_select_beta] = "";// so that the same card from the suit isn't drawn the next time
        } else {
            drawn_suit = "Spade";
            int rank_select_beta = rand.nextInt(spade.length);
            while (fullDeck[3][rank_select_beta].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select_beta = rand.nextInt(spade.length);
            }
            drawn_rank = fullDeck[3][rank_select_beta];
            fullDeck[3][rank_select_beta] = "";// so that the same card from the suit isn't drawn the next time
        }

        drawn_card = drawn_rank + " of " + drawn_suit;
        return drawn_card;
    }

    void draw()  { // draw and replace drawn card into deck

        // i made a better version for draw() so I didn't use this, but I like to keep this as a pseudo-backup
        // the deck should be reset after a few times because there is some inconsistency in the method
            // if the draw method is used several times without resetting the deck
                // some suits will no longer have any cards left
                    // which leads to more problems

        Random rand = new Random();

        int suit_select = rand.nextInt(4);

        if (suit_select==0) {
            drawn_suit = "Club";
            int rank_select = rand.nextInt(club.length);
            while (fullDeck[0][rank_select].equals("")) { // so that the same card from the suit isn't drawn the next time
                rank_select = rand.nextInt(club.length);
            }
            drawn_rank = fullDeck[0][rank_select];
            fullDeck[0][rank_select] = ""; // so that the same card from the suit isn't drawn the next time
        } else if (suit_select==1) {
            drawn_suit = "Diamond";
            int rank_select = rand.nextInt(diamond.length);
            while (fullDeck[1][rank_select].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select = rand.nextInt(diamond.length);
            }
            drawn_rank = fullDeck[1][rank_select];
            fullDeck[1][rank_select] = "";// so that the same card from the suit isn't drawn the next time
        } else if (suit_select==2) {
            drawn_suit = "Heart";
            int rank_select = rand.nextInt(heart.length);
            while (fullDeck[2][rank_select].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select = rand.nextInt(heart.length);
            }
            drawn_rank = fullDeck[2][rank_select];
            fullDeck[2][rank_select] = "";// so that the same card from the suit isn't drawn the next time
        } else {
            drawn_suit = "Spade";
            int rank_select = rand.nextInt(spade.length);
            while (fullDeck[3][rank_select].equals("")) {// so that the same card from the suit isn't drawn the next time
                rank_select = rand.nextInt(spade.length);
            }
            drawn_rank = fullDeck[3][rank_select];
            fullDeck[3][rank_select] = "";// so that the same card from the suit isn't drawn the next time
        }

        drawn_card = drawn_rank + " of " + drawn_suit;

    }

    void reset() {
        fullDeck = resetDeck(fullDeck);
    }

    public static String[][] resetDeck (String[][] deck_toReset) {
        String[] club = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        String[] diamond = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        String[] heart = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        String[] spade = {"A","2","3","4","5","6","7","8","9","J","Q","K"};
        String[][] freshDeck_ = {club, diamond, heart, spade};

        return freshDeck_;
    }

}
