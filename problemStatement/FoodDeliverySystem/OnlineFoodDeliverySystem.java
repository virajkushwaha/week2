package Day6_Polymorphism.problemStatement.FoodDeliverySystem;


// Main Class - OnlineFoodDeliverySystem
public class OnlineFoodDeliverySystem {
    public static void main(String[] args) {
        // Creating food items
        FoodItem vegItem = new VegItem("Paneer Butter Masala", 200.0, 2);
        FoodItem nonVegItem = new NonVegItem("Chicken Biryani", 300.0, 3);

        // Polymorphism: Managing items with a general FoodItem reference
        FoodItem[] foodItems = { vegItem, nonVegItem };

        // Processing each food item
        for (FoodItem item : foodItems) {
            System.out.println(item.getItemDetails());
            System.out.println("Total Price: " + item.calculateTotalPrice());

            // Applying discount via the Discountable interface
            Discountable discountableItem = (Discountable) item;
            discountableItem.applyDiscount(10); // Applying 10% discount
            System.out.println(discountableItem.getDiscountDetails());
            System.out.println("Price after Discount: " +
                    (item.calculateTotalPrice() - Double.parseDouble(discountableItem.getDiscountDetails().split(": ")[1])));
            System.out.println();
        }
    }
}
