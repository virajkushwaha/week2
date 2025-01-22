import java.util.ArrayList;
import java.util.List;
//create Customer class
public class Customer {
    private String name;
    private List<Order> orders;

    // Constructor
    public Customer(String name) {
        this.name = name;
        this.orders = new ArrayList<>();
    }

    // Method to place an order
    public Order placeOrder(int orderId) {
        Order order = new Order(orderId, this);
        orders.add(order);
        return order;
    }

    // Getters
    public String getName() {
        return name;
    }
    // returing list of orders
    public List<Order> getOrders() {
        return orders;
    }
}
