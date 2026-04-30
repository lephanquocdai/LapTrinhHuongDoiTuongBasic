package com.bootcamp.Thi2.cau1;

public class Dog extends Animal {

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }
    @Override
    public void makeSound() {
        System.out.println(name + " gau gau...");
    }

    public void fetch() {
        System.out.println(name + " dang nhat bong ve.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Giong: " + breed);
    }
}
