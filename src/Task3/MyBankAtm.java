package Task3;

import javax.naming.NameAlreadyBoundException;

public class MyBankAtm implements Atm {

    private double balance;

    public MyBankAtm(double balance) {
        this.balance = balance;
    }

    @Override
    public void withdrawUsingCreditCard(CreditCard creditCard, double amount) {
        if (balance - amount < 0) {
            throw new InsuficientAtmFundsException("Not enough balance at the ATM");
        } else {
            this.balance = balance - amount;
            creditCard.debit(amount);
            System.out.println("Current ATM balance: " + balance);
        }
    }

    @Override
    public void withdrawUsingDebitCard(DebitCard debitCard, double amount) {
        if (balance - amount < 0) {
            throw new InsuficientAtmFundsException("Not enough balance at the ATM");
        } else {
            this.balance = balance - amount;
            debitCard.debit(amount);
            System.out.println("Current ATM balance: " + balance);
        }
    }
}
