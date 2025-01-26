package Day6_Polymorphism.problemStatement.VehicleSystem;

public class Truck extends Vehicle{
    private String insurancePolicyNumber;

    public Truck(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Truck", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate() + 1000; // Fixed additional charge for trucks
    }

    @Override
    public double calculateInsurance() {
        return 0.1 * getRentalRate(); // 10% of daily rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }

}
