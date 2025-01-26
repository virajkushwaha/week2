package Day6_Polymorphism.problemStatement.VehicleSystem;

public class Car extends Vehicle{
    private String insurancePolicyNumber;

    public Car(String vehicleNumber, int rentalRate, String insurancePolicyNumber) {
        super(vehicleNumber, "Car", rentalRate);
        this.insurancePolicyNumber = insurancePolicyNumber;
    }

    @Override
    public double calculateRentalCost(int days) {
        return days * getRentalRate();
    }

    @Override
    public double calculateInsurance() {
        return 0.05 * getRentalRate(); // 5% of daily rental rate as insurance
    }

    @Override
    public String getInsuranceDetails() {
        return "Insurance Policy: " + insurancePolicyNumber;
    }

}
