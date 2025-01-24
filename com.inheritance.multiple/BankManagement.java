class BankAccount{
    private String accountNumber;
    private int balance;

    //constructor
    public BankAccount(String accountNumber, int balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    //display details
    public void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
    }

}
class SavingsAccount extends BankAccount{
    private int interestRate;

    //constructor
    public SavingsAccount(String accountNumber, int balance, int interestRate) {
        super(accountNumber, balance);
        this.interestRate = interestRate;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Interest Rate: " + interestRate + "%");
    }
}
class CheckingAccount extends BankAccount{
    private int withdrawalLimit;

    //constructor
    public CheckingAccount(String accountNumber, int balance , int withdrawalLimit) {
        super(accountNumber, balance );
        this.withdrawalLimit = withdrawalLimit;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Withdrawal Limit: " + withdrawalLimit);
    }
}
class FixedDepositAccount extends BankAccount{
    private int compoundRate;

    //constructor
    public FixedDepositAccount(String accountNumber, int balance, int compoundRate) {
        super(accountNumber, balance );
        this.compoundRate = compoundRate;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Compound Rate: " + compoundRate);
    }
}
public class BankManagement {
    public static void main(String[] args) {
        //creating obj bankaccount
        BankAccount account1 = new BankAccount("12345", 1000);
        //displaying details of account1
        account1.displayDetails();
        //creating obj savingAccount
        SavingsAccount account2 = new SavingsAccount("67890", 5000, 5);
        //displaying details of account2
        account2.displayDetails();
        //create obj checking account
        CheckingAccount account3 = new CheckingAccount("34567", 2000, 500);
        //displaying details of account3
        account3.displayDetails();
        //creating obj fixedDeposit
        FixedDepositAccount account4 = new FixedDepositAccount("65465", 465452, 12); 
        //displaying detials of account4 
        account4.displayDetails();
    }
}
