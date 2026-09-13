package com.system.design.assignment.transactionSystem;

public class TransactionManager {
    public static volatile TransactionManager instance=null;

    private TransactionManager(){

    }
    public static TransactionManager getInstance(){
        if(instance==null){
            synchronized(TransactionManager.class){
                if(instance==null){
                    return new TransactionManager();
                }
            }
        }
        return instance;
    }

    public void process(Transaction transaction, Payment payment){
       System.out.println();
        System.out.println();
        System.out.println("===== Processing Transaction =====");

        System.out.println("Transaction ID : "
                + transaction.getTransactionId());

        System.out.println("Sender         : "
                + transaction.getSender());

        System.out.println("Receiver       : "
                + transaction.getReceiver());

        System.out.println("Amount         : "
                + transaction.getAmount()
                + " "
                + transaction.getCurrency());

        System.out.println("Description    : "
                + transaction.getDescription());

        System.out.println("Payment Method : "
                + transaction.getPaymentMethod());

        payment.pay(transaction.getAmount());

        System.out.println("Transaction completed successfully");
    }
}
