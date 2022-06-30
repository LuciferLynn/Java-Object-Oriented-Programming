package Q1_6411271;

public class AnInt implements Complement {

    private int number;

    public AnInt(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public Object takeComplement() {
        String temp = "";
        String temp2 = Integer.toBinaryString(number); // store in string array

        for (int i = 0; i < temp2.length(); i++) { // start replacing 0 with 1
            if (temp2.charAt(i)=='0') {
                temp += 1; // 0 to 1
            } else {
                temp += 0; // 1 to 0
            }
        }
        int newbin = Integer.parseInt(temp,2); // final touch
        setNumber(newbin);
        return newbin; // not necessary
    }
}
