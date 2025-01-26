package Day6_Polymorphism.problemStatement.VehicleSystem;

public abstract class Vehicle implements Insurable {
    private final String vehicleNumber;
    private String type;
    private int rentalRate;

    public Vehicle(String vehicleNumber, String type, int rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.type = type;
        this.rentalRate = rentalRate;
    }

    public String getVehicleNumber() {
        return vehicleNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getRentalRate() {
        return rentalRate;
    }

    public void setRentalRate(int rentalRate) {
        this.rentalRate = rentalRate;
    }
    public abstract double calculateRentalCost(int days);
    // Concrete method to get vehicle details
    public void getVehicleDetails() {
        System.out.println("Vehicle Number: " + vehicleNumber);
        System.out.println("Type: " + type);
        System.out.println("Rental Rate per Day: " + rentalRate);
    }
}
