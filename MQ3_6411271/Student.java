package MQ3_6411271;

import java.util.Arrays;

public class Student {

    // 1. Data members
    private String id;
    private String firstname;
    private String lastname;
    private int[] scores = new int[5]; // default int = 0

    // 2. Constructors
    Student() {

    }
    public Student (String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    // 3. Methods

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int[] getScores() {
        return scores;
    }

    public void setScores(int[] scores) {
        this.scores = scores;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getScore(int testNumber) {
        return scores[testNumber];
    }

    public boolean setScore (int testNumber, int score) {
        if (testNumber < scores.length && testNumber>=0) { // testNumber will start from zero
            scores[testNumber] = score;
            return true;
        }
        return false;
    }

    public int totalScore() {
        int total = 0;
        for (int each: scores) {
            total += each;
        }
        return total;
    }

    @Override
    public String toString() {
        return id + " " + firstname + " " + lastname;
    }
}
