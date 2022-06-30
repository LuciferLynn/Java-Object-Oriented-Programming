package Homework_Assignments;

import java.util.Scanner;

public class cardAndGames {

    // 1. Data members
    String suit;
    String suit2;

    int rankValue;
    int suitValue;

    int rankValue2;
    int suitValue2;

    String string_card;
    String string_card2;

    // 2. Constructors

    cardAndGames() {
        rankValue = 0;
        suitValue = 0;
        string_card = "Player 1 not found";
        suit = "Player 1 not found";

        rankValue2 = 0;
        suitValue2 = 0;
        string_card2 = "Player 2 not found";
        suit2 = "Player 2 not found";
    }

    cardAndGames(String onlyOneCard) {
        rankValue = toPowerValue(onlyOneCard);
        suitValue = tosuitPower(onlyOneCard);
        string_card = onlyOneCard;
        suit = onlyOneCard.substring(5);

        rankValue2 = 0;
        suitValue2 = 0;
        string_card2 = "Player 2 not found";
        suit2 = "Player 2 not found";
    }

    cardAndGames(String _fullCard_, String _fullCard2_) {

        rankValue = toPowerValue(_fullCard_);
        suitValue = tosuitPower(_fullCard_);
        suit = _fullCard_.substring(5);
        string_card = _fullCard_;

        rankValue2 = toPowerValue(_fullCard2_);
        suitValue2 = tosuitPower(_fullCard2_);
        suit2 = _fullCard2_.substring(5);
        string_card2 = _fullCard2_;
    }

    // 3. Methods

    void display_rankAndSuit() {
        System.out.println();

        if (string_card.equals("Player 1 not found")) {
            System.out.println("Player 1 could not be found for display_rankAndSuit");
        } else {
            System.out.println("1st card suit: " + suit);
            System.out.println("1st card rank: " + rankValue);
            System.out.println("1st card: " + string_card);
        }

        System.out.println();

        if (string_card2.equals("Player 2 not found")) {
            System.out.println("Player 2 could not be found for display_rankAndSuit");
        } else {
            System.out.println("2nd card suit " + suit2);
            System.out.println("2nd card rank " + rankValue2);
            System.out.println("2nd card: " + string_card2);
        }
    }

    void game1_comparePower2cards_fullAuto() {
        Deck deck_forGame1 = new Deck();
        String p1card = deck_forGame1.draw_beta();
        String p2card = deck_forGame1.draw_beta();

        display_rankAndSuitFunction(p1card);
        display_rankAndSuitFunction(p2card);

        int p1_rankPower = toPowerValue(p1card);
        int p2_rankPower = tosuitPower(p1card);
        int p1_suitPower = toPowerValue(p2card);
        int p2_suitPower = toPowerValue(p2card);

        System.out.println();

        if (p1_rankPower > p2_rankPower) {
            System.out.println("Player 1 wins by higher rank!");
        } else if (p2_rankPower > p1_rankPower) {
            System.out.println("Player 2 wins by higher rank!");
        } else {
            if (p1_suitPower > p2_suitPower) {
                System.out.println("Player 1 wins by higher suit!");
            } else if (p2_suitPower > p1_suitPower) {
                System.out.println("Player 2 wins by higher suit!");
            } else {
                System.out.println("Both players drew the same card! How??");
            }
        }
        deck_forGame1.reset();
    }

    void checkRankWinner_alpha() {
        System.out.println();

        if (string_card.equals("Player 1 not found")) {
            System.out.println("Player 1 could not be found for checkRankWinner_alpha");
            System.out.println("Cannot check overall winner because there is no player");
        } else {
            if (string_card2.equals("Player 2 not found")) {
                System.out.println("Player 2 could not be found for checkRankWinner_alpha");
                System.out.println("Cannot check overall winner because there is only one player");
            } else {
                if (rankValue > rankValue2) {
                    System.out.println("Player 1 wins by higher rank!");
                } else if (rankValue2 > rankValue) {
                    System.out.println("Player 2 wins by higher rank!");
                } else {
                    if (suitValue > suitValue2) {
                        System.out.println("Player 1 wins by higher suit!");
                    } else if (suitValue2 > suitValue2) {
                        System.out.println("Player 2 wins by higher suit");
                    } else if (suitValue == suitValue2) {
                        System.out.println("Both players drew the same card!");
                    } else {
                        System.out.println("Error in checkRankWinner_alpha");
                    }
                }
            }
        }
    }

    void game2_2playerRankAccumulator_fullAuto(int num_cardEachPlayer) {
        // the value for num_EachPlayer should not be a huge number
            // values for Ace and different face cards for this game are as follows
                // J = 10, Q = 11, K = 12, A = 13

        Deck deck_forGame2 = new Deck();

        String p1_card[] = new String[num_cardEachPlayer];
        String p2_card[] = new String[num_cardEachPlayer];

        int p1_total = 0;
        int p2_total = 0;

        System.out.println();

        for (int i = 0; i < num_cardEachPlayer; i++) {
            p1_card[i] = deck_forGame2.draw_beta();
            System.out.println("Round #"+(i+1)+": Player 1 drew a " + deck_forGame2.drawn_card);

            p2_card[i] = deck_forGame2.draw_beta();
            System.out.println("Round #"+(i+1)+": Player 2 drew a " + deck_forGame2.drawn_card);

            p1_total += toPowerValue(p1_card[i]);
            p2_total += toPowerValue(p2_card[i]);
        }

        System.out.println("Player 1 has an accumulated Rank Score of " + p1_total);
        System.out.println("Player 2 has an accumulated Rank Score of " + p2_total);

        if (p1_total>p2_total) {
            System.out.println("Player 1 has a higher Rank Power in total.");
            System.out.println("Player 1 wins!");
        } else if (p2_total>p1_total) {
            System.out.println("Player 2 has a higher Rank Power in total.");
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("Both players has the same Rank Power.");
            System.out.println("Its a draw!");
        }

    }

    void game3_21() {

        int p1_x;
        int p2_x;

        int accumulatedP1score_21;
        int accumulatedP2score_21;

        String p1_drawnCard_21;
        String p2_drawnCard_21;

        String winner = "";

        Deck deck_forGame3 = new Deck();

        accumulatedP1score_21 = 0;

        Scanner reader = new Scanner(System.in);

        System.out.println("Enter 0 to quit for P1, any other integer to draw for P1");
        p1_x = reader.nextInt();

        while (p1_x != 0) {

            p1_drawnCard_21 = deck_forGame3.draw_beta();

            System.out.println("Player 1 drew a " + p1_drawnCard_21);

            accumulatedP1score_21 += toValueNumber_for21(p1_drawnCard_21);

            if (accumulatedP1score_21 > 21) {
                System.out.println("Player 1 now has an accumulated score of " + accumulatedP1score_21);
                System.out.println("> Player 1 has automatically lost for exceeding 21!");
                winner = "Player 2";
            } else {
                if (accumulatedP1score_21==21) {
                    System.out.println("Player 1 now has an accumulated score of " + accumulatedP1score_21);
                    System.out.println("> Player 1 has automatically won for getting 21!");
                    winner = "Player 1";
                } else {
                    System.out.println("Player 1 now has an accumulated score of " + accumulatedP1score_21);
                }
            }

            System.out.println("(If you have already won or lost, please press 0 to quit");
            System.out.println("Not pressing 0 after having won or lost will lead to complications within the program)");
            System.out.println("Enter 0 to quit for P1, any other integer to draw for P1");
            p1_x = reader.nextInt();
        }

        accumulatedP2score_21=0;

        if (winner.equals("Player 1")) {
            System.out.println("\nPLAYER 1 IS THE WINNER BECAUSE PLAYER 1 GOT EXACTLY 21!");
        } else if (winner.equals("Player 2")) {
            System.out.println("\nPlayer 2 IS THE WINNER BECAUSE PLAYER 1 EXCEEDED 21!");
        } else {
            System.out.println("\nPlayer 2's turn\n");
            System.out.println("Enter 0 to quit for P2, any other integer to draw for P2");
            p2_x = reader.nextInt();

            while (p2_x != 0) {

                p2_drawnCard_21 = deck_forGame3.draw_beta();

                System.out.println("Player 2 drew a " + p2_drawnCard_21);

                accumulatedP2score_21 += toValueNumber_for21(p2_drawnCard_21);

                if (accumulatedP2score_21 > 21) {
                    System.out.println("Player 2 now has an accumulated score of " + accumulatedP2score_21);
                    System.out.println("> Player 2 has automatically lost for exceeding 21!");
                    winner = "Player 1";
                } else {
                    if (accumulatedP2score_21==21) {
                        System.out.println("Player 2 now has an accumulated score of " + accumulatedP2score_21);
                        System.out.println("> Player 2 has automatically won for getting 21!");
                        winner = "Player 2";
                    } else {
                        System.out.println("Player 2 now has an accumulated score of " + accumulatedP2score_21);
                    }
                }

                System.out.println("(If you have already won or lost, please press 0 to quit");
                System.out.println("Not pressing 0 after having won or lost will lead to complications within the program)");
                System.out.println("Enter 0 to quit for P2, any other integer to draw for P2");
                p2_x = reader.nextInt();
            }

            if (winner.equals("Player 1")) {
                System.out.println("\nPLAYER 1 IS THE WINNER BECAUSE PLAYER 2 EXCEEDED 21!");
            } else if (winner.equals("Player 2")) {
                System.out.println("\nPLAYER 2 IS THE WINNER BECAUSE PLAYER 2 GOT EXACTLY 21!");
            } else {
                if (accumulatedP1score_21>accumulatedP2score_21) {
                    System.out.println("\nPLAYER 1 IS THE WINNER BECAUSE PLAYER 1 GOT A HIGHER SCORE!");
                } else if (accumulatedP2score_21>accumulatedP1score_21) {
                    System.out.println("\nPLAYER 2 IS THE WINNER BECAUSE PLAYER 2 GOT A HIGHER SCORE!");
                } else {
                    System.out.println("\nIT'S A DRAW!");
                }
            }
        }
    }

    void checkWinner_beta(String card1, String card2) {
        // This code is never used, I only kept it as a pseudo-backup

        int int_rank1;
        int int_rank2;
        int int_suit1;
        int int_suit2;

        int_rank1 = toPowerValue(card1);
        int_rank2 = toPowerValue(card2);
        int_suit1 = tosuitPower(card1);
        int_suit2 = tosuitPower(card2);

        if (int_rank1 > int_rank2) {
            System.out.println("Player 1 wins by higher rank!");
        } else if (int_rank2 > int_rank1) {
            System.out.println("Player 2 wins by higher rank!");
        } else {
            System.out.println("Same rank number!");
            if (int_suit1 > int_suit2) {
                System.out.println("Player 1 wins by higher suit!");
            } else if (int_suit2 > int_suit1) {
                System.out.println("Player 2 wins by higher suit!");
            } else {
                System.out.println("Its a miracle! Both players drew the same card!");
            }
        }

    }

    public static int toPowerValue(String card_toPowerValue) {

        // this code is inefficient and ugly, but I'm scared to mess with it
        // my whole code depends on this TwT

        String toCheck = card_toPowerValue.substring(0, 1);
        String str_power = "";
        int int_power = 0;

        if (toCheck.equals("J")) {
            str_power = "10";
            int_power = Integer.valueOf(str_power);
        } else if (toCheck.equals("Q")) {
            str_power = "11";
            int_power = Integer.valueOf(str_power);
        } else if (toCheck.equals("K")) {
            str_power = "12";
            int_power = Integer.valueOf(str_power);
        } else if (toCheck.equals("A")) {
            str_power = "11";
            int_power = Integer.valueOf(str_power);
        } else {
            str_power = toCheck;
            int_power = Integer.valueOf(str_power);
        }
        return int_power;
    }

    public static int tosuitPower(String suit_toPowerValue) {

        // this code is inefficient and ugly, but I'm scared to mess with it
        // my whole code depends on this TwT

        int int_suitPower = 0;

        String suit_toCheck = suit_toPowerValue.substring(5);
        switch (suit_toCheck) {
            case "Spade" -> int_suitPower = 4;
            case "Diamond" -> int_suitPower = 3;
            case "Heart" -> int_suitPower = 2;
            case "Club" -> int_suitPower = 1;
            default -> System.out.println("Something went wrong in suitPower function");
        }

        return int_suitPower;

    }

    public static int toValueNumber_for21(String card_toValueNumberfor21) {
        String checkRank_21 = card_toValueNumberfor21.substring(0,1);
        int return_ValueNumber = 0;
        if (checkRank_21.equals("A")) {
            return_ValueNumber = 11;
        } else if (checkRank_21.equals("J") || checkRank_21.equals("Q") || checkRank_21.equals("K")) {
            return_ValueNumber = 10;
        } else {
            return_ValueNumber = Integer.valueOf(checkRank_21);
        }
        return return_ValueNumber;
    }

    public static void display_rankAndSuitFunction(String card_toDisplay) {
        System.out.println();

        if (card_toDisplay.equals("Player 1 not found")) {
            System.out.println("Player 1 not found");
        } else {
            System.out.println("1st card suit: " + card_toDisplay.substring(5));
            System.out.println("1st card rank: " + card_toDisplay.charAt(0));
            System.out.println("1st card: " + card_toDisplay);
        }
    }

}
