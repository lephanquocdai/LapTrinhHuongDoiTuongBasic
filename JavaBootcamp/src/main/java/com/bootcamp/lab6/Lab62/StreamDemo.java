package com.bootcamp.lab6.Lab62;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stream API Demo - Lab 6.2
 * Xu ly du lieu theo kieu Functional Programming.
 */
public class StreamDemo {
    public static void main(String[] args) {
        // Tao danh sach nhan vien
        List<Employee> staff = Arrays.asList(
            new Employee("Nguyen Van A", "IT", 20000000),
            new Employee("Tran Thi B", "Sale", 15000000),
            new Employee("Le Van C", "IT", 18000000),
            new Employee("Pham Thi D", "IT", 30000000),
            new Employee("Hoang Van E", "HR", 12000000)
        );

        System.out.println("=== PHAN TICH NHAN VIEN ===\n");

        // Yeu cau: Loc IT, luong > 15 trieu, tang luong 10%,
        // sap xep giam dan, lay top 3, in ten
        List<String> result = staff.stream()
            // Buoc 1: Loc (Filter)
            .filter(e -> e.getDepartment().equals("IT"))
            .filter(e -> e.getSalary() > 15000000)

            // Buoc 2: Bien doi (Map) - Tang luong 10%
            .map(e -> {
                double newSalary = e.getSalary() * 1.1;
                return new Employee(e.getName(), e.getDepartment(), newSalary);
            })

            // Buoc 3: Sap xep (Sort) - Giam dan theo luong
            .sorted((e1, e2) -> Double.compare(e2.getSalary(), e1.getSalary()))

            // Buoc 4: Cat gon (Limit) - Lay top 3
            .limit(3)

            // Buoc 5: Ep khuon dau ra (Map to String)
            .map(e -> e.getName() + " - Luong moi: " + String.format("%.0f", e.getSalary()) + " VND")

            // Buoc 6: Dong goi (Collect)
            .collect(Collectors.toList());

        // In ra ket qua
        System.out.println("Top 3 nhan vien IT sau khi tang luong:\n");
        result.forEach(System.out::println);

        // Thong ke khac
        System.out.println("\n=== THONG KE ===\n");

        // Tinh tong luong IT
        double totalITSalary = staff.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .mapToDouble(Employee::getSalary)
            .sum();
        System.out.printf("Tong luong phong IT: %.0f VND\n", totalITSalary);

        // Dem so nhan vien IT
        long itCount = staff.stream()
            .filter(e -> e.getDepartment().equals("IT"))
            .count();
        System.out.println("So nhan vien IT: " + itCount);

        // Tim nhan vien luong cao nhat
        Optional<Employee> maxSalary = staff.stream()
            .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()));

        maxSalary.ifPresent(e ->
            System.out.println("Nhan vien luong cao nhat: " + e)
        );
    }
}
