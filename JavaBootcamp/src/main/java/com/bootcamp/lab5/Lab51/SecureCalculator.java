package com.bootcamp.lab5.Lab51;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MAY TINH BAT TU ===\n");

        while (true) {
            try {
                // Vung nguy hiem (Risky Zone)
                System.out.print("Nhap so bi chia: ");
                int a = sc.nextInt();

                System.out.print("Nhap so chia: ");
                int b = sc.nextInt();

                // Logic co the gay loi toan hoc
                int result = divide(a, b);

                System.out.println("[OK] Ket qua: " + result);
                break; // Thanh cong -> Thoat vong lap

            } catch (InputMismatchException e) {
                // Xu ly loi nhap sai kieu (Chu thay vi so)
                System.out.println("[ERROR] Loi: Ban nhap chu cai! Vui long nhap so.");
                sc.nextLine(); // QUAN TRONG: Nuot bo dong nhap sai

            } catch (ArithmeticException e) {
                // Xu ly loi toan hoc (Chia 0)
                System.out.println("[ERROR] Loi toan: " + e.getMessage());

            } catch (Exception e) {
                // Luoi bat moi loai loi khong ngo toi
                System.out.println("[ERROR] Loi he thong: " + e.toString());
                e.printStackTrace(); // In stack trace de debug
            }
        }

        sc.close();
    }

    // Method co the nem exception
    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cam chia cho so 0!");
        }
        return a / b;
    }
}
