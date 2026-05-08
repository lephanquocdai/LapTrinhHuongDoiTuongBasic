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
            System.out.print("Nhap tu tieng Anh (hoac 'Quit' de thoat): ");
            if (!sc.hasNextLine()) break;
            
            String word = sc.nextLine().trim();

            if (word.equalsIgnoreCase("Quit")) {
                break;
            }

            if (word.isEmpty()) {
                continue;
            }

            String meaning = dict.translate(word);
            System.out.println(" " + meaning + "\n");
        }

        sc.close();
    }
}
