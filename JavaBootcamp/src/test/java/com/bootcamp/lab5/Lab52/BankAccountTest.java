package com.bootcamp.lab5.Lab52;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for BankAccount class using JUnit 5.
 */
public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    public void setUp() {
        account = new BankAccount(1000.0);
    }

    @Test
    @DisplayName("Should successfully withdraw funds when balance is sufficient")
    public void testWithdraw_Success() {
        account.withdraw(300.0);
        assertEquals(700.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Should throw InsufficientFundsException when withdrawing more than balance")
    public void testWithdraw_InsufficientFunds() {
        InsufficientFundsException exception = assertThrows(
            InsufficientFundsException.class,
            () -> account.withdraw(2000.0)
        );

        assertTrue(exception.getMessage().contains("Insufficient funds"));
        assertEquals(1000.0, exception.getBalance(), 0.01);
        assertEquals(2000.0, exception.getAmount(), 0.01);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when withdrawing negative amount")
    public void testWithdraw_NegativeAmount() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> account.withdraw(-100.0)
        );

        assertTrue(exception.getMessage().contains("must be positive"));
    }

    @Test
    @DisplayName("Should successfully deposit funds")
    public void testDeposit_Success() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when depositing negative amount")
    public void testDeposit_NegativeAmount() {
        assertThrows(
            IllegalArgumentException.class,
            () -> account.deposit(-100.0)
        );
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when initializing with negative balance")
    public void testConstructor_NegativeBalance() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new BankAccount(-500.0)
        );

        assertTrue(exception.getMessage().contains("cannot be negative"));
    }

    @Test
    @DisplayName("Should calculate interest correctly")
    public void testCalculateInterest() {
        double interest = account.calculateInterest(5.0); // 5% of 1000
        assertEquals(50.0, interest, 0.01);
    }

    @Test
    @DisplayName("Should apply interest to balance correctly")
    public void testApplyInterest() {
        account.applyInterest(10.0); // 10% of 1000 = 100
        assertEquals(1100.0, account.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Should successfully transfer funds between accounts")
    public void testTransfer_Success() {
        BankAccount otherAccount = new BankAccount(500.0);
        
        account.transfer(otherAccount, 300.0);
        
        assertEquals(700.0, account.getBalance(), 0.01);
        assertEquals(800.0, otherAccount.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Should throw InsufficientFundsException and not change balances when transfer fails")
    public void testTransfer_InsufficientFunds() {
        BankAccount otherAccount = new BankAccount(500.0);
        
        assertThrows(
            InsufficientFundsException.class,
            () -> account.transfer(otherAccount, 2000.0)
        );
        
        // Balances should remain unchanged
        assertEquals(1000.0, account.getBalance(), 0.01);
        assertEquals(500.0, otherAccount.getBalance(), 0.01);
    }

    @Test
    @DisplayName("Should throw NullPointerException when transferring to null account")
    public void testTransfer_NullDestination() {
        assertThrows(
            NullPointerException.class,
            () -> account.transfer(null, 100.0)
        );
    }

    @Test
    @DisplayName("Should throw IllegalArgumentException when transferring to the same account")
    public void testTransfer_SameAccount() {
        assertThrows(
            IllegalArgumentException.class,
            () -> account.transfer(account, 100.0)
        );
    }
}
