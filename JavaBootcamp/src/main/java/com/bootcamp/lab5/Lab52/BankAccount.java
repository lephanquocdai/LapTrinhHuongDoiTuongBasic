package com.bootcamp.lab5.Lab52;

import java.util.Objects;

/**
 * BankAccount class manages a bank account's balance and operations.
 * It uses custom exceptions to handle insufficient funds.
 */
public class BankAccount {
    private double balance;

    /**
     * Initializes a new BankAccount with a starting balance.
     *
     * @param initialBalance the initial amount in the account (must be non-negative)
     * @throws IllegalArgumentException if initialBalance is negative
     */
    public BankAccount(final double initialBalance) {
        if (initialBalance < 0) {
            throw new IllegalArgumentException("Initial balance cannot be negative");
        }
        this.balance = initialBalance;
    }

    /**
     * Internal method to deduct an amount from the balance.
     *
     * @param amount the amount to deduct (must be positive)
     * @throws IllegalArgumentException if amount is non-positive
     * @throws InsufficientFundsException if amount exceeds current balance
     */
    private void debit(final double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Amount must be positive");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        this.balance -= amount;
    }

    /**
     * Withdraws money from the account.
     *
     * @param amount the amount to withdraw
     */
    public void withdraw(final double amount) {
        debit(amount);
        System.out.printf("Withdrew %.2f VND. Remaining balance: %.2f VND%n", amount, balance);
    }

    /**
     * Deposits money into the account.
     *
     * @param amount the amount to deposit (must be positive)
     * @throws IllegalArgumentException if amount is non-positive
     */
    public void deposit(final double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit amount must be positive");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Calculates interest based on an annual rate.
     *
     * @param annualRate annual interest rate (e.g., 5.0 for 5%)
     * @return the calculated interest amount
     * @throws IllegalArgumentException if annualRate is negative
     */
    public double calculateInterest(final double annualRate) {
        if (annualRate < 0) {
            throw new IllegalArgumentException("Interest rate cannot be negative");
        }
        return balance * (annualRate / 100);
    }

    /**
     * Applies annual interest to the account balance.
     *
     * @param annualRate annual interest rate
     */
    public void applyInterest(final double annualRate) {
        double interest = calculateInterest(annualRate);
        this.balance += interest;
        System.out.printf("Applied interest: %.2f VND. New balance: %.2f VND%n", interest, balance);
    }

    /**
     * Transfers funds to another bank account.
     *
     * @param destination the recipient bank account
     * @param amount the amount to transfer
     * @throws IllegalArgumentException if destination is null or same as this account
     */
    public void transfer(final BankAccount destination, final double amount) {
        Objects.requireNonNull(destination, "Destination account cannot be null");
        
        if (destination == this) {
            throw new IllegalArgumentException("Cannot transfer to the same account");
        }
        
        // Use debit to deduct funds without printing "Withdrew"
        this.debit(amount);
        
        // Deposit into the destination account
        destination.deposit(amount);
        
        System.out.printf("Transferred %.2f VND to another account. Remaining balance: %.2f VND%n", amount, balance);
    }
}
