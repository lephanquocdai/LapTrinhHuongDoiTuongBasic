package com.bootcamp.lab5.Lab54;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Doc File An Toan - Lab 5.4
 * Chuong trinh minh hoa cach doc file an toan su dung NIO.2 va xu ly ngoai le.
 */
public class ConfigReader {
    public static void main(String[] args) {
        // Duong dan den file config.txt (nam o thu muc goc cua project)
        Path path = Paths.get("config.txt");

        try {
            // Doc toan bo file thanh String (Java 11+)
            String content = Files.readString(path);
            System.out.println("--- Noi dung file config.txt ---");
            System.out.println(content);
            System.out.println("-------------------------------");

        } catch (java.nio.file.NoSuchFileException e) {
            System.out.println("File khong ton tai: " + path.toAbsolutePath());
            System.out.println("Vui long tao file config.txt truoc khi chay chuong trinh.");

        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
