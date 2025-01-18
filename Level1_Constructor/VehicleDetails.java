public class VehicleDetails {
    public static void main(String[] args) {
        // Create object of Vehicle class
        Vehicle vehicle1 = new Vehicle("John", "Car");
        // Display vehicle details
        vehicle1.displayVehicleDetails();
        // Update registration fee
        Vehicle.updateRegistrationFee(6000);
        // Create object of Vehicle class
        Vehicle vehicle2 = new Vehicle("Smith", "Bike");
        // Display vehicle details
        vehicle2.displayVehicleDetails();
    }
}