import java.util.ArrayList;
public class Company {
    // Instance Variables
    private String name;
    private ArrayList<Department> departments;

    // Constructor to initialize Company details
    public Company(String name) {
        this.name = name;
        departments = new ArrayList<>();
    }

    // Instance method to Add Department
    public void addDepartment(Department department){
        departments.add(department);
    }

    // Instance method to add Employee to company
    public void addEmployee(Department department, String name, String ID){
        Employee employee = new Employee(name, ID);
        department.addEmployee(employee);
        
        System.out.println("\nNew Employee Added Successfully");
        System.out.println("Employee Name : "+employee.getName());
        System.out.println("Employee ID : "+employee.getID());
    }
    // Method to display all Departments of the Company
    public void displayDepartments() {
        System.out.println("Company : " + this.name);
        if (departments.isEmpty()) {
            System.out.println("No Departments available.");
        } else {
            for (Department department : departments) {
                department.displayDepartmentDetails();
            }
        }
    }

    // Method to delete all Departments of the Company
    public void deleteCompany() {
        System.out.println("Deleting company: " + name);
        departments.clear(); // This will remove all departments, which also removes all employees.
    }


}
