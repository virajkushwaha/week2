// Superclass
class Person {
    protected String name;
    protected int id;

    // Constructor
    public Person(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display person details
    public void displayPersonDetails() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
    }
}

// Interface
interface Worker {
    void performDuties(); // Abstract method
}

class Chef extends Person implements Worker {
    private String specialty;

    // Constructor
    public Chef(String name, int id, String specialty) {
        super(name, id);
        this.specialty = specialty;
    }

    // Implement the performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is preparing dishes, especially " + specialty + ".");
    }
}

class Waiter extends Person implements Worker {
    private String section;

    // Constructor
    public Waiter(String name, int id, String section) {
        super(name, id);
        this.section = section;
    }

    // Implement the performDuties method
    @Override
    public void performDuties() {
        System.out.println(name + " is serving customers in the " + section + " section.");
    }
}

// Main class to test the system
public class RestaurantManagement {
    public static void main(String[] args) {
        // Create a Chef object
        Chef chef = new Chef("Gordon Ramsay", 101, "Italian Cuisine");
        chef.displayPersonDetails();
        chef.performDuties();
        System.out.println("------------------------------------------------");

        // Create a Waiter object
        Waiter waiter = new Waiter("John Doe", 201, "Outdoor");
        waiter.displayPersonDetails();
        waiter.performDuties();
    }
}
