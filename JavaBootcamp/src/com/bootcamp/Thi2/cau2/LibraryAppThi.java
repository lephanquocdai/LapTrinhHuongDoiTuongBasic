package com.bootcamp.Thi2.cau2;

import java.util.Scanner;

public class LibraryAppThi {
    private static final String HEADER = "=== LIBRARY MANAGEMENT ===";
    private static final String TOTAL_HEADER = "=====Tong phi=====";
    private static final String TOTAL_FORMAT = "Tong phi: %.0f VND\n";
    private static final int MIN_DAYS = 1;
    private static final int DOCUMENT_COUNT = 4;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            manageLibrary(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void manageLibrary(Scanner scanner) {
        System.out.println(HEADER);
        BorrowableDoc[] documents = initializeDocuments();
        int borrowDays = inputBorrowDays(scanner);
        calculateAndDisplayTotalFee(documents, borrowDays);
    }

    private static BorrowableDoc[] initializeDocuments() {
        BorrowableDoc[] documents = new BorrowableDoc[DOCUMENT_COUNT];
        documents[0] = new BookDoc("Nam Cao", "M1");
        documents[1] = new MagazineDoc("Mo vi sao", "M2");
        documents[2] = new BookDoc("Truyen Kieu", "M3");
        documents[3] = new MagazineDoc("To Huu", "M4");
        return documents;
    }

    private static int inputBorrowDays(Scanner scanner) {
        int days;
        do {
            System.out.print("Nhap so ngay muon: ");
            days = scanner.nextInt();
        } while (days < MIN_DAYS);
        return days;
    }

    private static void calculateAndDisplayTotalFee(BorrowableDoc[] documents, int borrowDays) {
        double totalFee = 0;
        for (BorrowableDoc document : documents) {
            document.display();
            totalFee += document.getBorrowFee(borrowDays);
        }
        System.out.println("\n" + TOTAL_HEADER);
        System.out.printf(TOTAL_FORMAT, totalFee);
    }
