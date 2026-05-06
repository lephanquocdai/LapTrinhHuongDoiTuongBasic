package com.bootcamp.lab5.Lab52;


/**
 * BankAccount class - Quản lý tài khoản ngân hàng
 * Sử dụng custom exception khi số dư không đủ
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("So du ban dau khong duoc am");
        }
        this.balance = balance;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Tien rut phai duong");
        }

        if (amount > balance) {
            // Ném custom exception
            throw new InsufficientFundsException(balance, amount);
        }

        this.balance -= amount;
        System.out.println("Da rut " + amount + " VND. So du con: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Tien nap phai duong");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }
}
