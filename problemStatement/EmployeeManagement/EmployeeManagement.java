package Day6_Polymorphism.problemStatement.EmployeeManagement;

import java.util.ArrayList;
import java.util.List;

public class EmployeeManagement {
    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();

        // Add FullTimeEmployee
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "John Doe", 30000, 20000);
        fullTimeEmployee.assignDepartment("Finance");
        employees.add(fullTimeEmployee);

        // Add PartTimeEmployee
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Jane Smith", 10000, 80, 150);
        partTimeEmployee.assignDepartment("IT");
        employees.add(partTimeEmployee);

        // Process and display employee details
        for (Employee employee : employees) {
            employee.displayDetails();
            System.out.println("Total Salary: " + employee.calculateSalary());
            if (employee instanceof Department) {
                System.out.println(((Department) employee).getDepartmentDetails());
            }
            System.out.println("-------------------------");
        }
    }
}
