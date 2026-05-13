package com.bootcamp.Thi3.cau1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecureCalculatorThi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("=== MAY TINH DA NANG ===\n");

        int a = 0;
        while (true) {
            try {
                System.out.print("Hay nhap so a: ");
                a = sc.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("[ERROR] Loi: Ban da nhap chu cai! Vui long nhap so.");
                sc.nextLine();
            }
        }

        while (true) {
            try {

                System.out.print("Hay nhap so b: ");
                int b = sc.nextInt();

                // Logic co the gay loi toan hoc
                int result = divide(a, b);

                System.out.println("[OK] Ket qua: " + result);
                break; // Thanh cong -> Thoat vong lap

            } catch (InputMismatchException e) {
                // Xu ly loi nhap sai kieu (Chu thay vi so)
                System.out.println("[ERROR] Loi: Ban da nhap chu cai! Vui long nhap so.");
                sc.nextLine(); // QUAN TRONG: Nuot bo dong nhap sai

            } catch (ArithmeticException e) {
                // Xu ly loi toan hoc (Chia 0)
                System.out.println("[ERROR] Loi phep toan: " + e.getMessage());

            } catch (Exception e) {
                // Luoi bat moi loai loi khong ngo toi
                System.out.println("[ERROR] Loi he thong: " + e.toString());
                e.printStackTrace();
                break;
            }
        }

        sc.close();
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Khong the chia cho so 0!");
        }
        return a / b;
    }
}
