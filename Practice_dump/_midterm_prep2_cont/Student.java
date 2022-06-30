package _midterm_prep2_cont;

import java.util.Arrays;

public class Student {
    private String id;
    private String firstname;
    private String lastname;
    private int[] scores;

    public Student(String id, String firstname, String lastname) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public int getScore(int testNumber) {
        return scores[testNumber];
    }

    public boolean setScore(int testNumber, int score) {
        if (testNumber < scores.length && testNumber>=0 && score>=0) {
            scores[testNumber] = score;
            return true;
        }
        return false;
    }

    public int totalscore() {
        int out = 0;
        for (int each:scores) {
            out += each;
        }
        return out;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id='" + id + '\'' +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", scores=" + Arrays.toString(scores) +
                '}';
    }
}
