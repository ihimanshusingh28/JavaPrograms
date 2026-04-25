package Java_Concepts.OrderManagement;
import Java_Concepts.OrderManagement.Services.OrderService;
import Java_Concepts.OrderManagement.orders.Order;
import Java_Concepts.OrderManagement.payments.CreditCardpay;
import Java_Concepts.OrderManagement.repository.Dbrepo;
import Java_Concepts.OrderManagement.repository.Orderrepo;
import Java_Concepts.OrderManagement.payments.PaymentProcessor;

public class Main {
    public static void main(String[] args) {
        Orderrepo orderRepo = new Dbrepo();
        PaymentProcessor paymentProcessor = new CreditCardpay();

        OrderService orderService = new OrderService(orderRepo, paymentProcessor);

        Order order = new Order(1, 100.0);

        orderService.placeOrder(order);
    }
    
}
