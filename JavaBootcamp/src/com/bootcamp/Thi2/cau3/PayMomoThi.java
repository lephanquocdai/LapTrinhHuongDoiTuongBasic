package com.bootcamp.Thi2.cau3;

public class PayMomoThi implements PaymentMethodThi {

    @Override
    public void pay(double amount) {
        // TODO Auto-generated method stub
        System.out.println("[Momo] Dang thanh toán: " + amount + "VND");
        System.out.println("Thanh toan thanh cong qua Momo!");
    }
}
