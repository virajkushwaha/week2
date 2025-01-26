package Day6_Polymorphism.problemStatement.FoodDeliverySystem;


// Subclass - VegItem
public class VegItem extends FoodItem implements Discountable {
    private double discountApplied;

    // Constructor
    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0.0;
    }

    // Implementing abstract method to calculate total price
    @Override
    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    // Implementing Discountable methods
    @Override
    public void applyDiscount(double discountPercentage) {
        if (discountPercentage > 0 && discountPercentage <= 100) {
            discountApplied = (calculateTotalPrice() * discountPercentage) / 100;
        } else {
            System.out.println("Invalid discount percentage!");
        }
    }

    @Override
    public String getDiscountDetails() {
        return "Discount Applied: " + discountApplied;
    }
}
