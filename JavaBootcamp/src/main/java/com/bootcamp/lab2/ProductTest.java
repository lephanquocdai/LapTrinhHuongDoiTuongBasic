package com.bootcamp.lab2;

public class ProductTest {
    public static void main(String[] args) {
        Product pro1 = new Product("ST1", "", 12, 2);
        Product pro2 = new Product("ST2", "Orange", 7, 5);
        Product pro3 = new Product("ST3", "Flower", 3, 1);

        pro1.DisplayInfo();
        pro2.DisplayInfo();
        pro3.DisplayInfo();
    }
}
