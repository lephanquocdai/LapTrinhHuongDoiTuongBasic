package com.bootcamp.Thi2.cau3;

import java.util.Scanner;

public class ShopAppThi {
    private static final String HEADER = "=== CUA HANG TRUC TUYEN ===";
    private static final String AMOUNT_PROMPT = "Nhap so tien: ";
    private static final String INVALID_INPUT_MESSAGE = "Sai kieu, nhap lai: ";
    private static final String PAYMENT_TYPE_PROMPT = "Chon phuong thuc thanh toan (momo/cash): ";
    private static final double MINIMUM_AMOUNT = 0.0;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            processPayment(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void processPayment(Scanner scanner) {
        System.out.println(HEADER);
        double amount = inputAmount(scanner);
        System.out.print(PAYMENT_TYPE_PROMPT);
        String paymentType = scanner.next();

        PaymentMethodThi payment = PaymentFactoryThi.createPaymentMethod(paymentType);
        payment.pay(amount);
    }

    private static double inputAmount(Scanner scanner) {
        double amount;
        do {
            System.out.print(AMOUNT_PROMPT);
            while (!scanner.hasNextDouble()) {
                System.out.print(INVALID_INPUT_MESSAGE);
                scanner.next();
            }
            amount = scanner.nextDouble();
        } while (amount <= MINIMUM_AMOUNT);
        return amount;
    }
}