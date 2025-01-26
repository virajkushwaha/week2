package Day6_Polymorphism.problemStatement.EcommerceManagement;



import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    public static void main(String[] args){
        // Create a list of products
        List<Product> product = new ArrayList<>();

        // Add Electronics
        Electronics electronics = new Electronics(101, "WashingMachine", 30000);

        product.add(electronics);


        // Add Clothing
        Clothing clothing = new Clothing(102, "Shirt", 10000);

        product.add(clothing);
        // Add Groceries
        Groceries groceries = new Groceries(103, "biscuit", 10000);

        product.add(groceries);

        // Process and display product details
        for (Product products : product) {
            products.displayDetails();
            products.getTaxDetail();
            System.out.println("-------------------------");
        }
    }
    }


