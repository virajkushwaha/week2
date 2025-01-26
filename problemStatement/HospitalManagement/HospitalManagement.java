package Day6_Polymorphism.problemStatement.HospitalManagement;


// Main Class - HospitalPatientManagement
public class HospitalManagement {
    public static void main(String[] args) {
        // Create InPatient and OutPatient objects
        Patient inPatient = new InPatient("P001", "John Doe", 45, 1500.0, 5);
        Patient outPatient = new OutPatient("P002", "Jane Smith", 30, 500.0);

        // Add medical records
        MedicalRecord inPatientRecord = (MedicalRecord) inPatient;
        MedicalRecord outPatientRecord = (MedicalRecord) outPatient;

        inPatientRecord.addRecord("Admitted for surgery. Recovery in progress.");
        outPatientRecord.addRecord("Consulted for general check-up.");

        // Display patient details and billing information using polymorphism
        Patient[] patients = { inPatient, outPatient };
        for (Patient patient : patients) {
            System.out.println(patient.getPatientDetails());
            System.out.println("Bill Amount: $" + patient.calculateBill());
            System.out.println(((MedicalRecord) patient).viewRecords());
            System.out.println();
        }
    }
}
