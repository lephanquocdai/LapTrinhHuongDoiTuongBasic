package com.bootcamp.lab5.Lab53;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo ghi file su dung Try-with-resources
 * Tu dong flush va close BufferedWriter
 */
public class FileWriterDemo {
    public static void main(String[] args) {
        // Ghi vao file data.txt de FileReaderDemo co the doc duoc
        Path path = Paths.get("data.txt");

        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Dong 1: Chao mung ban den voi Java Bootcamp!");
            writer.newLine();
            writer.write("Dong 2: Thuc hanh Try-with-resources.");
            writer.newLine();
            writer.write("Dong 3: Tu dong dong tai nguyen that tien loi.");
            System.out.println("Da ghi du lieu vao file data.txt thanh cong!");
        } catch (IOException e) {
            System.out.println("Loi ghi file: " + e.getMessage());
        }
    }
}
