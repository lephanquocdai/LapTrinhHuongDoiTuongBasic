package com.bootcamp.Thi2.cau3;

public class PayCashThi implements PaymentMethodThi {
    @Override
    public void pay(double amount) {
        System.out.println("[Tien mat] Dang thanh toan: " + amount + "VND");
        System.out.println("Da nhan tien mat!");
    }
}

