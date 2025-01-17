public class EmployeeDetails {
    String name;
    int salary, id;

    // Constructor to initialize employee details
    EmployeeDetails(String name, int salary, int id) {
        this.name = name;
        this.salary = salary;
        this.id = id;
    }

    // Method to display employee details
    void display() {
        System.out.println("Employee name : " + name + "\nEmployee ID : " + id + "\nsalary: " + salary);
    }
}
