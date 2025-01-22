import java.util.ArrayList;
import java.util.List;
//creating class student
public class Student {
    private String name;
    private List<Course> courses;
    //constructor
    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    //adding course
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    //getting list of all course
    public List<Course> getCourses() {
        return courses;
    }
    //getter for name
    public String getName() {
        return name;
    }
}
