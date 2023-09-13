package ro.fasttrackit.bank;

import java.util.Objects;

public class BankAccount {
    private final String accountNumber;
    private final String accountHolderName;
    private final double balance;

    public static BankAccount empty() {
        return new BankAccount("", "", 0);
    }

    public static BankAccount ingAccount() {
        return new BankAccount("123ING----", "Test", 0);
    }

    public BankAccount(String accountNumber, String accountHolderName) {
        this(accountNumber, accountHolderName, 0);
    }

    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public BankAccount deposit(int amount) {
        if (amount < 0) {
            System.out.println("Invalid amount");
            return this;
        }
        return new BankAccount(accountNumber, accountHolderName, balance + amount);
    }

    public String getAccountNumber() {
        return accountNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }


    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BankAccount that = (BankAccount) o;
        return Double.compare(balance, that.balance) == 0 && Objects.equals(accountNumber, that.accountNumber) && Objects.equals(accountHolderName, that.accountHolderName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(accountNumber, accountHolderName, balance);
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolderName='" + accountHolderName + '\'' +
                ", balance=" + balance +
                '}';
    }
}
