package com.bootcamp.lab4.Lab42;

public class PaymentFactory {
    // Static Factory Method
    public static PaymentMethod createPaymentMethod(String type) {
    // Logic tạo object được tập trung ở đây
        switch (type.toLowerCase()) {
            case "momo":
                return new Momo();
            case "zalo":
            case "zalopay":
                return new ZaloPay();
            case "cash":
            case "tienmat":
                return new Cash();
            default:
                throw new IllegalArgumentException("Chua ho tro phuong thuc: " + type);
        }
    }

}
