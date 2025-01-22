public class UniversitySystem {
    public static void main(String[] args) {
        // Create students
        Student student1 = new Student("Alice");
        Student student2 = new Student("Bob");

        // Create professors
        Professor professor1 = new Professor("Dr. Smith");
        Professor professor2 = new Professor("Dr. Johnson");

        // Create courses
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Machine Learning");

        // Assign professors to courses
        course1.assignProfessor(professor1);
        course2.assignProfessor(professor2);

        // Enroll students in courses
        course1.enrollStudent(student1);
        course1.enrollStudent(student2);
        course2.enrollStudent(student1);

        // Display the system's relationships
        System.out.println("Courses and their professors:");
        System.out.println(course1.getCourseName() + " is taught by " + course1.getProfessor().getName());
        System.out.println(course2.getCourseName() + " is taught by " + course2.getProfessor().getName());

        System.out.println("\nStudents enrolled in each course:");
        for (Student student : course1.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + course1.getCourseName());
        }

        for (Student student : course2.getEnrolledStudents()) {
            System.out.println(student.getName() + " is enrolled in " + course2.getCourseName());
        }

        System.out.println("\nCourses each student is enrolled in:");
        for (Course course : student1.getCourses()) {
            System.out.println(student1.getName() + " is enrolled in " + course.getCourseName());
        }

        for (Course course : student2.getCourses()) {
            System.out.println(student2.getName() + " is enrolled in " + course.getCourseName());
        }
    }
}
