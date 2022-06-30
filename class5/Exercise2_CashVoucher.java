package class5;

import java.text.ParseException;

public class Exercise2_CashVoucher {

    public static void main(String[] args) throws ParseException {

        CashVoucher voucher1 = new CashVoucher("97A89345",100,"31/01/2021");
        voucher1.redeem(60);
        voucher1.redeem(20);
        voucher1.printBalance();
        voucher1.redeem(20);
        System.out.println();

        System.out.println("validity check");
        boolean isValid = voucher1.checkValidity();
        System.out.println(isValid);
    }

}
