package class5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CashVoucher {

    // 1. Data members
    String code;
    double amount;
    String expiryDate;

    // 2. Constructors
    CashVoucher(String code, double amount, String expiryDate) {
        this.code = code;
        this.amount = amount;
        this.expiryDate = expiryDate;
    }

    // 3. Methods
    void redeem(double amountToBeCut) throws ParseException {
        if (checkValidity()) {
            if (amount < amountToBeCut) {
                System.out.println("Insufficient Balance");
            } else {
                amount -= amountToBeCut;
                System.out.println("Transaction Approved");
            }
        } else {
            System.out.println("Voucher Expired");
        }
    }

    void printBalance() {
        System.out.println("Balance: " + amount);
    }

    boolean checkValidity() throws ParseException {
        Date today = new Date();

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date expiryDate = sdf.parse(this.expiryDate);

        if (today.after(expiryDate)) {
            return false;
        } else {
            return true;
        }
    }

}
