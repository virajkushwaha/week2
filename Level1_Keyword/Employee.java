

public class Employee {
    


    //Static Variable companyName
    static String companyName = "XYZ";
    private static int totalEmployee = 0;
    final String ID;
    String name ;
    String designation ;


    Employee(String name, String ID , String designation ){
        this.name = name;
        this.ID = ID;
        this.designation = designation;
     totalEmployee++;
    }
    //Method for calculating total account
    static void  getTotalEmployees(){
        System.out.println("Total Accounts: "+ totalEmployee);
    }

    void display(){
        System.out.println("ID: "+ID);
        System.out.println("Name: "+name);
        System.out.println("Designation : "+designation);
    }
}


