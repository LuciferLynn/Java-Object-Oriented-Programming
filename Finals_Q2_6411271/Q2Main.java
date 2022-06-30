package Q2_6411271;

public class Q2Main {
    public static void main(String[] args) {
        EnAMessage m1= new EnAMessage("Hello");
        EnBMessage m2= new EnBMessage("Hello");
        GeneralMessage message_ = new GeneralMessage("Hello");
        HiddenInt i1 = new HiddenInt(12);

        System.out.println(m1.getMessage());
        m1.encrypt();
        m1.printModifiedFormat();
        m1.printGoodFormat();
        System.out.println();

        System.out.println(m2.getMessage());
        m2.encrypt();
        m2.printModifiedFormat();
        m2.printGoodFormat();
        System.out.println();

        System.out.println(message_.getMessage());
        message_.encrypt();
        message_.printGoodFormat();
        System.out.println();

        System.out.println(i1.getNumber());
        i1.encrypt();
        System.out.println("Encrypted int: " + i1.getEncrypted_out());
    }
}
