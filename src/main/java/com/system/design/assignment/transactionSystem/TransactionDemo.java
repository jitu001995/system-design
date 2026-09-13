package com.system.design.assignment.transactionSystem;

public class TransactionDemo {
    public static void main(String[] args){
        // =====================================
        // 1. Builder Pattern
        // =====================================

        Transaction transaction = new Transaction.Builder()
                .transactionId("TXN001")
                .amount(5000)
                .currency("INR")
                .sender("Jitendra")
                .receiver("Amazon")
                .description("Laptop Purchase")
                .paymentMethod("UPI")
                .build();


        // =====================================
        // 2. Factory Pattern
        // =====================================

        Payment payment = PaymentFactory.createPayment(
                transaction.getPaymentMethod()
        );


        // =====================================
        // 3. Singleton Pattern
        // =====================================

        TransactionManager manager = TransactionManager.getInstance();


        //======================================
        // Process transaction
        // =====================================

        manager.process(transaction, payment);
    }
}
