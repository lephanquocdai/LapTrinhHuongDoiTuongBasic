package com.bootcamp.lab1;

import java.util.Scanner;

public class DemChanLe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap so luong phan tu: ");
        int n = scanner.nextInt();

        int[] mang = new int[n];

        System.out.println("Nhap cac phan tu: ");
        for (int i = 0; i < n; i++) {
            System.out.print("Phan tu thu" + (i+1) + ": ");
            mang[i] = scanner.nextInt();
        }

        int demChan = 0;
        int demLe = 0;

        for (int i = 0; i < n; i++) {
            if (mang[i] % 2 == 0) {
                demChan++;
            } else {
                demLe++;
            }
        }

        System.out.println("\n--- Ket qua ---");
        System.out.println("So chan: " + demChan);
        System.out.println("So le: " + demLe);

        scanner.close();
    }
}
