

public class Car {
    //attributes customerName, carModel, rentalDays and totalCost

    String customerName;
    String carModel;
    int rentalDays;
    double totalCost;
    // Constructor to initialize car details
    //parametrized constructor
    public Car(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = rentalDays * 1000;
    }
    //default constructor
    public Car() {
        System.out.println("Default constructor");
    }
    
    //display method
    public void display() {
        System.out.println("Customer Name: " + customerName + "\nCar Model: " + carModel + "\nRental Days: " + rentalDays + "\nTotal Cost: " + totalCost);
    }


}
