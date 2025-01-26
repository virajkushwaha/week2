package Day6_Polymorphism.problemStatement.VehicleSystem;
import java.util.ArrayList;
import java.util.List;
public class VehicleSystem {
    public static void main(String[] args) {
        // Create a list of vehicles
        List<Vehicle> vehicles = new ArrayList<>();

        // Add vehicles
        Car car = new Car("CAR123", 1000, "POLICY001");
        Bike bike = new Bike("BIKE456", 300, "POLICY002");
        Truck truck = new Truck("TRUCK789", 2000, "POLICY003");

        vehicles.add(car);
        vehicles.add(bike);
        vehicles.add(truck);

        // Iterate over vehicles and calculate costs
        int rentalDays = 5; // Example rental duration
        for (Vehicle vehicle : vehicles) {
            System.out.println("Vehicle Details:");
            vehicle.getVehicleDetails();
            System.out.println("Rental Cost for " + rentalDays + " days: " + vehicle.calculateRentalCost(rentalDays));

            if (vehicle instanceof Insurable) {
                Insurable insurableVehicle = (Insurable) vehicle;
                System.out.println("Insurance Cost: " + insurableVehicle.calculateInsurance());
                System.out.println(insurableVehicle.getInsuranceDetails());
            }
            System.out.println("-------------------------");
        }
    }

}
