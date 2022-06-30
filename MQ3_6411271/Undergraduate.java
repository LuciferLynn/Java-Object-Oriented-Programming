package MQ3_6411271;

import java.util.Arrays;

public class Undergraduate extends Student{

    // 1. Data members
    private int[] scores = new int[5]; // default int = 0
    //max size of array is 5 (declared)

    // 2. Constructors

    public Undergraduate() {
    }

    public Undergraduate(String id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    // 3. Methods

    @Override
    public int[] getScores() {
        return scores;
    }

    @Override
    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public int getScore(int testNumber) {
        return scores[testNumber];
    }

    public boolean setScore (int testNumber, int score) {
        if (testNumber < scores.length && testNumber>=0 && score >=0 && score <=5) {
            // score must be 0 - 5
            scores[testNumber] = score;
            return true;
        }
        return false;
    }

    @Override
    public int totalScore() {
        int total_ = 0;
        for (int each: scores) {
            total_ += each;
        }
        return total_/5;
    }

    @Override
    public String toString() {
        return getId() + " Undergraduate " + totalScore();
    }
}
