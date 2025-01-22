import java.util.ArrayList;

public class Bank{
    // Instance Variables
    private String bankName;
    private ArrayList<Customer> customers;

    // Constructor to initialize Bank details
    public Bank(String bankName){
        this.bankName = bankName;
        customers = new ArrayList<>();
    }
    
    // Instance method to Add customer
    public void addCustomer(Customer customer){
        customers.add(customer);
    }

    // Instance method to open Account Bank Details
    public void openAccount(Customer customer, String ACCOUNT_NUMBER,double initalBalance){
        Account account = new Account(ACCOUNT_NUMBER,initalBalance);
        customer.addAccount(account);

        System.out.println("Account open for "+customer.getName());
        System.out.println("Account Number : "+account.getAccountNumber());
    }


    // Method to display all customers in the bank
    public void displayCustomers() {
        System.out.println("Bank: " + bankName);
        if (customers.isEmpty()) {
            System.out.println("No customers.");
        } else {
            for (Customer customer : customers) {
                System.out.println("Customer: " + customer.getName());
            }
        }
    }

}