package Day6_Polymorphism.problemStatement.EcommerceManagement;

public class Electronics extends Product implements Taxable {

    public Electronics(int productId, String name, int price) {
        super(productId, name, price);
    }
    @Override
    public int calculateTax(){
        return (int)(getPrice() + (getPrice() * 0.5));
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Applied Tax : 50%");
    }

    @Override
    public int calculateDiscount() {
        return (int)(getPrice() - (getPrice()*0.2));
    }
    public int calculatePrice(){
        return getPrice()+calculateTax()+calculateDiscount();
    }
}
