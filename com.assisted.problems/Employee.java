public class Employee {
    // Instance Variables
    private String name;
    private final String ID;

    // Constructor to initialize Employee details
    public Employee(String name,String ID) {
        this.name = name;
        this.ID = ID;
    }

    //Getters
    public String getName(){
        return this.name;
    }

    public String getID(){
        return this.ID;
    }

    // Method to display the details of Employee
    public void displayEmployeeDetails() {
        System.out.println("\nEmployee Details\n");
        System.out.println("Employee Name: " + this.name);
        System.out.println("Employee ID: " + this.ID);
        
    }

}
