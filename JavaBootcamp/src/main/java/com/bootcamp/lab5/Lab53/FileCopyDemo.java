package com.bootcamp.lab5.Lab53;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo su dung nhieu tai nguyen trong Try-with-resources
 * Doc noi dung tu file nay va ghi sang file khac
 */
public class FileCopyDemo {
    public static void main(String[] args) {
        Path inputPath = Paths.get("data.txt");
        Path outputPath = Paths.get("output.txt");

        System.out.println("Dang sao chep tu data.txt sang output.txt...");

        // Khai bao nhieu tai nguyen trong dau ngoac don, cach nhau boi dau cham phay
        try (
            BufferedReader reader = Files.newBufferedReader(inputPath);
            BufferedWriter writer = Files.newBufferedWriter(outputPath)
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Sao chep thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi trong qua trinh sao chep: " + e.getMessage());
            e.printStackTrace();
        }
        // Ca reader va writer se tu dong duoc dong theo thu tu nguoc lai khi ket thuc khoi try
    }
}
