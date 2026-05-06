package com.bootcamp.lab1;
 import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       System.out.println("===May Tinh Ca Nhan==="); 
       System.out.print("Nhap so thu nhat: ");
       double so1 = scanner.nextDouble();

       System.out.print("Nhap so thu hai: ");
       double so2 = scanner.nextDouble();

       System.out.print("Chon phep tinh (+,-,*,/): ");
       char phepTinh = scanner.next().charAt(0);

       double ketQua = 0;
       boolean thanhCong = true;

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
                if (so2 == 0) {
                    System.out.println("Loi: Khong the chia cho 0 !");
                    thanhCong = false;
                } else {
                    ketQua = so1/so2;
                }
                break;
            default:
                System.out.println("Loi: Phep tinh khong hop le!");
                thanhCong = false;
                break;
       }
       if (thanhCong) {
            System.out.printf("Ket qua: %.2f %c %.2f = %.2f\n", so1, phepTinh, so2, ketQua);
        }
        scanner.close();
    }
}
