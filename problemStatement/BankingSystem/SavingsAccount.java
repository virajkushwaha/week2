package Day6_Polymorphism.problemStatement.BankingSystem;

// Subclass - SavingsAccount
public class SavingsAccount extends BankAccount {
    private static final double INTEREST_RATE = 0.04; // 4% annual interest rate

    // Constructor
    public SavingsAccount(String accountNumber, String holderName, double balance) {
        super(accountNumber, holderName, balance);
    }

    // Implementing the abstract method for interest calculation
    @Override
    public void calculateInterest() {
        double interest = getBalance() * INTEREST_RATE;
        System.out.println("Interest for Savings Account: " + interest);
    }
}