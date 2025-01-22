public class HospitalSystem {
    public static void main(String[] args) {
        // Create a hospital
        Hospital hospital = new Hospital("City Hospital");

        // Create doctors
        Doctor doctor1 = new Doctor("Dr. Smith", "Cardiologist");
        Doctor doctor2 = new Doctor("Dr. Brown", "Neurologist");

        // Create patients
        Patient patient1 = new Patient("Alice", 30);
        Patient patient2 = new Patient("Bob", 45);

        // Add doctors and patients to the hospital
        hospital.addDoctor(doctor1);
        hospital.addDoctor(doctor2);
        hospital.addPatient(patient1);
        hospital.addPatient(patient2);

        // Consultations
        doctor1.consult(patient1); // Dr. Smith consults Alice
        doctor1.consult(patient2); // Dr. Smith consults Bob
        doctor2.consult(patient1); // Dr. Brown consults Alice

        // Display relationships
        System.out.println("\nDoctors and their patients:");
        for (Doctor doctor : hospital.getDoctors()) {
            System.out.println("Doctor: " + doctor.getName() + " (" + doctor.getSpecialization() + ")");
            for (Patient patient : doctor.getPatients()) {
                System.out.println("  - Patient: " + patient.getName());
            }
        }

        System.out.println("\nPatients and their doctors:");
        for (Patient patient : hospital.getPatients()) {
            System.out.println("Patient: " + patient.getName() + " (Age: " + patient.getAge() + ")");
            for (Doctor doctor : patient.getDoctors()) {
                System.out.println("  - Doctor: " + doctor.getName());
            }
        }
    }
}
