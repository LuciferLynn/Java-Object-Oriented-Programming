package Homework_Assignments;

public class cardGame {

    public static void main(String[] args) {

        Deck deck1 = new Deck();

        for (int i = 0; i < 1; i++) { // test with random
            System.out.println();

            String p1_card = deck1.draw_beta();
            System.out.println("Player 1 drew "+ p1_card);

            String p2_card = deck1.draw_beta();
            System.out.println("Player 2 drew "+ p2_card);

//            String p3_card = deck1.draw_beta();
//            System.out.println(("Player 3 drew " + p3_card));

            cardAndGames game_test = new cardAndGames(p1_card, p2_card);
            game_test.display_rankAndSuit();
            game_test.checkRankWinner_alpha();

            deck1.reset();
        }

        System.out.println("\n###\nTest for checkRankWinner_alpha if 2 cards have same rank but not suit");
        cardAndGames debug = new cardAndGames("Q of Diamond","Q of Club"); // same rank but not suit in cardAndGames()
        debug.display_rankAndSuit();
        debug.checkRankWinner_alpha();

        System.out.println("\n###\nTest for checkRankWinner_alpha when there is only one card in cardAndGames()");
        System.out.println("To test for game1 constructed with only one card/player");

        Deck deck_forTest = new Deck();
        String p1_cardBeta = deck_forTest.draw_beta();
        cardAndGames game_test2 = new cardAndGames(p1_cardBeta); // notice there is only one card in cardAndGames
        game_test2.display_rankAndSuit();
        game_test2.checkRankWinner_alpha();
        deck_forTest.reset();

        System.out.println("\n###\nTest for checkRankWinner_alpha when there is no card in cardAndGames()");
        System.out.println("To test for game1 constructed when there is no card or player");
        cardAndGames game_test3 = new cardAndGames(); // notice there is no card in cardAndGames
        game_test3.display_rankAndSuit();
        game_test3.checkRankWinner_alpha();
        deck_forTest.reset();

        System.out.println("\n#####\nFull auto for game1");
        cardAndGames game1_alpha = new cardAndGames();
        game1_alpha.game1_comparePower2cards_fullAuto();

        System.out.println("\n#####\nFull auto for game2");
        cardAndGames game2_alpha = new cardAndGames();
        game2_alpha.game2_2playerRankAccumulator_fullAuto(3);

        System.out.println("\n#####\n Game3: Playing 21");
        cardAndGames game3_alpha = new cardAndGames();
        game3_alpha.game3_21();
    }

}
