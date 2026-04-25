package com.bootcamp.Thi2.cau3;

public class PaymentFactoryThi {
    // Static Factory Method
    public static PaymentMethodThi createPaymentMethod(String type) {
    // Logic tạo object được tập trung ở đây
        switch (type.toLowerCase()) {
            case "momo":
                return new PayMomoThi();
            case "cash":
            case "tienmat":
                return new PayCashThi();
            default:
                throw new IllegalArgumentException("Chua ho tro phuong thuc: " + type);
        }
    }

}
