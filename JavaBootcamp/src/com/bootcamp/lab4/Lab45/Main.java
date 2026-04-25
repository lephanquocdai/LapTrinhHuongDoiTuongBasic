package com.bootcamp.lab4.Lab45;

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        Shape c = new Circle(5);
        Shape r = new Rectangle(4, 6);
        Shape t = new Triangle(3, 8);

        System.out.printf("Dien tich hinh tron: %.2f\n", calculator.calculateArea(c));
        System.out.println("Dien tich hinh chu nhat: " + calculator.calculateArea(r));
        System.out.println("Dien tich hinh tam giac: " + calculator.calculateArea(t));
    }
}