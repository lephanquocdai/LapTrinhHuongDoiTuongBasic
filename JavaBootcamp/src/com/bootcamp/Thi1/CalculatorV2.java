package com.bootcamp.Thi1;

import java.util.Scanner;

public class CalculatorV2 {
    private static final String HEADER = "===May Tinh Ca Nhan===";
    private static final String INVALID_OPERATION = "Loi: Phep tinh khong hop le!";
    private static final String DIVISION_BY_ZERO_ERROR = "LOI: KHONG THE CHIA CHO 0. VUI LONG NHAP LAI SO2!";
    private static final String DECIMAL_FORMAT = "KET QUA: %.2f %c %.2f = %.2f\n";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            runCalculator(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void runCalculator(Scanner scanner) {
        System.out.println(HEADER);
        System.out.print("Nhap so1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Nhap so2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Chon phep toan (+,-,*,/): ");
        char operator = scanner.next().charAt(0);

        if (operator == '/' && number2 == 0) {
            number2 = validateDivisor(number2, scanner);
            if (number2 == 0) return;
        }

        scanner.nextLine();
        System.out.print("Nhap ghi chu: ");
        String note = scanner.nextLine();
        calculateAndDisplay(number1, number2, operator, note);
    }

    private static void calculateAndDisplay(double number1, double number2, char operator, String note) {
        double result = 0;
        boolean isValid = true;

        switch (operator) {
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            default:
                System.out.println(INVALID_OPERATION);
                isValid = false;
        }

        if (isValid) {
            System.out.printf(DECIMAL_FORMAT, number1, operator, number2, result);
            System.out.println("GHI CHU: " + note);
        }
    }

    private static double validateDivisor(double divisor, Scanner scanner) {
        while (divisor == 0) {
            System.out.println(DIVISION_BY_ZERO_ERROR);
            System.out.print("Nhap lai so2: ");
            divisor = scanner.nextDouble();
        }
        return divisor;
    }
}