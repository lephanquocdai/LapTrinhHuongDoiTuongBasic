package com.bootcamp.lab1;

public class BangCuuChuong {
    public static void main(String[] args) {
        System.out.println("===Bang cuu chuong");

        for (int i = 2; i <= 9; i++) {
            System.out.println("Bang nhan " + i + ":");
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d\n",i ,j, i*j);
            }
            System.out.println();
        }

    }
}
