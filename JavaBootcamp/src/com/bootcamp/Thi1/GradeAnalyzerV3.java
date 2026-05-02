package com.bootcamp.Thi1;

import java.util.Scanner;

public class GradeAnalyzerV3 {
    private static final int MIN_GRADE = 0;
    private static final int MAX_GRADE = 10;
    private static final int PASSING_GRADE = 5;
    private static final String PASSING = "Dau";
    private static final String FAILING = "Rot";
    private static final String DECIMAL_FORMAT = "%.1f";
    private static final String PERCENTAGE_FORMAT = "%.1f%%";

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            analyzeGrades(scanner);
        } finally {
            scanner.close();
        }
    }

    private static void analyzeGrades(Scanner scanner) {
        System.out.print("Lop co bao nhieu sinh vien? ");
        int studentCount = scanner.nextInt();

        double[] grades = inputGrades(scanner, studentCount);
        displayRanking(grades);
        displayStatistics(grades);
    }

    private static double[] inputGrades(Scanner scanner, int studentCount) {
        double[] grades = new double[studentCount];
        System.out.println("===Nhap diem===");

        for (int i = 0; i < studentCount; i++) {
            grades[i] = inputValidGrade(scanner, i + 1);
        }
        return grades;
    }

    private static double inputValidGrade(Scanner scanner, int studentNumber) {
        double grade;
        do {
            System.out.printf("Nhap diem SV thu %d (0-10): ", studentNumber);
            grade = scanner.nextDouble();
            if (!isValidGrade(grade)) {
                System.out.println("Diem phai tu 0 den 10. Moi nhap lai!");
            }
        } while (!isValidGrade(grade));
        return grade;
    }

    private static boolean isValidGrade(double grade) {
        return grade >= MIN_GRADE && grade <= MAX_GRADE;
    }

    private static void displayRanking(double[] grades) {
        System.out.println("===Bang xep hang===");
        for (int i = 0; i < grades.length; i++) {
            String status = getStatus(grades[i]);
            System.out.printf("SV thu %d  " + DECIMAL_FORMAT + " -> %s\n",
                            (i + 1), grades[i], status);
        }
    }

    private static String getStatus(double grade) {
        return grade >= PASSING_GRADE ? PASSING : FAILING;
    }

    private static void displayStatistics(double[] grades) {
        double total = 0;
        double maxGrade = grades[0];
        double minGrade = grades[0];
        int passingCount = 0;

        for (double grade : grades) {
            total += grade;
            maxGrade = Math.max(maxGrade, grade);
            minGrade = Math.min(minGrade, grade);
            if (grade >= PASSING_GRADE) {
                passingCount++;
            }
        }

        double average = total / grades.length;
        double passingPercentage = (double) passingCount / grades.length * 100;
        double failingPercentage = 100 - passingPercentage;

        System.out.println("--------------------");
        System.out.printf("CAO NHAT: " + DECIMAL_FORMAT + "\n", maxGrade);
        System.out.printf("THAP NHAT: " + DECIMAL_FORMAT + "\n", minGrade);
        System.out.printf("TRUNG BINH: " + DECIMAL_FORMAT + "\n", average);
        System.out.printf("TI LE DAU: " + PERCENTAGE_FORMAT + "\n", passingPercentage);
        System.out.printf("TI LE ROT: " + PERCENTAGE_FORMAT + "\n", failingPercentage);
    }
}
