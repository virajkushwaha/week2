import java.util.ArrayList;
public class Student {
    // Instance Variables
    private ArrayList<Course> courses;
    private String name;
    private final int ROLL_NUMBER;

     // Constructor to initialize Student details
    Student(String name, int ROLL_NUMBER){
        this.name = name;
        this.ROLL_NUMBER = ROLL_NUMBER;
        courses = new ArrayList<>();
    }

    //Method to add courses
    public void addCourse(Course course){
        courses.add(course);
        course.addStudent(this.name, this.ROLL_NUMBER);
    }
    
    //Method to display the details of Student
    public void displayStudentDetails(){
        System.out.println("\nStudent Details\n");
        System.out.println("Student Name : "+this.name);
        System.out.println("Student Roll Number : "+this.ROLL_NUMBER);
    }

    // Method to display all Courses of the student
    public void displayCourses() {
        if (courses.isEmpty()) {
            System.out.println("No courses available.");
        } else {
            for (Course course : courses) {
                course.displayCourseDetails();
            }
        }
    }
}
