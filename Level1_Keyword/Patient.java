
public class Patient {
    //Static Variable hospitalName
    static String hospitalName = "XYZ";
    private static int totalPatient = 0;
    final String PATIENT_ID;
    String name ;
    boolean ailment ;
    int age ;


    Patient (String name, String PATIENT_ID ,int age ,boolean ailment){
        this.name = name;
        this.PATIENT_ID = PATIENT_ID;
        this.age = age;
        this.ailment = ailment;
        totalPatient++;
    }

    static void  getTotalPatient(){
        System.out.println("Total Patient: "+totalPatient);
    }

    void display(){
        System.out.println("ID: "+PATIENT_ID);
        System.out.println("Name: "+name);
        System.out.println("age: "+age);
    }
}
