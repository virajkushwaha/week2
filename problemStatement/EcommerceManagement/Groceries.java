package Day6_Polymorphism.problemStatement.EcommerceManagement;

public class Groceries extends Product implements Taxable {
    public Groceries(int productId, String name, int price) {
        super(productId, name, price);
    }
    @Override
    public int calculateTax(){
        return (int)(getPrice() + (getPrice() * 0.05));
    }

    @Override
    public void getTaxDetail() {
        System.out.println("Applied Tax : 5%");
    }

    @Override
    public int calculateDiscount() {
        return (int)(getPrice() - (getPrice()*0.03));
    }
    public int calculatePrice(){
        return getPrice()+calculateTax()+calculateDiscount();
    }
}

