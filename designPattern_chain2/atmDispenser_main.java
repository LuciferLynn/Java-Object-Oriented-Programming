package designPattern_chain2;

public class atmDispenser_main {

    public static void main(String[] args) {

        Chain c1 = new Dollar50_dispenser();
        Chain c2 = new Dollar20_dispenser();
        Chain c3 = new Dollar10_dispenser();
        Chain c4 = new Dollar5_dispenser();
        Chain c5 = new Dollar2_dispenser();
        Chain c6 = new Dollar1_dispenser();

        c1.setNext(c2);
        c2.setNext(c3);
        c3.setNext(c4);
        // c4.setNext(c5);
        // c5.setNext(c6);

        c1.dispense(new Currency(530, "USD"));
        System.out.println();


        c1.dispense(new Currency(538, "USD"));
        System.out.println();

        c1.dispense(new Currency(530, "Baht"));
        System.out.println();


    }

}
