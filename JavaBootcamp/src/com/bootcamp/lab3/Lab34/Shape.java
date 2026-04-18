package com.bootcamp.lab3.Lab34;

public  abstract class Shape {
    protected String color;

    public Shape(String color) {
        this.color = color;
    }

    public abstract double calculateArea();
    public abstract double calculatePerimeter();

    public void displayInfo() {
        System.out.println("=== HINH HOC ===");
        System.out.println("Mau: " + color);
        System.out.printf("Dien tich: %.2f\n", calculateArea());
        System.out.printf("Chu vi: %.2f\n", calculatePerimeter());
        System.out.println("===============\n");
        }

    public String getColor() {
        return color;
    }
}
