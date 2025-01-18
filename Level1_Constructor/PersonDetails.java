

public class PersonDetails {
    String name;
    int age;
    //Copy constructor

    PersonDetails(PersonDetails p) {
        this.name = p.name;
        this.age = p.age;
    }
    //Default constructor

    PersonDetails() {
        System.out.println("Default constructor");
    }

    //Parameterized constructor
    PersonDetails(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // Display person details

    void display() {
        System.out.println("Name: " + name + "\nAge: " + age);
    }
}
