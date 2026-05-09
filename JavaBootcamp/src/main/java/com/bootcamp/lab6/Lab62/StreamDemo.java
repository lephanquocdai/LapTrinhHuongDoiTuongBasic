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

        Scanner sc = new Scanner(System.in);
        System.out.println("=== PHAN TICH NHAN VIEN (DONG) ===\n");

        System.out.print("Nhap ten phong ban muon loc (vi du: IT, Sale, HR): ");
        String dept = sc.nextLine();

        System.out.print("Nhap muc luong toi thieu de xet: ");
        double threshold = sc.nextDouble();

        System.out.print("Nhap % tang luong (vi du: 10): ");
        double percent = sc.nextDouble();

        // Yeu cau: Loc theo phong, luong > threshold, tang luong percent%,
        // sap xep giam dan, lay top 3, in ten
        List<String> result = staff.stream()
            // Buoc 1: Loc (Filter) theo phong ban va luong
            .filter(e -> e.getDepartment().equalsIgnoreCase(dept))
            .filter(e -> e.getSalary() >= threshold)

            // Buoc 2: Bien doi (Map) - Tang luong theo % nhap vao
            .map(e -> {
                double newSalary = e.getSalary() * (1 + percent / 100);
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
        System.out.println("\nTop 3 nhan vien phong " + dept + " sau khi tang " + percent + "% luong:\n");
        if (result.isEmpty()) {
            System.out.println("Khong co nhan vien nao thoa man dieu kien.");
        } else {
            result.forEach(System.out::println);
        }

        // Thong ke khac
        System.out.println("\n=== THONG KE NHANH ===\n");

        // Tinh tong luong cua phong ban da chon
        double totalSalary = staff.stream()
            .filter(e -> e.getDepartment().equalsIgnoreCase(dept))
            .mapToDouble(Employee::getSalary)
            .sum();
        System.out.printf("Tong luong hien tai cua phong %s: %.0f VND\n", dept, totalSalary);

        // Tim nhan vien luong cao nhat trong toan cong ty
        staff.stream()
            .max((e1, e2) -> Double.compare(e1.getSalary(), e2.getSalary()))
            .ifPresent(e -> System.out.println("Nhan vien co thu nhap cao nhat hien tai: " + e));

        sc.close();
    }
}
