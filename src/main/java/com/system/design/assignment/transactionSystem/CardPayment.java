package com.system.design.assignment.transactionSystem;

public class CardPayment implements Payment {

    @Override
    public void pay(double amount){
        System.out.println("Processing Card Payment :: "+amount);
    }
}
