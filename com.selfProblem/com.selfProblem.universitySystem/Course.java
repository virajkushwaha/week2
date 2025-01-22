import java.util.ArrayList;
import java.util.List;
//create class course
public class Course {
    private String courseName;
    private Professor professor;
    private List<Student> enrolledStudents;
    //constructor
    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }
    //method for assigning professor
    public void assignProfessor(Professor professor) {
        this.professor = professor;
        professor.addCourse(this);
    }
    //method for enrolling the student
    public void enrollStudent(Student student) {
        this.enrolledStudents.add(student);
        student.addCourse(this);
    }
    //method for getting course name
    public String getCourseName() {
        return courseName;
    }
    //method for getting professor name 
    public Professor getProfessor() {
        return professor;
    }
    //method for adding student details
    public List<Student> getEnrolledStudents() {
        return enrolledStudents;
    }
}
