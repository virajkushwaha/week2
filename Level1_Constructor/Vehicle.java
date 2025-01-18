
public class Vehicle {
    // Class variable
    static double registrationFee = 5000;
    // Instance variables
    String ownerName;
    String vehicleType;
    // Parametrized constructor
    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }
    // Instance method to display owner and vehicle details
    public void displayVehicleDetails() {
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
    }
    // Class method to update registration fee
    public static void updateRegistrationFee(double newFee) {
        registrationFee = newFee;
    }
}



