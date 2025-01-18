public class ProductDetails {
    String name;
    double price;
    int totalProducts = 0 ;
    //default constructor
    public ProductDetails() {
        System.out.println("Default constructor");
    }
    //parametrized constructor
    public ProductDetails(String name, double price) {
        this.name = name;
        this.price = price;
        this.totalProducts += 1;
    }
    //displayProductDetails method

    public void displayProductDetails() {
        System.out.println("Product Name: " + name + "\nPrice: " + price);
    }
    
    public void displayTotalProducts() {
        System.out.println("Total Products: " + totalProducts);
    }   
}