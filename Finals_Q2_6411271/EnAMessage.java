package Q2_6411271;

public class EnAMessage extends Message implements ICipher{

    public EnAMessage(String m) {
        super(m);
    }

    public void printModifiedFormat() { // this could be an abstract method in its superclass
        System.out.println("EnA after modification: " + getMod_message());
    }

    @Override
    public void printGoodFormat() {
        System.out.println("Encryption A: " + getMessage());
    }

    @Override
    public void encrypt() {
        String out = "";

        char[] temp = getMessage().toCharArray();

        for (int i = temp.length - 1; i >= 0; i--)
            out += temp[i];

        //System.out.println(out);
        setMod_message(out);
    }

}
