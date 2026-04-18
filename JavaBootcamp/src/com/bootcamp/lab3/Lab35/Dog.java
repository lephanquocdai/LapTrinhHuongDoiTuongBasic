package com.bootcamp.lab3.Lab35;

public class Dog extends Animal {
    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println("Dog " + name + ": Gau gau!");
    }

    public void fetch() {
        System.out.println(name + " dang nhat bong.");
    }

    public void bark() {
        System.out.println(name + " dang sua!");
    }

    @Override
    public void performAction() {
        bark();
        fetch();
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giong: " + breed);
    }
}