public class BankDetails {
    private String accountHolder;
    private int accountNumber;
    private int balance;

    // Constructor to initialize bank details
    public BankDetails(String accountHolder, int accountNumber, int balance) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    // Deposit money into the account
    public void deposit(int amount) {
        if (amount > 0) {
            this.balance += amount;
            System.out.println("Deposited: " + amount);
            System.out.println("Current Balance: " + this.balance);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    // Withdraw money from the account
    public void withdraw(int amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
            System.out.println("Withdrawn: " + amount);
            System.out.println("Current Balance: " + this.balance);
        } else if (amount <= 0) {
            System.out.println("Invalid withdrawal amount");
        } else {
            System.out.println("Insufficient Balance");
            System.out.println("Current Balance: " + this.balance);
        }
    }

    // Display account details
    public void displayBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }
}
