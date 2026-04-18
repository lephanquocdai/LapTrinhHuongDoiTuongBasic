package com.bootcamp.lab3.Lab35;

public abstract class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " phat ra am thanh...");
    }

    public void eat() {
        System.out.println(name + " dang an...");
    }

    public void displayInfo() {
        System.out.println("Dong vat: " + name);
    }

    public abstract void performAction();
}