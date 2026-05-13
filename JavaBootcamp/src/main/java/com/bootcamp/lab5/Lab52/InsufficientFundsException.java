package com.bootcamp.lab5.Lab52;

/**
 * Custom Exception - Kế thừa từ RuntimeException (Unchecked)
 * Được ném khi số dư không đủ để thực hiện rút tiền
 */
public class InsufficientFundsException extends RuntimeException {
    private double balance;
    private double amount;

    public InsufficientFundsException(double balance, double amount) {
        super("Thieu tien! Ban co " + balance + " VND, nhung muon rut " +
                amount + " VND");
        this.balance = balance;
        this.amount = amount;
    }

    public double getBalance() {
        return balance;
    }

    public double getAmount() {
        return amount;
    }
}
