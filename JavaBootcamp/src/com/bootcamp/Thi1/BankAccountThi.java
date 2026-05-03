package com.bootcamp.Thi1;

public class BankAccountThi {
    public static final String APP_NAME = "NGAN HANG DICH VU";
    private static final double MINIMUM_BALANCE = 0.0;
    private static final String CURRENCY = "VND";

    private static int totalCreated = 0;

    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccountThi(String accNum, String name, double initialBalance) {
        if (initialBalance < 0) {
            this.balance = MINIMUM_BALANCE;
            System.out.println("So du ban dau khong duoc am. Da set ve 0.");
        } else {
            this.balance = initialBalance;
        }
        this.accountNumber = accNum;
        this.ownerName = name;
        totalCreated++;
    }

    public BankAccountThi() {
        this("", "", 0.0);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("So tien nap phai lon hon 0!");
            return;
        }
        this.balance += amount;
        System.out.println("Da nap " + amount + " " + CURRENCY + " vao TK" + accountNumber);
        System.out.println("So du hien tai: " + this.balance + " " + CURRENCY);
    }

    public static int getTotalCreated() {
        return totalCreated;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("So tien rut phai lon hon 0!");
            return;
        }
        if (amount > this.balance) {
            System.out.println("So du khong du!");
            System.out.println("So du hien co: " + this.balance + " " + CURRENCY);
            return;
        }
        this.balance -= amount;
        System.out.println("Da rut " + amount + " " + CURRENCY);
        System.out.println("So du con lai: " + this.balance + " " + CURRENCY);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("\n=== Thong tin tai khoan ===");
        System.out.println("So TK: " + accountNumber);
        System.out.println("Chu TK: " + ownerName);
        System.out.printf("So du: %.2f %s\n", balance, CURRENCY);
        System.out.println("===========================\n");
    }
}

