// Employee class
class Employee {
    public int employeeID; // Public attribute
    protected String department; // Protected attribute
    private double salary; // Private attribute

    // Constructor to initialize Employee
    public Employee(int employeeID, String department, double salary) {
        this.employeeID = employeeID;
        this.department = department;
        this.salary = salary;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Invalid salary amount.");
        }
    }

    // Method to display employee details
    public void display() {
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Department: " + department);
        System.out.println("Salary: " + salary);
    }
}
// Manager subclass
class Manager extends Employee {
    private String project; // Specific to Manager

    // Constructor to initialize Manager
    public Manager(int employeeID, String department, double salary, String project) {
        super(employeeID, department, salary);
        this.project = project;
    }

    // Method to display manager details
    public void displayManagerDetails() {
        System.out.println("Manager Details:");
        System.out.println("Employee ID: " + employeeID); // Accessing public attribute
        System.out.println("Department: " + department); // Accessing protected attribute
        System.out.println("Project: " + project);
    }
}
public class EmployeeRecords {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "IT", 50000.0);
        emp.display();

        // Modify salary
        emp.setSalary(60000.0);
        System.out.println("Updated Salary: " + emp.getSalary());

        // Create a Manager object
        Manager mgr = new Manager(102, "HR", 75000.0, "Recruitment");
        mgr.displayManagerDetails();

        // Access and modify salary through Employee methods
        mgr.setSalary(80000.0);
        System.out.println("Updated Salary (Manager): " + mgr.getSalary());
    }
}
