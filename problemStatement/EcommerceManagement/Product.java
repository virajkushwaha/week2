package Day6_Polymorphism.problemStatement.EcommerceManagement;

public abstract class Product implements Taxable{
    //initializing the variables
    private int productId;
    private String name;
    private int price;
    //constructor

    public Product(int productId, String name, int price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public abstract int calculateDiscount();
    public abstract int calculatePrice();

    public void displayDetails(){
        System.out.println("Product Id: "+productId);
        System.out.println("Product name: "+name);
        System.out.println("Product price: "+price);
        System.out.println("Product discount: "+calculateDiscount());
        System.out.println("Product Final price: "+calculatePrice());

    }

}
