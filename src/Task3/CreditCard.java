package Task3;

public class CreditCard extends Card {

    private double interest;
    private double credit;
    private double balance;

    public CreditCard(double interest, double credit) {
        this.credit = credit;
        this.interest = interest;
    }

    @Override
    double credit(double amount) {
        if (balance - amount < balance - credit) {
            throw new NotEnoughCreditException("Not enough credit");
        } else {
            this.balance = balance - amount;
            System.out.println("Credit successful, current credit card balance: " + balance);
        }
        return 0;
    }

    @Override
    double debit(double amount) {
        this.balance = balance + amount - (amount / 100 * interest);
        System.out.println("Current credit card balance: " + balance);
        return 0;
    }
}
