

public class Product {
    public static void main(String[] args) {
        ProductDetails product = new ProductDetails("Laptop", 50000);
        ProductDetails product1 = new ProductDetails("Mobile", 20000);
        ProductDetails product2 = new ProductDetails("Tablet", 10000);

        product.displayProductDetails();
        product1.displayProductDetails();
        product2.displayProductDetails();

        product.displayTotalProducts();
    }
}
