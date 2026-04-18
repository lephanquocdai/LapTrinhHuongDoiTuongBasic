package com.bootcamp.lab4.Lab42;

import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== CUA HANG TRUC TUYEN ===");
        System.out.print("Nhap so tien: ");
        double amount = sc.nextDouble();

        System.out.print("Chon phuong thuc thanh toan (momo/zalo/cash):");
        String paymentType = sc.next();

        // Factory tạo PaymentMethod
        PaymentMethod payment =
        PaymentFactory.createPaymentMethod(paymentType);

        // Sử dụng - Không cần biết là Momo hay ZaloPay
        payment.pay(amount);
        sc.close();
    }
}