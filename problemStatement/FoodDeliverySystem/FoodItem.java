package Day6_Polymorphism.problemStatement.FoodDeliverySystem;

// Abstract Class - FoodItem
public abstract class FoodItem {
    // Private fields for encapsulation
    private String itemName;
    private double price;
    private int quantity;

    // Constructor
    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    // Getter methods for encapsulation
    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Concrete method to get item details
    public String getItemDetails() {
        return "Item Name: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }

    // Abstract method to calculate total price
    public abstract double calculateTotalPrice();
}

