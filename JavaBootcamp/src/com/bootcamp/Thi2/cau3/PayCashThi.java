package com.bootcamp.Thi2.cau3;

public class PayCashThi implements PaymentMethodThi {
    private static final String PAYMENT_METHOD = "[Tien mat]";
    private static final String CURRENCY = "VND";
    private static final String PAYING_MESSAGE = "Dang thanh toan: ";
    private static final String SUCCESS_MESSAGE = "Da nhan tien mat!";

    @Override
    public void pay(double amount) {
        System.out.println(PAYMENT_METHOD + " " + PAYING_MESSAGE + amount + CURRENCY);
        System.out.println(SUCCESS_MESSAGE);
    }
}

