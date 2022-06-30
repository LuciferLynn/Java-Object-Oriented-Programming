package class4;

public class CheckingAccountMain {

    public static void main(String[] args) {

        CheckingAccount member1 = new CheckingAccount();
        member1.owner = "Fair";
        member1.balance = 10000;
        member1.counter += 1;

        member1.deposit(5000); // balance + 5000 = 15000
        member1.printBalance();

        member1.withdraw(10000); // balance - 10000 = 5000
        member1.printBalance();


    }

}
