
// Creating the ShoppingCart class
public class ShoppingCart {
    CartItem[] cartItems;
    int itemCount;

    // Constructor to initialize the shopping cart with a maximum of 5 items
    public ShoppingCart() {
        cartItems = new CartItem[5]; // Maximum 5 items in the cart
        itemCount = 0;
    }

    // Method to add an item to the cart
    public void addItem(CartItem item) {
        if (itemCount < cartItems.length) {
            cartItems[itemCount] = item;
            itemCount++;
        } else {
            System.out.println("Cart is full, cannot add more items.");
        }
    }

    // Method to remove an item from the cart
    public void removeItem(String itemName) {
        for (int i = 0; i < itemCount; i++) {
            if (cartItems[i].itemName.equals(itemName)) {
                // Shift items to remove the item
                for (int j = i; j < itemCount - 1; j++) {
                    cartItems[j] = cartItems[j + 1];
                }
                cartItems[itemCount - 1] = null; // Nullify the last item
                itemCount--; // Decrease item count
                System.out.println(itemName + " has been removed from the cart.");
                return;
            }
        }
        System.out.println("Item not found in the cart.");
    }

    // Method to display the total cost of the items in the cart
    public void displayTotalCost() {
        double totalCost = 0;
        for (int i = 0; i < itemCount; i++) {
            totalCost += cartItems[i].getTotalPrice();
        }
        System.out.println("Total Cost: $" + totalCost);
    }

    // Method to display all items in the cart
    public void displayCartItems() {
        if (itemCount == 0) {
            System.out.println("The cart is empty.");
            return;
        }
        for (int i = 0; i < itemCount; i++) {
            cartItems[i].displayItemDetails();
        }
    }

    public static void main(String[] args) {
        // Creating the shopping cart object
        ShoppingCart cart = new ShoppingCart();

        // Adding items to the cart
        CartItem item1 = new CartItem("Laptop", 1000.00, 1);
        CartItem item2 = new CartItem("Phone", 500.00, 2);
        CartItem item3 = new CartItem("Headphones", 150.00, 3);

        cart.addItem(item1);
        cart.addItem(item2);
        cart.addItem(item3);

        // Displaying the cart items
        System.out.println("Items in the cart:");
        cart.displayCartItems();

        // Displaying the total cost
        cart.displayTotalCost();

        // Removing an item from the cart
        cart.removeItem("Phone");

        // Displaying the cart items after removal
        System.out.println("\nItems in the cart after removal:");
        cart.displayCartItems();

        // Displaying the total cost after removal
        cart.displayTotalCost();
    }
}

