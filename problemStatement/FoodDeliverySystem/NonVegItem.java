package Day6_Polymorphism.problemStatement.FoodDeliverySystem;


// Subclass - NonVegItem
public class NonVegItem extends FoodItem implements Discountable {
    private static final double NON_VEG_SURCHARGE = 50.0; // Additional charge per item
    private double discountApplied;

    // Constructor
    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0.0;
    }

    // Implementing abstract method to calculate total price
    @Override
    public double calculateTotalPrice() {
        return (getPrice() * getQuantity()) + (NON_VEG_SURCHARGE * getQuantity());
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
