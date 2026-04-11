package com.bootcamp.lab2;

public class StudentTest {
    public static void main(String[] args) {
        System.out.println("Truong: " + Student.SCHOOL_NAME);
        System.out.println("So sv hien tai: " + Student.getTotalStudents());

        Student sv1 = new Student("Nguyen Van A", 20, 8.5);
        Student sv2 = new Student("Tran Thi B", 21, 7.8);
        Student sv3 = new Student("Le Van C", 19, 9.2);

        System.out.println("Tong so sv: " + Student.getTotalStudents());

        sv1.DisplayInfo();
        sv2.DisplayInfo();
        sv3.DisplayInfo();
    }
}
