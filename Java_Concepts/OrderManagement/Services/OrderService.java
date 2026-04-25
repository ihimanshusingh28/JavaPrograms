package Java_Concepts.OrderManagement.Services;
import Java_Concepts.OrderManagement.orders.Order;
import Java_Concepts.OrderManagement.payments.PaymentProcessor;
import Java_Concepts.OrderManagement.repository.Orderrepo;

public class OrderService {
    private Orderrepo orderRepo;
    private PaymentProcessor paymentProcessor;

    public OrderService(Orderrepo orderRepo, PaymentProcessor paymentProcessor) {
        this.orderRepo = orderRepo;
        this.paymentProcessor = paymentProcessor;
    }

    public void placeOrder(Order order) {
        orderRepo.saveOrder(order);
        paymentProcessor.processPayment(order.getAmount());
        System.out.println("Order placed successfully with ID: " + order.getId());
    }
}
