package com.bootcamp.lab2.mini_Book;

import java.util.Scanner;

public class LibraryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Library lib = new Library();

        int choice;

        do {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tim sach");
            System.out.println("2. Muon sach");
            System.out.println("3. Tra sach");
            System.out.println("4. Hien thi tat ca");
            System.out.println("5. Thoat");
            System.out.print("Chon: ");

            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Nhap ten sach: ");
                    String t1 = sc.nextLine();
                    Book b = lib.findBook(t1);
                    if (b != null) {
                        b.display();
                    } else {
                        System.out.println("Khong tim thay");
                    }
                    break;

                case 2:
                    System.out.print("Nhap ten sach: ");
                    lib.borrowBook(sc.nextLine());
                    break;

                case 3:
                    System.out.print("Nhap ten sach: ");
                    lib.returnBook(sc.nextLine());
                    break;

                case 4:
                    lib.displayAll();
                    break;

                case 5:
                    System.out.println("Thoat chuong trinh");
                    break;

                default:
                    System.out.println("Lua chon khong hop le");
            }

        } while (choice != 5);

        sc.close();
    }
}