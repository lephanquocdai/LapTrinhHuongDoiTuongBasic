package com.bootcamp.Thi1;

import java.util.Scanner;

public class BankAppThi {
    private static final String HEADER = "=== Chuong trinh quan ly ngan hang ===";
    private static final String CURRENCY = "VND";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            demonstrateBankOperations(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void demonstrateBankOperations(Scanner scanner) {
        System.out.println(HEADER);
        System.out.println("So object hien tai: " + BankAccountThi.getTotalCreated());

        BankAccountThi accountA = new BankAccountThi("A1", "An", -50);
        BankAccountThi accountB = new BankAccountThi("B1", "Binh", 1000);
        System.out.println("Tong object: " + BankAccountThi.getTotalCreated());

        System.out.println("--- Giao dich A1 ---");
        accountA.deposit(250);
        accountA.display();

        System.out.println("--- Giao dich B1 ---");
        accountB.withdraw(300);
        accountB.display();

        displayAccountBalances(accountA, accountB);
    }

    private static void displayAccountBalances(BankAccountThi accountA, BankAccountThi accountB) {
        System.out.println("So du TK001: " + accountA.getBalance() + " " + CURRENCY);
        System.out.println("So du TK002: " + accountB.getBalance() + " " + CURRENCY);
    }
}
