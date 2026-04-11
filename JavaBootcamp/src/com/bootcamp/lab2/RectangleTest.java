package com.bootcamp.lab2;

public class RectangleTest {
    public static void main(String[] args) {
        Rectangle rect1 = new Rectangle(5.0, 3.0);
        rect1.DisplayInfo();

        Rectangle rect2 = new Rectangle();
        rect2.DisplayInfo();

        Rectangle rect3 = new Rectangle(-5, 3);
        rect3.DisplayInfo();
    }
}
