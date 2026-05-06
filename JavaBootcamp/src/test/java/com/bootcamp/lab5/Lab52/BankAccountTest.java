package com.bootcamp.lab5.Lab52;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Unit Test cho BankAccount class
 * Sử dụng JUnit 5 (Jupiter)
 */
public class BankAccountTest {
    private BankAccount account;

    /**
     * Chạy trước mỗi test - chuẩn bị môi trường sạch
     */
    @BeforeEach
    public void setUp() {
        account = new BankAccount(1000.0);
    }

    /**
     * Test case: Rút tiền thành công
     */
    @Test
    public void testWithdraw_Success() {
        // Arrange: Đã setup trong @BeforeEach

        // Act: Thực hiện hành động
        account.withdraw(300.0);

        // Assert: Kiểm tra kết quả
        assertEquals(700.0, account.getBalance(), 0.01);
    }

    /**
     * Test case: Rút quá số dư → Ném InsufficientFundsException
     */
    @Test
    public void testWithdraw_InsufficientFunds() {
        // Act & Assert: Kiểm tra ném exception
        InsufficientFundsException exception = assertThrows(
            InsufficientFundsException.class,
            () -> account.withdraw(2000.0) // Lambda expression
        );

        // Kiểm tra thông điệp lỗi
        assertTrue(exception.getMessage().contains("Thieu tien"));
        assertEquals(1000.0, exception.getBalance(), 0.01);
        assertEquals(2000.0, exception.getAmount(), 0.01);
    }

    /**
     * Test case: Rút số âm → Ném IllegalArgumentException
     */
    @Test
    public void testWithdraw_NegativeAmount() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> account.withdraw(-100.0)
        );

        assertTrue(exception.getMessage().contains("phai duong"));
    }

    /**
     * Test case: Nạp tiền thành công
     */
    @Test
    public void testDeposit_Success() {
        account.deposit(500.0);
        assertEquals(1500.0, account.getBalance(), 0.01);
    }

    /**
     * Test case: Nạp số âm → Ném IllegalArgumentException
     */
    @Test
    public void testDeposit_NegativeAmount() {
        assertThrows(
            IllegalArgumentException.class,
            () -> account.deposit(-100.0)
        );
    }

    /**
     * Test case: Khởi tạo tài khoản với số dư âm → Ném IllegalArgumentException
     */
    @Test
    public void testConstructor_NegativeBalance() {
        IllegalArgumentException exception = assertThrows(
            IllegalArgumentException.class,
            () -> new BankAccount(-500.0)
        );

        assertTrue(exception.getMessage().contains("khong duoc am"));
    }
}
