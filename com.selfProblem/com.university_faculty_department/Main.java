public class Main {
    public static void main(String[] args) {
        // Create University
        University university = new University("Tech University");

        // Create Departments
        Department csDept = new Department("Computer Science");
        Department eeDept = new Department("Electrical Engineering");

        // Create Faculty members
        Faculty profSmith = new Faculty("Prof. Smith");
        Faculty profJohnson = new Faculty("Prof. Johnson");
        Faculty profTaylor = new Faculty("Prof. Taylor");

        // Add Departments to University
        university.addDepartment(csDept);
        university.addDepartment(eeDept);

        // Add Faculty to Departments (Aggregation)
        csDept.addFaculty(profSmith);
        eeDept.addFaculty(profJohnson);
        eeDept.addFaculty(profTaylor);

        // Simulate deleting the University and see the impact on Departments
        university.removeDepartment(csDept);

        // Simulate Faculty member leaving a Department
        eeDept.removeFaculty(profJohnson);

        // Simulate deleting the University
        university = null;  // To trigger garbage collection
        System.gc();  // Manually request garbage collection to invoke finalize methods
    }
}
