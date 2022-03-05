package Task3;

public interface Atm {
    void withdrawUsingCreditCard(CreditCard creditCard, double amount);

    void withdrawUsingDebitCard(DebitCard debitCard, double amount);
}
