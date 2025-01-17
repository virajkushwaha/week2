public class CartItem {
     // Attributes for the CartItem class
     String itemName;
     double price;
     int quantity;
 
     // Constructor to initialize the item attributes
     public CartItem(String itemName, double price, int quantity) {
         this.itemName = itemName;
         this.price = price;
         this.quantity = quantity;
     }
 
     // Method to get the total price for the item
     public double getTotalPrice() {
         return price * quantity;
     }
 
     // Method to display the item details
     public void displayItemDetails() {
         System.out.println("Item: " + itemName + " | Price: $" + price + " | Quantity: " + quantity);
     }
 
}
