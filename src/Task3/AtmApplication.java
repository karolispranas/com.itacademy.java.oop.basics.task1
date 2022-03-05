package Task3;

public class AtmApplication {
    public static void main(String[] args) {

        Card creditCard = new CreditCard(2, 100);
        Card debitCard = new DebitCard();

        Atm myBankAtm = new MyBankAtm(1000);

        try {
            myBankAtm.withdrawUsingDebitCard((DebitCard) debitCard, 10000);
        } catch (InsuficientAtmFundsException insuficientAtmFundsException) {
            System.out.println(insuficientAtmFundsException.getMessage());
        }

        try {
            myBankAtm.withdrawUsingCreditCard((CreditCard) creditCard, 10000);
        } catch (InsuficientAtmFundsException insuficientAtmFundsException) {
            System.out.println(insuficientAtmFundsException.getMessage());
        }

        try {
            creditCard.credit(1000);
        } catch (NotEnoughCreditException notEnoughCreditException) {
            System.out.println(notEnoughCreditException.getMessage());
        }

        try {
            debitCard.credit(1000);
        } catch (NotEnoughBalanceException notEnoughBalanceException) {
            System.out.println(notEnoughBalanceException.getMessage());
        }


    }
}
