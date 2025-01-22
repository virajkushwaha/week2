public class SchoolManagementSystem {
    public static void main(String[] agrs){
        //Create the object of School
        School school = new School("Vidya Niketan Public School");

        //Create object of Student
        Student student1 = new Student("Prince Raj", 8);
        Student student2 = new Student("Viraj Khuswaha", 7);
        Student student3 = new Student("Kancha Singh", 6);

        //Create object of Course
        Course course1 = new Course("Machine Learning");
        Course course2 = new Course("DSA");
        Course course3 = new Course("Compiler Design");

        //Add courses to the students
        student1.addCourse(course1);
        student1.addCourse(course2);
        student2.addCourse(course2);
        student2.addCourse(course3);
        student3.addCourse(course1);

        //Add Student to School
        school.addStudent(student1);
        school.addStudent(student2);
        school.addStudent(student3);

        //Display all students that enrolled for courses
        course1.displayCourseDetails();
        course1.displayStudents();

        course2.displayCourseDetails();
        course2.displayStudents();

        course3.displayCourseDetails();
        course3.displayStudents();
        
        //Display the details of School and Students
        school.displayStudents();


    }
}
