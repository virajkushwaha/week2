package Day6_Polymorphism.problemStatement.VehicleSystem;

public class Bike extends Vehicle{
    private String insurancePolicyNumber;

    public Bike(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Bike", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 0.03 * getRentalRate(); // 3% of daily rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }
}
