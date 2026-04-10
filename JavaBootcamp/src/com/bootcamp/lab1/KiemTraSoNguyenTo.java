package com.bootcamp.lab1;

import java.util.Scanner;

public class KiemTraSoNguyenTo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so nguyen n: ");
        int n = scanner.nextInt();

        boolean laSoNguyenTo = true;

        if (n<2) {
            laSoNguyenTo = false;
        } else if (n==2) {
            laSoNguyenTo = true;
        } else if (n%2 == 0) {
            laSoNguyenTo = false;
        } else {
            for (int i = 3; i <= Math.sqrt(n); i+= 2) {
                if (n%i==0) {
                    laSoNguyenTo = false;
                    break;
                }
            }
        }

        if (laSoNguyenTo) {
            System.out.println(n + " la so nguyen to");
        } else {
            System.out.println(n + " khong phai la so nguyen to");
        }

        scanner.close();
    }
}
