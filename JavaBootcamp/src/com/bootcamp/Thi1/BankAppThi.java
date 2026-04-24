package com.bootcamp.Thi1;

import java.util.Scanner;

public class BankAppThi  {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        do {
            System.out.print("Nhap m: ");
            int m1 = sc.nextInt();
        } while ( m > 1 || m == 1 );

        BankAccountThi[] ds = new BankAccountThi[m];

        for (int i = 0; i < m-1; i++) {
            System.out.print("Nhap accountNumber: ");
        }



        System.out.println("=== Chuong trinh quan ly ngan hang ===\n");
        System.out.println("So object hien tai: " + BankAccountThi.getTotalCreated());
        BankAccountThi accA = new BankAccountThi("A1", "An", -50);
        BankAccountThi accB = new BankAccountThi("B1", "Binh", 1000);
        System.out.println("Tong object: " + BankAccountThi.getTotalCreated());
        System.out.println("--- Giao dich A1 ---");
        accA.deposit(250);
        accA.display();

        System.out.println("--- Giao dich B1 ---");
        accB.withdraw(300);
        accB.display();

        System.out.println("So du TK001: " + accA.getBalance() + " VND");
        System.out.println("So du TK002: " + accB.getBalance() + " VND");
        }

}
