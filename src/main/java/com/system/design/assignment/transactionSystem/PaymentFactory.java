package com.system.design.assignment.transactionSystem;

public class PaymentFactory {

    public static Payment createPayment(String paymentMethod){
        if (paymentMethod == null) {
            throw new IllegalArgumentException("Payment method cannot be null");
        }

        if (paymentMethod.equalsIgnoreCase("UPI")) {
            return new UpiPayment();
        }

        if (paymentMethod.equalsIgnoreCase("CARD")) {
            return new CardPayment();
        }

        throw  new IllegalArgumentException("Unsupported payment method :: "+paymentMethod);
    }
}
