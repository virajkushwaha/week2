class Course{
    String courseName;
    int duration;

    //constructor
    Course(String courseName, int duration){
        this.courseName = courseName;
        this.duration = duration;
    }

    //display details 
    void displayDetails(){
        System.out.println("Course Name: "+courseName);
        System.out.println("Course Duration: "+duration+" days");
        }
    
}

class OnlineCourse extends Course{
    String platform;
    boolean isRecorded;
    //constructor
    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded){
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }
    //display detail 
    void displayDetails(){
        super.displayDetails();
        System.out.println("Platform: "+platform);
        System.out.println("Is Recorded: "+isRecorded);
    }
}
class PaidOnlineCourse extends OnlineCourse{
    int fee;
    int discount;
    //constructor
    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded,int fee , int discount){
        super(courseName,duration,platform,isRecorded);
        this.fee = fee;
        this.discount = discount;
    }
    //display detail 
    void displayDetails(){
        super.displayDetails();
        System.out.println("Discount: "+discount);
        System.out.println("Fee: "+fee);
    }
}
public class CourseManagement {
    public static void main(String[] args) {
        //create obj of course
        Course course = new Course("Python Programming", 30);
        course.displayDetails();
        System.out.println();
        //create obj of onlineCourse
        OnlineCourse onlineCourse = new OnlineCourse("Data Science", 45, "Udemy",true);
        onlineCourse.displayDetails();
        System.out.println();
        //create obj of paidOnlineCourse
        PaidOnlineCourse paidCourse = new PaidOnlineCourse("Machine Learning",50 , "Cousera", true, 45000, 10);
        paidCourse.displayDetails();
        
    }
}
