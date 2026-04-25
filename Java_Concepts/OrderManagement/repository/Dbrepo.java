package Java_Concepts.OrderManagement.repository;

import Java_Concepts.OrderManagement.orders.Order;

public class Dbrepo implements Orderrepo {
    @Override
    public void saveOrder(Order order) {
        // Simulate saving order to a database
        System.out.println("Saving order with ID: " + order.getId() + " and Amount: " + order.getAmount());
    }
}
