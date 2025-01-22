public class CompanyAndDepartments {
    public static void main(String[] args) {
        // Create some Company objects
        Company company1 = new Company("KPIT");
        Company company2 = new Company("Accenture");
        Company company3 = new Company("Capgemini");

        // Create some Customers objects
        Department department1 = new Department("Software Engineer");
        Department department2 = new Department("HR");
        Department department3 = new Department("Data Analyst");
        

        // Add Department to the Company
        company1.addDepartment(department1);
        company1.addDepartment(department2);
        company1.addDepartment(department3);
        
        company2.addDepartment(department1);
        company2.addDepartment(department2);
        company2.addDepartment(department3);

        company3.addDepartment(department1);
        company3.addDepartment(department2);
        company3.addDepartment(department3);


        
        //Add Employee to the Department
        department1.addEmployee(new Employee("Prince Raj", "1111"));
        department1.addEmployee(new Employee("Rajkumar", "0725"));
        department2.addEmployee(new Employee("Virani", "28937"));
        department2.addEmployee(new Employee("Kanchaa", "9872"));
        department3.addEmployee(new Employee("Dhaani", "8763"));
        department3.addEmployee(new Employee("Tulti", "9823"));

        //Add Employee for comapny2
        company2.addEmployee(department3, "Salman Khan","8767");

        // Display the Company Details
        company1.displayDepartments();
        company2.displayDepartments();
        company3.displayDepartments();

        //Display the Employees details
        department1.displayEmployees();
        department2.displayEmployees();
        department3.displayEmployees();
        
        
    }
}
