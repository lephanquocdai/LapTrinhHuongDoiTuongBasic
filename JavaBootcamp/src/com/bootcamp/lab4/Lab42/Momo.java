package com.bootcamp.lab4.Lab42;

public class Momo implements PaymentMethod {

    @Override
    public void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("[Momo] Dang thanh toán: " + amount + "VND");
        System.out.println("Thanh toan thanh cong qua Momo!");
    }
}
