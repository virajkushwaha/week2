package Day6_Polymorphism.problemStatement.RideHailingApplication;

public
// Subclass - Bike
class Bike extends Vehicle implements GPS {
    private String currentLocation;

    // Constructor
    public Bike(String vehicleId, String driverName, double ratePerKm, String initialLocation) {
        super(vehicleId, driverName, ratePerKm);
        this.currentLocation = initialLocation;
    }

    // Implementing calculateFare()
    @Override
    public double calculateFare(double distance) {
        return distance * getRatePerKm();
    }

    // Implementing GPS methods
    @Override
    public String getCurrentLocation() {
        return currentLocation;
    }

    @Override
    public void updateLocation(String newLocation) {
        this.currentLocation = newLocation;
    }
}
