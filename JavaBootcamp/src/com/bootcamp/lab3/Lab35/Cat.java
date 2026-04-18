package com.bootcamp.lab3.Lab35;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Cat " + name + ": Meow meow!");
    }

    public void scratch() {
        System.out.println(name + " dang cao...");
    }

    public void meow() {
        System.out.println(name + " keu meow!");
    }

    @Override
    public void performAction() {
        meow();
        scratch();
    }
}