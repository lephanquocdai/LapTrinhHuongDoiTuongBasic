package com.bootcamp.lab3.Lab34;

public class ShapeTest {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];

        shapes[0] = new Circle("Red", 5.0);
        shapes[1] = new Rectangle("Green", 4.0, 6.0);
        shapes[2] = new Circle("Yellow", 3.0);

        double totalArea = 0;
        for (Shape shape : shapes) {
            shape.displayInfo();
            totalArea += shape.calculateArea();
        }

        System.out.printf("Tong dien tich: %.2f\n", totalArea);
    }
}
