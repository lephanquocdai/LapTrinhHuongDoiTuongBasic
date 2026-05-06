package com.bootcamp.lab2;

public class Student {
    private String name;
    private int age;
    private double gpa;

    private static int count = 0;
    static final String SCHOOL_NAME = "Dai hoc ABC";

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public double getGpa() {
        return gpa;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public Student(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
        if (gpa < 0 || gpa > 10) {
            System.out.println("GPA phai tu 0 den 10. Da set ve 0");
            this.age = 0;
        } else {
            this.gpa = gpa;
        }

        count++;
        System.out.println("Da tao sinh vien moi.Tong so: " + count);
    }
    
    public static int getTotalStudents(){
        return count;
    }

    public void DisplayInfo(){
        System.out.println("===Thong tin sinh vien===");
        System.out.println("Ten: " + name);
        System.out.println("Tuoi: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("Truong: " + SCHOOL_NAME);
        System.out.println("===============================\n");
    }
    
}
