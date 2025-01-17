import java.util.Scanner;

public class Item {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get item details from user input
        System.out.print("Enter the item code: ");
        int itemCode = input.nextInt();
        input.nextLine(); // Consume the newline character

        System.out.print("Enter the item name: ");
        String itemName = input.nextLine();

        System.out.print("Enter the price: ");
        int price = input.nextInt();
        input.nextLine(); // Consume the newline character

        // Create ItemDetails object and display item details
        ItemDetails item = new ItemDetails(itemCode, itemName, price);
        item.display();

        // Get quantity and calculate cost
        System.out.println("Enter the quantity: ");
        int quantity = input.nextInt();

        item.cost(quantity);
    }
}
