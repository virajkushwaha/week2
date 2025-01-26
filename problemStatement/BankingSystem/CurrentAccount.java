package Day6_Polymorphism.problemStatement.BankingSystem;

// Subclass - CurrentAccount
public class CurrentAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.02; // 2% annual interest rate

    // Constructor
    public CurrentAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implementing the abstract method for interest calculation
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        System.out.println("Interest for Current Account: " + interest);
    }
}
