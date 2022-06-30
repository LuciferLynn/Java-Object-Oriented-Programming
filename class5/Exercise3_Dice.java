package class5;

public class Exercise3_Dice {

    public static void main(String[] args) {

        Dice dice1 = new Dice();

        System.out.println(dice1.topValue);

        dice1.rolls();

        System.out.println(dice1.topValue);

        dice1.rolls();
        dice1.rolls();
        dice1.rolls();
        dice1.rolls();
        dice1.rolls();
        dice1.rolls(100);
        System.out.println(dice1.accumulatedScore);

    }

}
