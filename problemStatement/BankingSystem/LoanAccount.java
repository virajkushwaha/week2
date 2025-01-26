package Day6_Polymorphism.problemStatement.BankingSystem;

public class LoanAccount implements Loanable {
    private double loanAmount;
    private double eligibility;

    // Constructor
    public LoanAccount(double loanAmount) {
        this.loanAmount = loanAmount;
    }

    // Implementing the method to apply for loan
    @Override
    public void applyForLoan() {
        System.out.println("Loan application submitted for amount: " + loanAmount);
    }

    // Implementing the method to calculate loan eligibility
    @Override
    public void calculateLoanEligibility() {
        // Simple eligibility check
        if (loanAmount < 100000) {
            eligibility = loanAmount * 0.8; // Eligible for 80% of the loan amount
        } else {
            eligibility = loanAmount * 0.5; // Eligible for 50% of the loan amount
        }
        System.out.println("Loan Eligibility: " + eligibility);
    }
}
