package Task3;

public class DebitCard extends Card {

    private double balance;

    @Override
    double credit(double amount) {
        if (balance - amount < 0) {
            throw new NotEnoughBalanceException("Not enough balance");
        } else {
            this.balance = balance - amount;
            System.out.println("Credit successful, current debit card balance: " + balance);
        }
        return 0;
    }

    @Override
    double debit(double amount) {
        this.balance = balance + amount;
        System.out.println("Current debit card balance: " + balance);
        return 0;
    }
}
