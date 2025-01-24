class Vehicle{
    private int maxSpeed;
    private String fuelType;

    //constructor
    public Vehicle(int maxSpeed, String fuelType) {
        this.maxSpeed = maxSpeed;
        this.fuelType = fuelType;
    }
    //method display info
    public void displayInfo() {
        System.out.println("Max Speed: " + maxSpeed + " mph");
        System.out.println("Fuel Type: " + fuelType);
    }
}

class Car extends Vehicle{
    private int seatCapacity;

    //constructor
    public Car(int maxSpeed, String fuelType,int seatCapacity) {
        super(maxSpeed, fuelType);
        this.seatCapacity = seatCapacity;
    }
    //override display info

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Seat Capacity: "+seatCapacity);
    }
}

class Truck extends Vehicle{
    private int cargoCapacity;

    //Constructor
    public Truck(int maxSpeed, String fuelType,int cargoCapacity) {
        super(maxSpeed, fuelType);
        this.cargoCapacity = cargoCapacity;
    }
    //override display info
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Cargo Capacity: "+cargoCapacity);
    }
}

class Motorcycle extends Vehicle{
    private int stockEngine;
    //constructor

    public Motorcycle(int maxSpeed,String fuelType,int stockEngine){
        super(maxSpeed,fuelType);
        this.stockEngine = stockEngine;
    }
    //override display method
    @Override
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Stock Engine: "+stockEngine);
    }

}



public class TransportSystem {
    public static void main(String[] args) {
        //creating obj of car class
        Vehicle car = new Car(120, "Petrol", 5);
        car.displayInfo();
        System.out.println("------------------------------------------------");
        //creating obj of truck class
        Vehicle truck = new Truck(100, "Diesel", 10);
        truck.displayInfo();
        System.out.println("------------------------------------------------");
        //creating obj of motorcycle class
        Motorcycle bike = new Motorcycle(80, "Petrol", 4);
        bike.displayInfo();
    }
}
