package com.bootcamp.lab3.Lab34;

public class Rectangle extends Shape{
    private double width;
    private double height;

    public Rectangle(String color, double width, double height) {
        super(color);
        this.width = width;
        this.height = height;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculateArea() {
        // TODO Auto-generated method stub
        return width * height;
    }

    @Override
    public double calculatePerimeter() {
        // TODO Auto-generated method stub
        return 2 * (width + height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
    
}
