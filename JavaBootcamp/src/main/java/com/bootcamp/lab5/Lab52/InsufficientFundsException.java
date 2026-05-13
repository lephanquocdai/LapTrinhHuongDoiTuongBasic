package com.bootcamp.lab5.Lab52;

/**
 * Custom Exception thrown when a bank account has insufficient funds for a withdrawal.
 */
public class InsufficientFundsException extends RuntimeException {
    private final double balance;
    private final double amount;

    public InsufficientFundsException(double balance, double amount) {
        super(String.format("Insufficient funds! Current balance: %.2f, Attempted withdrawal: %.2f", balance, amount));
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
