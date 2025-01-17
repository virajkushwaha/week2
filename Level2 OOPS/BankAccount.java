public class BankAccount {
    public static void main(String[] args) {
        // Create a BankDetails object with initial values
        BankDetails holder = new BankDetails("HDFC", 546516, 2000);
        
        // Display the initial balance
        holder.displayBalance();
        
        // Deposit an amount and display the updated balance
        holder.deposit(54000);
        holder.displayBalance();
        
        // Withdraw an amount and display the updated balance
        holder.withdraw(4500);
        holder.displayBalance();
    }
}
