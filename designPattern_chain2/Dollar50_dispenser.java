package designPattern_chain2;

public class Dollar50_dispenser implements Chain {

    public Dollar50_dispenser() {

    }

    private Chain nextInChain;

    @Override
    public void setNext(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    public boolean valid_amt(Currency c) {
        if (c.getAmount() % 5 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public void dispense(Currency req_Amount) {
        if (req_Amount.getCurrency() == "USD") {
            if (valid_amt(req_Amount)) {
                if (req_Amount.getAmount() >= 50) {
                    int count = req_Amount.getAmount() / 50;
                    int remaining = req_Amount.getAmount() % 50;
                    System.out.println("Dispensing " + count + " $50 note(s)");
                    if (remaining != 0) {
                        System.out.println("    $" + remaining + " remaining");
                        System.out.println("    Next chain in sequence called");
                        this.nextInChain.dispense(new Currency(remaining, "USD"));
                    } else {
                        System.out.println("\nSuccessfully dispensed full amount\nEnd of line");
                    }
                } else {
                    System.out.println("    Next chain in sequence called");
                    this.nextInChain.dispense(req_Amount);
                }
            } else {
                System.out.println("Invalid amount detected. Amount should be in multiples of 5.");
            }
        } else {
            System.out.println("Sorry, this ATM only works for USD dollars");
        }
    }
}
