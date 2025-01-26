package Day6_Polymorphism.problemStatement.BankingSystem;

public class BankingSystem {
    public static void main(String[] args) {
        // Creating instances of bank accounts
        BankAccount savingsAccount = new SavingsAccount("SA123", "Viraj", 5000.0);
        BankAccount currentAccount = new CurrentAccount("CA123", "Viraj", 10000.0);

        // Polymorphism - Calling calculateInterest on different account types
        savingsAccount.calculateInterest();
        currentAccount.calculateInterest();

        // Deposit and Withdraw Operations
        savingsAccount.deposit(1000);
        savingsAccount.withdraw(2000);

        // Loan Application
        LoanAccount loanAccount = new LoanAccount(50000);
        loanAccount.applyForLoan();
        loanAccount.calculateLoanEligibility();
    }
}
