package com.bootcamp.lab5.Lab51;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * SecureCalculator provides a robust division utility with input validation
 * and error handling for common arithmetic and input issues.
 */
public class SecureCalculator {

    public static void main(String[] args) {
        System.out.println("=== MÁY TÍNH BẤT TỬ ===\n");

        try (Scanner scanner = new Scanner(System.in)) {
            int dividend = getValidInteger(scanner, "Nhập số bị chia: ");

            while (true) {
                try {
                    int divisor = getValidInteger(scanner, "Nhập số chia: ");
                    int result = divide(dividend, divisor);

                    System.out.println("[OK] Kết quả: " + result);
                    break; 

                } catch (ArithmeticException e) {
                    System.out.println("[ERROR] Lỗi toán học: " + e.getMessage());
                } catch (Exception e) {
                    System.out.println("[ERROR] Lỗi hệ thống không xác định: " + e.getMessage());
                    break;
                }
            }
        }
    }

    /**
     * Repeatedly prompts the user for an integer until a valid one is provided.
     *
     * @param scanner The scanner to read input from.
     * @param prompt  The message to display to the user.
     * @return A valid integer entered by the user.
     */
    private static int getValidInteger(Scanner scanner, String prompt) {
        while (true) {
            try {
                System.out.print(prompt);
                return scanner.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] Lỗi: Vui lòng nhập một số nguyên!");
                scanner.nextLine(); // Clear the invalid input buffer
            }
        }
    }

    /**
     * Divides two integers.
     *
     * @param a The dividend.
     * @param b The divisor.
     * @return The result of the division.
     * @throws ArithmeticException if the divisor is zero.
     */
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Không thể chia cho số 0!");
        }
        return a / b;
    }
}
