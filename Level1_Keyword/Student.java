

public class Student {
    //Static Variable universityName
    static String universityName = "XYZ";
    private static int totalStudent = 0;
    final String ROLL_NUMBER;
    String name ;
    String grade ;

    //constructor
    Student (String name, String ROLL_NUMBER ,String grade){
        this.name = name;
        this.ROLL_NUMBER = ROLL_NUMBER;
        this.grade = grade;
        totalStudent++;
    }

    static void  getTotalStudent(){
        System.out.println("Total Accounts: "+totalStudent);
    }
    //displaying student
    void display(){
        System.out.println("Roll Number: "+ROLL_NUMBER);
        System.out.println("Name: "+name);
        System.out.println("Grade: "+grade);
    }
}
