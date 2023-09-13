package ro.fasttrackit.bank;

public class InternetBankAccount extends BankAccount {
    public InternetBankAccount(String accountNumber, String accountHolderName) {
        super(accountNumber, accountHolderName);
    }

    public InternetBankAccount(String accountNumber, String accountHolderName, double balance) {
        super(accountNumber, accountHolderName, balance);
    }


}
