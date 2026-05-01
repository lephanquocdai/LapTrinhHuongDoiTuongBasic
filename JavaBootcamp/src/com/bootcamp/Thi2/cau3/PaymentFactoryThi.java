package com.bootcamp.Thi2.cau3;

public class PaymentFactoryThi {
    private static final String MOMO_TYPE = "momo";
    private static final String CASH_TYPE = "cash";
    private static final String CASH_VI_TYPE = "tienmat";
    private static final String UNSUPPORTED_ERROR = "Chua ho tro phuong thuc: ";

    private PaymentFactoryThi() {
        // Private constructor to prevent instantiation
    }

    public static PaymentMethodThi createPaymentMethod(String type) {
        if (type == null || type.trim().isEmpty()) {
            throw new IllegalArgumentException("Payment type cannot be null or empty");
        }

        switch (type.toLowerCase()) {
            case MOMO_TYPE:
                return new PayMomoThi();
            case CASH_TYPE:
            case CASH_VI_TYPE:
                return new PayCashThi();
            default:
                throw new IllegalArgumentException(UNSUPPORTED_ERROR + type);
        }
    }
}
