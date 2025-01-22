import java.util.ArrayList;
import java.util.List;

public class Patient {
    private String name;
    private int age;
    private List<Doctor> doctors;

    // Constructor
    public Patient(String name, int age) {
        this.name = name;
        this.age = age;
        this.doctors = new ArrayList<>();
    }

    // Method to add a doctor
    public void addDoctor(Doctor doctor) {
        if (!doctors.contains(doctor)) {
            doctors.add(doctor);
        }
    }

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public List<Doctor> getDoctors() {
        return doctors;
    }
}
