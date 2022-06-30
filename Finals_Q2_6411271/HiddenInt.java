package Q2_6411271;

public class HiddenInt implements ICipher{

    private int number;
    private String encrypted_out;

    public HiddenInt(int n) {
        this.number = n;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getEncrypted_out() {
        return encrypted_out;
    }

    public void setEncrypted_out(String encrypted_out) {
        this.encrypted_out = encrypted_out;
    }

    @Override
    public void encrypt() {
        String out = Integer.toBinaryString(getNumber());
        setEncrypted_out(out);
        //System.out.println("Encrypted int: " + out);
    }
}
