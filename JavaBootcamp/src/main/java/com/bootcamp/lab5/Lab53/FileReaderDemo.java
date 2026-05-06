package com.bootcamp.lab5.Lab53;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Demo doc file su dung Try-with-resources
 * Tu dong dong tai nguyen sau khi ket thuc khoi try
 */
public class FileReaderDemo {
    public static void main(String[] args) {
        Path path = Paths.get("data.txt");

        // Try-with-resources: Tu dong close reader
        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            System.out.println("--- Noi dung file data.txt ---");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Loi doc file: " + e.getMessage());
            System.out.println("Goi y: Hay chay FileWriterDemo truoc de tao file data.txt!");
        }
        // File tu dong duoc close o day!
    }
}
