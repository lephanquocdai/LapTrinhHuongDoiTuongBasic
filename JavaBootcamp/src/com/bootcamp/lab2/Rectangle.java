package com.bootcamp.lab2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle(double width, double height) {
        if(width <= 0 || height <= 0){
            System.out.println("Chieu dai va chieu rong > 0. Da set ve 1");
            this.width = 1;
            this.height = 1;
        } else {
            this.width = width;
            this.height = height;
        }
    } 

    public Rectangle(){
        this(1,1);
    }  

    public double getArea(){
        return width * height;
    }

    public double getPerimeter(){
        return 2 * (width + height);
    }

    public void DisplayInfo(){
        System.out.println("===Hinh chu nhat===");
        System.out.printf("Chieu rong: %.2f\n", width);
        System.out.printf("Chieu dai: %.2f\n", height);
        System.out.printf("Dien tich: %.2f\n", getArea());
        System.out.printf("Chu vi: %.2f\n", getPerimeter());
        System.out.println("=====================\n");
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
