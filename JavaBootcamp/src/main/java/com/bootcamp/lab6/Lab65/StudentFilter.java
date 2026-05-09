package com.bootcamp.lab6.Lab65;

import java.util.*;
import java.util.stream.Collectors;

class Student {
    private String name;
    private double gpa;

    public Student(String name, double gpa) {
        this.name = name;
        this.gpa = gpa;
    }

    public String getName() { return name; }
    public double getGpa() { return gpa; }

    @Override
    public String toString() {
        return name + " - GPA: " + gpa;
    }
}

public class StudentFilter {
    public static void main(String[] args) {
        List<Student> students = Arrays.asList(
            new Student("Nguyen Van A", 3.8),
            new Student("Tran Thi B", 3.2),
            new Student("Le Van C", 3.9),
            new Student("Pham Thi D", 3.6),
            new Student("Hoang Van E", 3.4),
            new Student("Vu Thi F", 3.7),
            new Student("Do Van G", 3.5)
        );

        List<Student> topStudents = students.stream()
            .filter(s -> s.getGpa() >= 3.5)
            .sorted((s1, s2) -> Double.compare(s2.getGpa(), s1.getGpa()))
            .limit(5)
            .collect(Collectors.toList());

        System.out.println("=== TOP 5 SINH VIEN (GPA >= 3.5) ===\n");
        topStudents.forEach(System.out::println);
    }
}
