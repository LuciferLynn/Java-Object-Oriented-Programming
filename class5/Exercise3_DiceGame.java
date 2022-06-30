package class5;

public class Exercise3_DiceGame {

    public static void main(String[] args) {

        int n = 4;

        DiceGame game = new DiceGame(n);
        int score = game.play();

        for (int i = 0; i < n; i++) {
            System.out.println("Dice" + i + ": " + game.dices[i].topValue);
        }

        System.out.println("Total: "+score);
    }

}
