



public class Product {
    

    //Static Variable discount
    static int discount = 0;
    private static int totalEmployee = 0;
    final String PRODUCT_ID;
    String productName ;
    float price;
    int quantity;


    Product(String productName,float price, String  PRODUCT_ID, int quantity ){
        this.productName = productName;
        this. PRODUCT_ID=  PRODUCT_ID;
        this.price = price;
        this.quantity = quantity;
    }
     
    //Method for updating discount 
    
    static void  updateDiscount(int discountUser){
        discount = discountUser;
    }

    void display(){
        System.out.println("PRODUCT_ID "+ PRODUCT_ID);
        System.out.println("Name: "+productName);
        System.out.println("Quantity : "+quantity);

    }

}
