package designPattern_chain2;

public class Currency {

    private int amount;
    private String currency;

    Currency() {

    }

    Currency(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public int getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
