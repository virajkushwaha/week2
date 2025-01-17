public class ItemDetails {
    int itemCode;
    String itemName;
    int price;

    // Constructor to initialize item details
    ItemDetails(int itemCode, String itemName, int price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    // Display item details
    void display() {
        System.out.println("Item ID: " + itemCode + "\nItem Name: " + itemName + "\nPrice: " + price);
    }

    // Calculate and display cost based on quantity
    void cost(int quantity) {
        System.out.println("Cost as per the quantity: " + (price * quantity));
    }
}
