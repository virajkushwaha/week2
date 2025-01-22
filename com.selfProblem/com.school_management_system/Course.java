import java.util.*;
public class Course{
    // Instance Variables
    private String name;
    private ArrayList<Student> students;
    
    // Constructor to initialize Student details
    public Course(String name){
        this.name = name;
        students = new ArrayList<>();
    }

    //Method to add Student to the course
    public void addStudent(String name , int ROLL_NUMBER){
        students.add(new Student(name, ROLL_NUMBER));
    }
    // Instance method to display Course details
    public void displayCourseDetails(){
        System.out.println("Course Name : "+this.name);
    }

     // Method to display all Students that enrolled for the course
     public void displayStudents() {
        if (students.isEmpty()) {
            System.out.println("No students available.");
        } else {
            for (Student student : students) {
                student.displayStudentDetails();
            }
        }
    }
}