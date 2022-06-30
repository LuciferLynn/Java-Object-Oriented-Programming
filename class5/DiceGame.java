package class5;

public class DiceGame {

    // 1. Data members
    int numberOfDice;
    Dice dices[];
    int accumulatedScore;

    // 2. Constructors
    DiceGame() {
        numberOfDice = 1;
        dices = new Dice[numberOfDice];
        dices[0] = new Dice();
        accumulatedScore = 0;
    }

    DiceGame (int numberOfDice) {
        this.numberOfDice = numberOfDice;

        dices = new Dice[numberOfDice];

        for (int i = 0; i < numberOfDice; i++) {
            dices[i] = new Dice();
        }
        accumulatedScore = 0;
    }

    // 3. Methods
    int play() {
        int score = 0;
        for (Dice dice_play: dices) {
            int topValue = dice_play.rolls();
            score += topValue;
        }
        return score;
    }

}
