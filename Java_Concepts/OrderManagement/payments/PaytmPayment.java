package Java_Concepts.OrderManagement.payments;

public class PaytmPayment implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Paytm payment of: " + amount);
    }
    
}
