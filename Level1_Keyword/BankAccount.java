

public class BankAccount {
    //Static Variable bankName
    static String bankName;
    private static int totalAccount = 0;
    final String ACCOUNT_NUMBER;
    String accountHolderName ;

    //Constructor 
    BankAccount(String accountHolderName, String ACCOUNT_NUMBER ){
        this.accountHolderName = accountHolderName;
        this.ACCOUNT_NUMBER = ACCOUNT_NUMBER;
        totalAccount++;
    }
    //method total account
    static void  getTotalAccounts(){
        System.out.println("Total Accounts: "+totalAccount);
    }
    //display method
    void display(){
        System.out.println("account Number: "+ACCOUNT_NUMBER);
        System.out.println("Name: "+accountHolderName);
    }
}
