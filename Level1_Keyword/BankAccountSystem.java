
public class BankAccountSystem {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Kancha", "74101258654659");
        BankAccount acc2 = new BankAccount("Kancha", "74101258654659");
        BankAccount acc3 = new BankAccount("Kancha", "74101258654659");

        BankAccount.getTotalAccounts();

        acc1.display();
        acc2.display();
        acc3.display();

        // checking Instance 

        if (acc1 instanceof BankAccount){
            System.out.println("Yes this is instance of parent class");
        }
        else{
            System.out.println("No, this is not instance of parent class");
        }
    }
}
