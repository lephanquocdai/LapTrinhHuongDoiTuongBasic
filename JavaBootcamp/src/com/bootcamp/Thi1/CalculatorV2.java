package com.bootcamp.Thi1;

import java.util.Scanner;

public class CalculatorV2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("===May Tinh Ca Nhan==="); 
       System.out.print("Nhap so1: ");
       double so1 = scanner.nextDouble();

       System.out.print("Nhap so2: ");
       double so2 = scanner.nextDouble();

       System.out.print("Chon phep toan op (+,-,*,/): ");
       char phepTinh = scanner.next().charAt(0);
       scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập phepTinh

       double ketQua = 0;
       boolean thanhCong = true;
       System.out.print("Nhap ghi chu: ");
       String ghiChu = scanner.nextLine();

       switch (phepTinh) {
            case '+':
                ketQua = so1 + so2;
                break;
            case '-':
                ketQua = so1 - so2;
                break;
            case '*':
                ketQua = so1 * so2;
                break;
            case '/':
                while (so2 == 0) {
                    System.out.println("LOI: KHONG THE CHIA CHO 0. VUI LONG NHAP LAI SO2!");
                    System.out.print("Nhap lai so2: ");
                    so2 = scanner.nextDouble();
                }
                ketQua = so1 / so2;
                break;
            default:
                System.out.println("Loi: Phep tinh khong hop le!");
                thanhCong = false;
                break;
       }
       if (thanhCong) {
            System.out.printf("KET QUA: %.2f %c %.2f = %.2f\n", so1, phepTinh, so2, ketQua);
            System.out.println("GHI CHU: " + ghiChu);
        }
        scanner.close();
    }
}