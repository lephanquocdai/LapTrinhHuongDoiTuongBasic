package com.bootcamp.lab2;

public class Product {
    private String id;
    private String name;
    private double price;
    private int quantity;
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public double getPrice() {
        return price;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setId(String id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    public Product(String id, String name, double price, int quantity) {
        this.id = id;
        if (name == null || name.trim().isEmpty()) {
            System.out.println("Ten khong duoc rong. Da set mac dinh = Unknown");
            this.name = "Unknown";
        } else {
            this.name = name;
        }
        if (price < 0) {
            System.out.println("Gia phai lon hon hoac bang 0. Da set ve 0");
            this.price = 0;
        } else {
            this.price = price;
        }
        if (quantity < 0) {
            System.out.println("So luong phai lon hon hoac bang 0. Da set ve 0");
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        } 
    }

    public double getTotalValue(){
        return price * quantity;
    }

    public void DisplayInfo(){
        System.out.println("======Thong tin san pham=======");
        System.out.println("Id: " + id);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
        System.out.println("Tong gia tri: " + getTotalValue());;
    }
}
