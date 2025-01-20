

public class Company {
    public static void main(String[] args) {
        Employee acc1 = new Employee("Kancha", "74101258654659","Engineer");
    Employee acc2 = new Employee("Kancha", "74101258654659","Engineer");
    Employee acc3 = new Employee("Kancha", "74101258654659","Engineer");

    Employee.getTotalEmployees();

    acc1.display();
    acc2.display();
    acc3.display();

    // checking Instance 

    if (acc1 instanceof Employee){
        System.out.println("Yes this is instance of parent class");
    }
    else{
        System.out.println("No, this is not instance of parent class");
    }
    
    }
}

