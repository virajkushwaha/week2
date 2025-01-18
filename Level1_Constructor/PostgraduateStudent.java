

 class Student{
    public int rollNumber;
    protected String name;
    private double CGPA;
    public Student(int rollNumber, String name, double CGPA){
        this.rollNumber = rollNumber;
        this.name = name;
        this.CGPA = CGPA;
    }


    // Getter for CGPA
    public double getCGPA() {
        return CGPA;
    }

    // Setter for CGPA
    public void setCGPA(double CGPA) {
        this.CGPA = CGPA;
    }
}

public class PostgraduateStudent extends Student {
    private String thesisTitle;

    // Constructor
    public PostgraduateStudent(int rollNumber, String name, double CGPA, String thesisTitle) {
        super(rollNumber, name, CGPA);
        this.thesisTitle = thesisTitle;
    }

    // Getter for thesisTitle
    public String getThesisTitle() {
        return thesisTitle;
    }

    // Setter for thesisTitle
    public void setThesisTitle(String thesisTitle) {
        this.thesisTitle = thesisTitle;
    }

    // Method to demonstrate access to protected member
    public void displayStudentInfo() {
        System.out.println("Roll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("CGPA: " + getCGPA());
        System.out.println("Thesis Title: " + thesisTitle);
    }
}

