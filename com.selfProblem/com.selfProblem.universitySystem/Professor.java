import java.util.ArrayList;
import java.util.List;
//creating the class professor
public class Professor {
    private String name;
    private List<Course> courses;
    //constructor
    public Professor(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }
    //adding Courses
    public void addCourse(Course course) {
        this.courses.add(course);
    }
    //getting all courses
    public List<Course> getCourses() {
        return courses;
    }
    //getter for name
    public String getName() {
        return name;
    }
}
