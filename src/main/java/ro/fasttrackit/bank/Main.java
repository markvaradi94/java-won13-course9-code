package ro.fasttrackit.bank;

import ro.fasttrackit.bank.BankAccount;

public class Main {
    public static void main(String[] args) {
//        BankAccount bankAccount = new BankAccount("123235423", "Mihai", 250);
//
//        bankAccount.balance = 5454314;

        RecordAccount recordAccount = new RecordAccount("123", "Test", 19);
        System.out.println(recordAccount);
        System.out.println(recordAccount.equals(new RecordAccount("123", "Test", 19)));

        BankAccount empty = BankAccount.empty();
        BankAccount ing = BankAccount.ingAccount();

        BankAccount updatedAccount = ing.deposit(150);
        System.out.println(updatedAccount);
        BankAccount ing2 = updatedAccount.deposit(-250);
        System.out.println(ing2);
    }
}