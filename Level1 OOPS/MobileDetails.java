public class MobileDetails {

    String brand;
    String modal;
    int price;

    // Constructor to initialize mobile details
    MobileDetails(String brand, String modal, int price) {
        this.brand = brand;
        this.modal = modal;
        this.price = price;
    }

    // Display mobile details
    void display() {
        System.out.println("Brand: " + brand + "\nModal: " + modal + "\nPrice: " + price);
    }
}
