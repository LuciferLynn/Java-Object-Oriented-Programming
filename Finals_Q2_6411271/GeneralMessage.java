package Q2_6411271;

public class GeneralMessage extends Message implements ICipher{

    public GeneralMessage(String m) {
        super(m);
    }

    @Override
    public void printGoodFormat() {
        System.out.println("General Message: " + getMessage());
    }

    @Override
    public void encrypt() {
        System.out.println("This is general message with no encryption methods");
    }
}
