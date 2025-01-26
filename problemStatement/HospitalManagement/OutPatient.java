package Day6_Polymorphism.problemStatement.HospitalManagement;


// Subclass - OutPatient
public class OutPatient extends Patient implements MedicalRecord {
    private double consultationFee;
    private String medicalHistory;

    // Constructor
    public OutPatient(String patientId, String name, int age, double consultationFee) {
        super(patientId, name, age);
        this.consultationFee = consultationFee;
        this.medicalHistory = "";
    }

    // Implementing abstract method to calculate the bill
    @Override
    public double calculateBill() {
        return consultationFee;
    }

    // Implementing MedicalRecord methods
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History for Out-Patient " + getName() + ":\n" + medicalHistory;
    }
}
