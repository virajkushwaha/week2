// BankAccount class
class BankAccount {
    public int accountNumber; // Public attribute
    protected String accountHolder; // Protected attribute
    private double balance; // Private attribute

    // Constructor to initialize BankAccount
    public BankAccount(int accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Getter for balance
    public double getBalance() {
        return balance;
    }

    // Setter for balance
    public void setBalance(double balance) {
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount.");
        }
    }

    // Method to display bank account details
    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: " + balance);
    }
}

// SavingsAccount subclass
class SavingsAccount extends BankAccount {
    private double interestRate; // Specific to SavingsAccount

    // Constructor to initialize SavingsAccount
    public SavingsAccount(int accountNumber, String accountHolder, double balance, double interestRate) {
        super(accountNumber, accountHolder, balance);
        this.interestRate = interestRate;
    }

    // Method to display savings account details
    public void displaySavingsAccount() {
        System.out.println("Savings Account Details:");
        System.out.println("Account Number: " + accountNumber); // Accessing public attribute
        System.out.println("Account Holder: " + accountHolder); // Accessing protected attribute
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}

public class BankAccountManagement {
    public static void main(String[] args) {
        // Create a BankAccount object
        BankAccount account = new BankAccount(10101, "John Doe", 5000.0);
        account.display();

        // Update balance
        account.setBalance(8000.0);
        System.out.println("Updated Balance: " + account.getBalance());

        // Create a SavingsAccount object
        SavingsAccount savings = new SavingsAccount(20202, "Alice Smith", 10000.0, 3.5);
        savings.displaySavingsAccount();

        // Access balance through methods
        savings.setBalance(12000.0);
        System.out.println("Updated Balance (Savings Account): " + savings.getBalance());
    }
}

