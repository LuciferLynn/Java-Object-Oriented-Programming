package Q1_6411271;

public class AString implements Complement {

    private String str;

    public AString(String str) {
        this.str = str;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    @Override
    public String takeComplement() {
        String out = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (Character.isLowerCase(temp)) {
                int newASCII = temp - 97 + 122 - ((temp - 97) * 2);
                //System.out.print((char)newASCII);
                out += (char) newASCII;
            } else {
                out += temp;
            }
        }
        setStr(out);
        return out; // not necessary

    }
}
