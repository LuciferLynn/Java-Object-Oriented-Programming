package class5;

import java.util.Random;

public class Dice {

    // 1. Data Members
    int maxNumberOfFaceValue;
    int minNumberOfFaceValue;
    int topValue;
    int accumulatedScore;
    String color;
    String size; // S,M,L

    // 2. Constructors
    Dice() {
        maxNumberOfFaceValue = 6;
        minNumberOfFaceValue = 1;
        topValue = 1;
        color = "white";
        size = "S";
    }

    // 3. Methods
    int rolls() {
        Random rand = new Random();
        int x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
        topValue = x;

        // extra rule (re-roll if topvalue is 6)
        if (topValue == 6) {
            x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
            topValue = x;
        }

        accumulatedScore += topValue;
        return topValue;
    }

    int rolls(int times) { // take the n^th topvalue only
        for (int i = 0; i < times; i++) {
            Random rand = new Random();
            int x = minNumberOfFaceValue + rand.nextInt(maxNumberOfFaceValue);
            topValue = x;
            accumulatedScore += topValue;
        }

        return topValue;
    }
}
