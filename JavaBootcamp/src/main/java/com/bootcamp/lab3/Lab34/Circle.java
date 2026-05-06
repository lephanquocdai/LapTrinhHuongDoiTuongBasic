package com.bootcamp.lab3.Lab34;

public class Circle extends Shape {
    private  double radius;
    private static final double PI = 3.14159;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return PI * radius * radius;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 2 * PI * radius;
    }
    public double getRadius() {
        return radius;
    }
}
