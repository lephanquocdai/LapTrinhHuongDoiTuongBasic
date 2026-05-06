package com.bootcamp.Thi1;

import java.util.Scanner;

public class BankAppThi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            runBankApp(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void runBankApp(Scanner scanner) {
        int m;
        do {
            System.out.print("Nhap so luong tai khoan (m >= 1): ");
            m = scanner.nextInt();
        } while (m < 1);

        BankAccountThi[] ds = new BankAccountThi[m];
        for (int i = 0; i < m; i++) {
            System.out.println("\n--- Tai khoan " + (i + 1) + " ---");
            ds[i] = inputAccountInfo(scanner);
            processTransactions(scanner, ds[i], i);
            ds[i].display();
        }

        System.out.println("APP_NAME: " + BankAccountThi.APP_NAME);
        System.out.println("TONG TAI KHOAN TAO: " + BankAccountThi.getTotalCreated());
    }

    private static BankAccountThi inputAccountInfo(Scanner scanner) {
        System.out.print("Nhap so TK: ");
        String accountNumber = scanner.next();
        scanner.nextLine();
        System.out.print("Nhap ten chu TK: ");
        String ownerName = scanner.nextLine();

        double initialBalance;
        do {
            System.out.print("Nhap so du ban dau (>= 0): ");
            initialBalance = scanner.nextDouble();
            if (initialBalance < 0) System.out.println("So du phai >= 0. Moi nhap lai!");
        } while (initialBalance < 0);

        return new BankAccountThi(accountNumber, ownerName, initialBalance);
    }

    private static void processTransactions(Scanner scanner, BankAccountThi account, int accountIndex) {
        System.out.print("Nhap so giao dich (k >= 0): ");
        int k = scanner.nextInt();

        for (int j = 0; j < k; j++) {
            System.out.print("Giao dich " + (j + 1) + " - Loai (D/W): ");
            char type = Character.toUpperCase(scanner.next().charAt(0));
            System.out.print("Nhap so tien: ");
            double amount = scanner.nextDouble();

            if (type == 'D') account.deposit(amount);
            else if (type == 'W') account.withdraw(amount);
            else System.out.println("Loai giao dich khong hop le!");
        }
    }
}
