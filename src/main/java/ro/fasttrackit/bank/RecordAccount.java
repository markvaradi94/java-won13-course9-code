package ro.fasttrackit.bank;

public record RecordAccount(
        String accountNumber,
        String accountHolderName,
        double balance
) {
}
