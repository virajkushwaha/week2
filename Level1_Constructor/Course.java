

public class Course {
    public static void main(String[] args) {
        // Create a new course
        CourseDetails course = new CourseDetails("Java", 5, 30);
        CourseDetails course1 = new CourseDetails("Python", 5, 25);
        CourseDetails course2 = new CourseDetails("C++", 10, 20);
        CourseDetails course3 = new CourseDetails("C", 4, 20);
        
        course.display();
        course1.display();
        course2.display();
        CourseDetails.updateInstituteName("GITS");
        course3.display();
        



    }
    
}
