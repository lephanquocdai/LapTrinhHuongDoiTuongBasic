package com.bootcamp.Thi2.cau3;

public class PayMomoThi implements PaymentMethodThi {
    private static final String PAYMENT_METHOD = "[Momo]";
    private static final String CURRENCY = "VND";
    private static final String PAYING_MESSAGE = "Dang thanh toan: ";
    private static final String SUCCESS_MESSAGE = "Thanh toan thanh cong qua Momo!";

    @Override
    public void pay(double amount) {
        System.out.println(PAYMENT_METHOD + " " + PAYING_MESSAGE + amount + CURRENCY);
        System.out.println(SUCCESS_MESSAGE);
    }
}
