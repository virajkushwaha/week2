public class EcommercePlatform {
    public static void main(String[] args) {
        // Create products
        Product product1 = new Product("Laptop", 1200.00);
        Product product2 = new Product("Smartphone", 800.00);
        Product product3 = new Product("Headphones", 150.00);

        // Create customers
        Customer customer1 = new Customer("Alice");
        Customer customer2 = new Customer("Bob");

        // Customer 1 places an order
        Order order1 = customer1.placeOrder(1);
        order1.addProduct(product1);
        order1.addProduct(product3);

        // Customer 2 places an order
        Order order2 = customer2.placeOrder(2);
        order2.addProduct(product2);

        // Display order details
        System.out.println("Order Details:");
        for (Order order : customer1.getOrders()) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products: " + order.getProducts());
            System.out.println("Total: $" + order.calculateTotal());
            System.out.println();
        }

        for (Order order : customer2.getOrders()) {
            System.out.println("Customer: " + order.getCustomer().getName());
            System.out.println("Order ID: " + order.getOrderId());
            System.out.println("Products: " + order.getProducts());
            System.out.println("Total: $" + order.calculateTotal());
            System.out.println();
        }
    }
}
