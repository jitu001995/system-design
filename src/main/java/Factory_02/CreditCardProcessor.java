package Factory_02;
public class CreditCardProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Credit Card payment: ₹" + amount);
    }
}
