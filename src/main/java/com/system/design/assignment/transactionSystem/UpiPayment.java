package com.system.design.assignment.transactionSystem;

public class UpiPayment implements Payment {

    @Override
    public void pay(double amount){
        System.out.println("Processing UPI payment: ₹" + amount);
    }
}
