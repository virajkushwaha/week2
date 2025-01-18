

public class Person {
    

    public static void main(String[] args) {
        PersonDetails p = new PersonDetails("John", 25);//parameterized constructor
        PersonDetails p2 = new PersonDetails("Sam", 30);// parameterized constructor
        PersonDetails p3 = new PersonDetails("Kancha",22);
        p.display();
        // Copy constructor
        PersonDetails p1 = new PersonDetails(p);
        p2.display();
        p3.display();
        p1.display();
        p1.chageName("Johny");
        p1.getNewName();
        p.getNewName();
    }
    
}
