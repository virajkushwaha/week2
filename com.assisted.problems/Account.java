public class Account {
    // Instance Variables
    private double balance;
    private final String ACCOUNT_NUMBER;

    
    public String getAccountNumber() {
        return ACCOUNT_NUMBER;
    }

    // Constructor to initialize Account details
    public Account(String ACCOUNT_NUMBER, double initalBalance){
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        this.balance = initalBalance;
    }

    // Instance method to deposite balance
    public void deposite(double balance){
        if(balance > 0){
            System.out.println("Enter valid balance");
        }else{
            this.balance = this.balance + balance;
        }
    }

    // Instance method to withdraw balance
    public void withdraw(double balance){
        if(balance > 0){
            System.out.println("Enter valid balance");
        }else if(this.balance >= balance){
            this.balance = this.balance - balance;
        }else{
            System.out.println("Insufficient Balance");
        }
    }

    
    // Instance method to display Account balance
    public void viewBalance(){
        System.out.println("Total Balance : "+this.balance);
    }


    // Instance method to display Account details
    public void displayAccountDetails(){
        System.out.println("\nAccount Details\n");
        System.out.println("Account Number : "+this.ACCOUNT_NUMBER);
        System.out.println("Balance : "+this.balance);
    }

}
