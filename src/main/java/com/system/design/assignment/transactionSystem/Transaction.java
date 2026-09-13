package com.system.design.assignment.transactionSystem;

public class Transaction {
    private final String transactionId;
    private final double amount;
    private final String currency;
    private final String sender;
    private final String receiver;
    private final String description;
    private final String paymentMethod;

    Transaction(Builder builder){
        this.transactionId = builder.transactionId;
        this.amount = builder.amount;
        this.currency = builder.currency;
        this.sender = builder.sender;
        this.receiver = builder.receiver;
        this.description = builder.description;
        this.paymentMethod = builder.paymentMethod;
    }
    public String getTransactionId() {
        return transactionId;
    }

    public double getAmount() {
        return amount;
    }

    public String getCurrency() {
        return currency;
    }

    public String getSender() {
        return sender;
    }

    public String getReceiver() {
        return receiver;
    }

    public String getDescription() {
        return description;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    @Override
    public String toString() {

        return "Transaction{" +
                "transactionId='" + transactionId + '\'' +
                ", amount=" + amount +
                ", currency='" + currency + '\'' +
                ", sender='" + sender + '\'' +
                ", receiver='" + receiver + '\'' +
                ", description='" + description + '\'' +
                ", paymentMethod='" + paymentMethod + '\'' +
                '}';
    }
    public static class Builder{
        private  String transactionId;
        private  double amount;
        private  String currency;
        private  String sender;
        private  String receiver;
        private  String description;
        private  String paymentMethod;

        public Builder transactionId(String transactionId){
            this.transactionId = transactionId;
            return this;
        }
        public Builder amount(double amount){
            this.amount = amount;
            return this;
        }
        public Builder currency(String currency){
            this.currency = currency;
            return this;
        }
        public Builder sender(String sender){
            this.sender = sender;
            return this;
        }
        public Builder receiver(String receiver){
            this.receiver = receiver;
            return this;
        }

        public Builder description(String description){
            this.description = description;
            return this;
        }
        public Builder paymentMethod(String paymentMethod){
            this.paymentMethod = paymentMethod;
            return this;
        }

        public Transaction build() {

            if (transactionId == null || transactionId.isEmpty()) {
                throw new IllegalArgumentException(
                        "Transaction ID is required"
                );
            }

            if (amount <= 0) {
                throw new IllegalArgumentException(
                        "Amount must be greater than zero"
                );
            }

            return new Transaction(this);
        }
    }
}

