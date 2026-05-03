package com.bootcamp.Thi1;

import java.util.Scanner;

public class BankAppThi {
    private static final String CURRENCY = "VND";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            runBankApp(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void runBankApp(Scanner scanner) {
        // Input m (number of accounts)
        int m;
        do {
            System.out.print("Nhap so luong tai khoan (m >= 1): ");
            m = scanner.nextInt();
        } while (m < 1);

        BankAccountThi[] ds = new BankAccountThi[m];

        // Input account information
        for (int i = 0; i < m; i++) {
            System.out.println("\n--- Tai khoan " + (i + 1) + " ---");
            System.out.print("Nhap so TK: ");
            String accountNumber = scanner.next();

            scanner.nextLine(); // Clear buffer
            System.out.print("Nhap ten chu TK: ");
            String ownerName = scanner.nextLine();

            // Input and validate initial balance
            double initialBalance;
            do {
                System.out.print("Nhap so du ban dau (>= 0): ");
                initialBalance = scanner.nextDouble();
                if (initialBalance < 0) {
                    System.out.println("So du phai >= 0. Moi nhap lai!");
                }
            } while (initialBalance < 0);

            ds[i] = new BankAccountThi(accountNumber, ownerName, initialBalance);

            // Input and process transactions
            System.out.print("Nhap so giao dich (k >= 0): ");
            int k = scanner.nextInt();

            for (int j = 0; j < k; j++) {
                System.out.print("Giao dich " + (j + 1) + " - Loai (D/W): ");
                char transactionType = scanner.next().charAt(0);

                System.out.print("Nhap so tien: ");
                double amount = scanner.nextDouble();

                if (transactionType == 'D' || transactionType == 'd') {
                    ds[i].deposit(amount);
                } else if (transactionType == 'W' || transactionType == 'w') {
                    ds[i].withdraw(amount);
                } else {
                    System.out.println("Loai giao dich khong hop le!");
                }
            }

            ds[i].display();
        }

        // Display final information
        System.out.println("APP_NAME: " + BankAccountThi.APP_NAME);
        System.out.println("TONG TAI KHOAN TAO: " + BankAccountThi.getTotalCreated());
    }
}
