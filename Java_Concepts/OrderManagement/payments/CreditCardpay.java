package Java_Concepts.OrderManagement.payments;

public class CreditCardpay implements PaymentProcessor {
    @Override
    public void processPayment(double amount) {
        // Simulate credit card payment processing
        System.out.println("Processing credit card payment of: " + amount);
    }
    
}
