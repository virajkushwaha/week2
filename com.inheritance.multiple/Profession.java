class Person{
    private String name;
    private int age;

    //constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    //display details
    public void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

}
class Teacher extends Person{
    private String subject;

    //constructor
    public Teacher(String name, int age, String subject) {
        super(name,age);
        this.subject = subject;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Subject: " + subject);
    }
}
class Student extends Person{
    private int grade ;

    //constructor
    public Student(String name, int age , int grade) {
        super(name, age );
        this.grade = grade;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Grade: " + grade);
    }
}
class Staff extends Person{
    private String areaOfWork;

    //constructor
    public Staff(String name, int age, String areaOfWork) {
        super(name, age );
        this.areaOfWork = areaOfWork;
    }
    @Override
    //display details
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Area Of Work: " + areaOfWork);
    }
}
public class Profession {
    public static void main(String[] args) {
        //creating obj Teacher
        Teacher p1 = new Teacher("Prince", 25,"maths");
        //displaying details of person1
        p1.displayDetails();
        //creating obj Student
        Student person2 = new Student("67890", 5000, 5);
        //displaying details of person2
        person2.displayDetails();
        //create obj Staff 
        Staff person3 = new Staff("34567", 2000, "Cleaning");
        //displaying details of account3
        person3.displayDetails();
        
    }
}
