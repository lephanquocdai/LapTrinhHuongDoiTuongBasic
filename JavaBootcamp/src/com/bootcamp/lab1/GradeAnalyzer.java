package com.bootcamp.lab1;

import java.util.Scanner;

public class GradeAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Lop co bao nhieu sinh vien? ");
        int soLuong = scanner.nextInt();

        double[]  diemSo =  new double[soLuong];

        System.out.println("===Nhap diem===");
        for (int i = 0; i < soLuong; i++) {
            do {
                System.out.printf("Nhap diem SV thu %d (0-10): ", (i+1));
                diemSo[i] = scanner.nextDouble();

                if (diemSo[i] < 0 || diemSo[i] > 10) {
                    System.out.println("Diem phai tu 0 den 10. Moi nhap la!");
                }
            } while (diemSo[i] < 0 || diemSo[i] > 10);
        }

        double tong = 0;
        double diemCaoNhat = diemSo[0];
        double diemThapNhat = diemSo[0];

        System.out.println("===Bang xep hang===");
        for (int i = 0; i < soLuong; i++) {
            tong += diemSo[i];

            if (diemSo[i] > diemCaoNhat) {
                diemCaoNhat = diemSo[i];              
            }

            if (diemSo[i] < diemThapNhat) {
                diemThapNhat = diemSo[i];              
            }

            String xepLoai = (diemSo[i] >= 5) ? "Dau" : "Rot";
            System.out.printf("Sv thu %d  %.1f -> %s\n", (i+1), diemSo[i], xepLoai); 
        }

        System.out.println("--------------------");
        System.out.printf("Diem cao nhat: %.1f\n", diemCaoNhat);
        System.out.printf("Diem thap nhat: %.1f\n", diemThapNhat);
        System.out.printf("Diem trung binh: %.1f\n", (tong / soLuong));

        scanner.close();
    }
}
