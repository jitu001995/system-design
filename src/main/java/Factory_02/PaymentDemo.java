package Factory_02;

public class PaymentDemo {
    public static void main(String[] args){


                PaymentProcessor creditCard =
                        PaymentProcessorFactory.getProcessor("CREDIT_CARD");

                creditCard.processPayment(5000);


                PaymentProcessor upi =
                        PaymentProcessorFactory.getProcessor("UPI");

                upi.processPayment(2500);


                PaymentProcessor netBanking =
                        PaymentProcessorFactory.getProcessor("NET_BANKING");

                netBanking.processPayment(10000);
            }

}
