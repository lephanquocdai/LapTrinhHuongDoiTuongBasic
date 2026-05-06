package com.bootcamp.lab4.Lab42;

public class ZaloPay implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[ZaloPay] Dang thanh toan: " + amount + "VND");
        System.out.println("Thanh toan thanh cong qua ZaloPay!");
    }
}
