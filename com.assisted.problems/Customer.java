import java.util.ArrayList;

public class Customer {
    // Instance Variables
    private String name;
    private ArrayList<Account> accounts;

    //Getters
    public String getName() {
        return name;
    }

    // Constructor to initialize Customer details
    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    // Method to add accounts to the Customer
    public void addAccount(Account account) {
        accounts.add(account);
    }

    // Method to display all accounts of the Customer
    public void displayaccounts() {
        System.out.println("Customer: " + name);
        if (accounts.isEmpty()) {
            System.out.println("No accounts available.");
        } else {
            for (Account Account : accounts) {
                Account.displayAccountDetails();
            }
        }
    }
}
