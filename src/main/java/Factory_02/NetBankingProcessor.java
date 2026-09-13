package Factory_02;
public class NetBankingProcessor implements PaymentProcessor {

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing Net Banking payment: ₹" + amount);
    }
}
