package Factory_02;

public class UpiProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment: ₹" + amount);
    }
}
