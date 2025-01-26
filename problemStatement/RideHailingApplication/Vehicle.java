package Day6_Polymorphism.problemStatement.RideHailingApplication;

public abstract class Vehicle {
    // Private fields for encapsulation
    private String vehicleId;
    private String driverName;
    private double ratePerKm;

    // Constructor
    public Vehicle(String vehicleId, String driverName, double ratePerKm) {
        this.vehicleId = vehicleId;
        this.driverName = driverName;
        this.ratePerKm = ratePerKm;
    }

    // Getter methods for encapsulation
    public String getVehicleId() {
        return vehicleId;
    }

    public String getDriverName() {
        return driverName;
    }

    public double getRatePerKm() {
        return ratePerKm;
    }

    // Concrete method to get vehicle details
    public String getVehicleDetails() {
        return "Vehicle ID: " + vehicleId + ", Driver Name: " + driverName + ", Rate Per Km: " + ratePerKm;
    }

    // Abstract method to calculate fare
    public abstract double calculateFare(double distance);
}
