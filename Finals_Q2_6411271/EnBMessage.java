package Q2_6411271;

import org.w3c.dom.ls.LSOutput;

public class EnBMessage extends Message implements ICipher{

    public EnBMessage(String m) {
        super(m);
    }

    @Override
    public void encrypt() {
        char c;
        int ascii;
        int newAscii;
        String out = "";

        for (int i = 0; i < getMessage().length(); i++) {
            c = getMessage().charAt(i);
            ascii = c;
            newAscii = c+2;
            out += (char)newAscii;
        }
        //System.out.println(out);
        setMod_message(out);
    }


    @Override
    void printGoodFormat() {
        System.out.println("Encryption B: " + getMessage());
    }

    public void printModifiedFormat() {
        System.out.println("EnB after modification: " + getMod_message());
    }
}
