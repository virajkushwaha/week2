package Day6_Polymorphism.problemStatement.RideHailingApplication;


// Main Class - RideHailing
public class RideHailing {
    public static void main(String[] args) {
        // Create instances of different vehicle types
        Vehicle car = new Car("CAR123", "John Doe", 15.0, "Downtown");
        Vehicle bike = new Bike("BIKE456", "Jane Smith", 8.0, "Uptown");
        Vehicle auto = new Auto("AUTO789", "Alex Brown", 10.0, "Midtown");

        // Using polymorphism to calculate fares dynamically
        Vehicle[] vehicles = { car, bike, auto };
        double distance = 10.0; // Example distance in km

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getVehicleDetails());
            System.out.println("Current Location: " + ((GPS) vehicle).getCurrentLocation());
            System.out.println("Fare for " + distance + " km: $" + vehicle.calculateFare(distance));
            System.out.println();
        }

        // Update location for one of the vehicles
        GPS gpsCar = (GPS) car;
        gpsCar.updateLocation("Airport");
        System.out.println("Updated Location of Car: " + gpsCar.getCurrentLocation());
    }
}
