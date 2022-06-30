package MQ3_6411271;

public class Graduate extends Student {

    // 1. Data members
    private int[] scores = new int[3]; // default int = 0
    //max size of array is 5 (declared)

    // 2. Constructors

    public Graduate() {
    }

    public Graduate(String id, String firstname, String lastname) {
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
        if (testNumber < scores.length && testNumber>=0 && score >=0 && score <=10) {
            // score must be 0 - 10
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
        return total_/3;
    }

    @Override
    public String toString() {
        return getId() + " Graduate " + totalScore();
    }
}
