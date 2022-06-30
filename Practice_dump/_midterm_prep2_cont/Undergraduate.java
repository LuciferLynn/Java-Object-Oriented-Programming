package _midterm_prep2_cont;

public class Undergraduate extends Student{

    private String seniorProjectTitle;
    private int[] scores = new int[5];

    public Undergraduate(String id, String firstname, String lastname) {
        super(id, firstname, lastname);
    }

    public String getSeniorProjectTitle() {
        return seniorProjectTitle;
    }

    public void setSeniorProjectTitle(String seniorProjectTitle) {
        this.seniorProjectTitle = seniorProjectTitle;
    }

    public int totalScore() {
        int out = 0;
        return out;

    }

    @Override
    public String toString() {
        return "Undergraduate{" +
                "seniorProjectTitle='" + seniorProjectTitle + '\'' +
                '}';
    }
}
