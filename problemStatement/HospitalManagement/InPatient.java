package Day6_Polymorphism.problemStatement.HospitalManagement;


// Subclass - InPatient
class InPatient extends Patient implements MedicalRecord {
    private double roomChargesPerDay;
    private int numberOfDays;
    private String medicalHistory;

    // Constructor
    public InPatient(String patientId, String name, int age, double roomChargesPerDay, int numberOfDays) {
        super(patientId, name, age);
        this.roomChargesPerDay = roomChargesPerDay;
        this.numberOfDays = numberOfDays;
        this.medicalHistory = "";
    }

    // Implementing abstract method to calculate the bill
    @Override
    public double calculateBill() {
        return roomChargesPerDay * numberOfDays;
    }

    // Implementing MedicalRecord methods
    @Override
    public void addRecord(String record) {
        medicalHistory += record + "\n";
    }

    @Override
    public String viewRecords() {
        return "Medical History for In-Patient " + getName() + ":\n" + medicalHistory;
    }
}
