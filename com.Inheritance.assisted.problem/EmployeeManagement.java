class Employee{
    private String name;
    private int id;
    private int salary;

    //Constructor
    public Employee(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void displayDetails(){
        System.out.println("Name: "+name);
        System.out.println("ID: "+id);
        System.out.println("Salary: "+salary);

    }
}

class Manager extends Employee{
    private int teamSize ;
    //constructor
    public Manager(String name, int id, int salary ,int teamSize) {
        super(name, id, salary);
        this.teamSize = teamSize;
    }
    //overriding the employee class methos displayDetails
    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Team Size: "+teamSize);
    }
}

class  Developer extends Employee{
    private String programmingLanguage ;
    //constructor
    public Developer(String name, int id, int salary ,String programmingLanguage) {
        super(name, id, salary);
        this.programmingLanguage = programmingLanguage;
    }
    //overriding the employee class methos displayDetails

    @Override
    public void displayDetails(){
        super.displayDetails();
        System.out.println("Programming Language: "+programmingLanguage);
    }
}

class Intern extends Employee{
    
    //constructor
    public Intern(String name, int id, int salary ,String universityName) {
        super(name, id, salary);
    }
    //override display details 
    @Override
    public void displayDetails(){
        super.displayDetails();
    }
}

public class EmployeeManagement {
    public static void main(String[] args) {
        
        //create objects of Manager class
        Manager manager = new Manager("Rahul", 104, 80000, 10);
        
        //create objects of Developer class
        Developer developer = new Developer("Rohan", 105, 90000, "Java");

        //create object of Intern class
        Intern intern = new Intern("Rohan", 106, 100000, "IIT");

        //displaying details 

       
        manager.displayDetails();
        System.out.println("\n");
        developer.displayDetails();
        System.out.println("\n");
        intern.displayDetails();
        
    }
}
