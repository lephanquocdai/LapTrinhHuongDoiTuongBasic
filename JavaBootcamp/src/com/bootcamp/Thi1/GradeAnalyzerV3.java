package com.bootcamp.Thi1;

import java.util.Scanner;

public class GradeAnalyzerV3 {
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
        int soLuongDau=0;

        System.out.println("===Bang xep hang===");
        for (int i = 0; i < soLuong; i++) {
            tong += diemSo[i];

            if (diemSo[i] > diemCaoNhat) {
                diemCaoNhat = diemSo[i];              
            }

            if (diemSo[i] < diemThapNhat) {
                diemThapNhat = diemSo[i];              
            }

            if (diemSo[i] >= 5) {
                soLuongDau++;
            }
            String xepLoai = (diemSo[i] >= 5) ? "Dau" : "Rot";
            System.out.printf("Sv thu %d  %.1f -> %s\n", (i+1), diemSo[i], xepLoai); 

        }


        System.out.println("--------------------");
        System.out.printf("CAO NHAT: %.1f\n", diemCaoNhat);
        System.out.printf("THAP NHAT: %.1f\n", diemThapNhat);
        System.out.printf("TRUNG BINH: %.1f\n", (tong / soLuong));
        
        double phanTramDau = (double) soLuongDau / soLuong * 100;
        double phanTramRot = 100 - phanTramDau;
        System.out.printf("TI LE DAU: %.1f%%\n", phanTramDau);
        System.out.printf("TI LE ROT: %.1f%%\n", phanTramRot);

        scanner.close();
    }
}
