

public class University {
    public static void main(String[] args) {
        //Creating instance 
        Student stu1 = new Student("Kancha", "74101258654659","A");
        Student stu2 = new Student("Kancha", "74101258654659","C");
        Student stu3 = new Student("Kancha", "74101258654659","D");

        Student.getTotalStudent();

        stu1.display();
        stu2.display();
        stu3.display();

        // checking Instance 

        if (stu1 instanceof Student){
            System.out.println("Yes this is instance of parent class");
        }
        else{
            System.out.println("No, this is not instance of parent class");
        }
    }
}
