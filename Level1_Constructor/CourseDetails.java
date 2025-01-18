

public class CourseDetails {
    //attributes courseName, duration, fee.
    String courseName;
    int duration;
    double fee;
    public static String instituteName = "XYZ Institute";
    
        //parametrized constructor
        public CourseDetails(String courseName, int duration, double fee) {
            this.courseName = courseName;
            this.duration = duration;
            this.fee = fee;
            
        }
    
        public static void updateInstituteName(String instituteNameUpdate) {
            instituteName = instituteNameUpdate;
    }

    //display method
    public void display() {
        System.out.println("Course Name: " + courseName + "\nDuration: " + duration + "\nFee: " + fee + "\nInstitute Name: " + instituteName);
    }
}
