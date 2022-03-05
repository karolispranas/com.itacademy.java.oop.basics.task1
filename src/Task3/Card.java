package Task3;

public abstract class Card {

    double balance = 100;
    String cardHolderName = "Saulius";
    String cardNumber = "123456789";

    abstract double credit(double amount);

    abstract double debit(double amount);
}
