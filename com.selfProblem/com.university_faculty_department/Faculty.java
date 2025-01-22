// Faculty class (Aggregation with Department)
public class Faculty {
    private String name;
    private Department department;

    public Faculty(String name) {
        this.name = name;
        this.department = null;
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addToDepartment(Department department) {
        this.department = department;
        System.out.println(name + " added to the Department of " + department.getName() + ".");
    }

    public void removeFromDepartment(Department department) {
        if (this.department == department) {
            this.department = null;
            System.out.println(name + " removed from the Department of " + department.getName() + ".");
        }
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("Faculty member " + name + " is being deleted.");
        super.finalize();
    }
}
