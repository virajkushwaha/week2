import java.util.ArrayList;
public class Department {
    // Instance Variables
    private String name;
    private ArrayList<Employee> employees;

    // Constructor to initialize Department details
    public Department(String name) {
        this.name = name;
        employees = new ArrayList<>();
    }

    // Instance method to Add Employee
    public void addEmployee(Employee employee){
        employees.add(employee);
    }

    // Method to display all employees of the Department
    public void displayEmployees() {
        System.out.println("Department: " + this.name);
        if (employees.isEmpty()) {
            System.out.println("No employees available.");
        } else {
            for (Employee employee : employees) {
                employee.displayEmployeeDetails();
            }
        }
    }

    //Method to display Department Details
    public void displayDepartmentDetails() {
        System.out.println("Department Name: " + this.name);
        
    }

}
