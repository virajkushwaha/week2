public class BankManagementSystem {
    public static void main(String[] args) {
        // Create some Bank objects
        Bank bank1 = new Bank("SBI Bank");
        Bank bank2 = new Bank("PUNB Bank");
        Bank bank3 = new Bank("HDFC Bank");

        // Create some Customers objects
        Customer customer1 = new Customer("Prince Raj");
        Customer customer2 = new Customer("Dhani Prajapati");
        Customer customer3 = new Customer("Viraj Khushwaha");
        Customer customer4 = new Customer("Kanchaa Thakur");
        Customer customer5 = new Customer("Rajveer Singh");
        Customer customer6 = new Customer("Stuti Kumari");
        Customer customer7 = new Customer("Arjun Singh");

        // Add Customer to the Bank
        bank1.addCustomer(customer7);
        bank1.addCustomer(customer4);
        bank1.addCustomer(customer2);
        
        bank2.addCustomer(customer1);
        bank2.addCustomer(customer5);

        //Add Account to the customer
        customer1.addAccount(new Account("1111",10300));
        customer1.addAccount(new Account("1222",1000));
        customer2.addAccount(new Account("2111",11000));
        customer2.addAccount(new Account("2222",10100));
        customer3.addAccount(new Account("3111",1000));
        customer4.addAccount(new Account("4111",3000));
        customer5.addAccount(new Account("5111",1000));
        customer6.addAccount(new Account("6111",11000));
        customer7.addAccount(new Account("7111",1000));
        
        //Open Account new for customer1 and print the details
        bank2.openAccount(customer1, "03333",4000);

        // Display the Banks Details
        bank1.displayCustomers();
        bank2.displayCustomers();
        bank3.displayCustomers();
        
    }
}
