class Order {
    private int orderId;
    private String orderDate;

    // Constructor
    public Order(int orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    // Method for status
    public void getOrderStatus() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
    }
}

class ShippedOrder extends Order {
    private int trackingNumber;

    // Constructor
    ShippedOrder(int orderId, String orderDate, int trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    // Overridden method for status
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Tracking Number: " + trackingNumber);
        System.out.println("Order Status: Shipped");
    }
}

class DeliveredOrder extends ShippedOrder {
    private String deliveryDate;

    // Constructor
    DeliveredOrder(int orderId, String orderDate, int trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    // Overridden method for status
    @Override
    public void getOrderStatus() {
        super.getOrderStatus();
        System.out.println("Delivery Date: " + deliveryDate);
        System.out.println("Order Status: Delivered");
    }
}

public class OrderManagement {
    public static void main(String[] args) {
        // Create an object of Order class
        Order order = new Order(1, "2020-01-01");
        order.getOrderStatus();
        System.out.println("------------------------------------------------");

        // Create an object of ShippedOrder class
        ShippedOrder shippedOrder = new ShippedOrder(2, "2020-01-02", 4655);
        shippedOrder.getOrderStatus();
        System.out.println("------------------------------------------------");

        // Create an object of DeliveredOrder class
        DeliveredOrder deliveredOrder = new DeliveredOrder(3, "2020-01-03", 56415, "2024-12-21");
        deliveredOrder.getOrderStatus();
    }
}
