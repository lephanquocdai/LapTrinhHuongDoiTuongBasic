package com.bootcamp.lab4.Lab42;

public class Cash implements PaymentMethod {
    @Override
    public void pay(double amount) {
        System.out.println("[Tien mat] Dang thanh toan: " + amount + "VND");
        System.out.println("Da nhan tien mat!");
    }
}

