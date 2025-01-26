package Day6_Polymorphism.problemStatement.EcommerceManagement;

public class Clothing extends Product implements Taxable {
    public Clothing(int productId, String name, int price) {
        super(productId, name, price);
    }
    @Override
    public int calculateTax(){
        return (int)(getPrice() + (getPrice() * 0.18));
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Applied Tax : 18%");
    }

    @Override
    public int calculateDiscount() {
        return (int)(getPrice() - (getPrice()*0.2));
    }

    public int calculatePrice(){
        return getPrice()+calculateTax()+calculateDiscount();
    }
}
