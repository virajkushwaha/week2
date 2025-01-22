import java.util.ArrayList;
import java.util.List;

// University class (Composition with Department)
public class University {
    private String name;
    private List<Department> departments;

    public University(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addDepartment(Department department) {
        departments.add(department);
    }

    public void removeDepartment(Department department) {
        if (departments.contains(department)) {
            departments.remove(department);
            department.clearFaculty();  // Remove faculty members from the department
            System.out.println("Department " + department.getName() + " removed from the University.");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("University " + name + " is being deleted.");
        for (Department department : departments) {
            department.clearFaculty();  // Clean up all faculty members from the department
        }
        super.finalize();
    }
}
