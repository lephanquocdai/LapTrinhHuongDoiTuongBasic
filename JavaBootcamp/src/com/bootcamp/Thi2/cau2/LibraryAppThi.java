package com.bootcamp.Thi2.cau2;

import java.util.Scanner;

public class LibraryAppThi {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int d;
        BorrowableDoc[] bDocs = new BorrowableDoc[4];

        bDocs[0] = new BookDoc("Nam Cao", "M1");
        bDocs[1] = new MagazineDoc("Mo vi sao", "M2");
        bDocs[2] = new BookDoc("Truyen Kieu", "M3");
        bDocs[3] = new MagazineDoc("To Huu", "M4");

        do {
            System.out.print("Nhap so ngay muon: ");
            d = sc.nextInt();
        } while (d < 1);


        double totalPhi = 0;
        for (BorrowableDoc bDoc : bDocs) {
            bDoc.display();
            totalPhi += bDoc.getBorrowFee(d);
        }
        System.out.println("\n=====Tong phi====="); 
        System.out.printf("Tong phi: %.0f VND\n" , totalPhi); 
    }
}
