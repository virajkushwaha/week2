public class Student {
    public static void main(String[] args) {
        // Create student objects with roll number, name, and marks
        StudentDetails stu1 = new StudentDetails(1, "Princy", 95);
        StudentDetails stu2 = new StudentDetails(2, "Kancha", 41);
        StudentDetails stu3 = new StudentDetails(3, "Viru", 75);

        // Display student details
        stu1.display();
        stu2.display();
        stu3.display();
    }
}
