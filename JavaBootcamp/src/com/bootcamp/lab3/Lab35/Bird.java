package com.bootcamp.lab3.Lab35;

public class Bird extends Animal {

    public Bird(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Bird " + name + ": Tweet tweet!");
    }

    public void fly() {
        System.out.println(name + " dang bay...");
    }

    public void tweet() {
        System.out.println(name + " dang hot!");
    }

    @Override
    public void performAction() {
        tweet();
        fly();
    }
}