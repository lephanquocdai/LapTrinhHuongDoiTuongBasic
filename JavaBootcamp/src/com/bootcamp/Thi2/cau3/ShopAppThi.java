package com.bootcamp.Thi2.cau3;

import java.util.Scanner;

public class ShopAppThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double amount;

        System.out.println("=== CUA HANG TRUC TUYEN ===");
        
        do {
            System.out.print("Nhap so tien: ");
            while (!sc.hasNextDouble()) {
                System.out.print("Sai kieu, nhap lai: ");
                sc.next();
            }
            amount = sc.nextDouble();
        } while  ( amount <= 0);



        System.out.print("Chon phuong thuc thanh toan (momo/cash):");
        String paymentType = sc.next();

        // Factory tạo PaymentMethod
        PaymentMethodThi payment = PaymentFactoryThi.createPaymentMethod(paymentType);

        payment.pay(amount);
        sc.close();
    }
}