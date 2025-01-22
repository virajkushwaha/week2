import java.util.ArrayList;
import java.util.List;

// Department class (Aggregation with Faculty, Composition with University)
public class Department {
    private String name;
    private List<Faculty> facultyMembers;

    public Department(String name) {
        this.name = name;
        this.facultyMembers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFaculty(Faculty faculty) {
        facultyMembers.add(faculty);
        faculty.addToDepartment(this);
    }

    public void removeFaculty(Faculty faculty) {
        facultyMembers.remove(faculty);
        faculty.removeFromDepartment(this);
    }

    public List<Faculty> getFacultyMembers() {
        return facultyMembers;
    }

    // Destructor-like method for cleaning up
    public void clearFaculty() {
        for (Faculty faculty : facultyMembers) {
            faculty.removeFromDepartment(this);
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Department " + name + " is being deleted.");
        clearFaculty();
        super.finalize();
    }
}
