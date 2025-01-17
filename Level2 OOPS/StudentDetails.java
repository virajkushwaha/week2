public class StudentDetails {
    int rollNumber;
    String name;
    int marks;
    char grade;

    // Constructor to initialize student details
    StudentDetails(int rollNumber, String name, int marks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.marks = marks;
    }

    // Calculate grade based on marks
    void calGrade() {
        if (marks > 80) {
            this.grade = 'A';
        } else if (marks > 60 && marks < 80) {
            this.grade = 'B';
        } else if (marks > 40 && marks < 60) {
            this.grade = 'C';
        } else {
            this.grade = 'F';
        }
    }

    // Display student details including calculated grade
    void display() {
        calGrade();
        System.out.println("Roll Number: " + rollNumber + "\nName: " + name + "\nMarks: " + marks + "\nGrade: " + grade);
    }
}
