package com.bootcamp.lab6.Lab63;

import java.util.Scanner;

/**
 * DictionaryApp class - Lab 6.3
 * Chuong trinh tra cuu tu dien Anh-Viet.
 */
public class DictionaryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        System.out.println("=== TU DIEN ANH-VIET ===\n");

        while (true) {
            System.out.print("Nhap tu (hoac 'Quit' de thoat, 'Show' de xem tat ca): ");
            if (!sc.hasNextLine()) break;
            
            String word = sc.nextLine().trim();

            if (word.equalsIgnoreCase("Quit")) {
                break;
            }

            if (word.equalsIgnoreCase("Show")) {
                dict.displayAll();
                System.out.println();
                continue;
            }

            if (word.isEmpty()) {
                continue;
            }

            String meaning = dict.translate(word);
            
            if (meaning.startsWith("Khong tim thay tu:")) {
                System.out.println(meaning);
                System.out.print("Ban co muon them tu nay vao tu dien khong? (y/n): ");
                String choice = sc.nextLine().trim();
                if (choice.equalsIgnoreCase("y")) {
                    System.out.print("Nhap nghia tieng Viet cho '" + word + "': ");
                    String vn = sc.nextLine().trim();
                    if (!vn.isEmpty()) {
                        dict.addWord(word, vn);
                    }
                }
            } else {
                System.out.println(" Nghia: " + meaning);
            }
            System.out.println();
        }

        sc.close();
    }
}
