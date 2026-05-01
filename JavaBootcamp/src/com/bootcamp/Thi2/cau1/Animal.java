package com.bootcamp.Thi2.cau1;

public class Animal {
    private static final String SOUND_MESSAGE = " phat ra mot am thanh la...";
    private static final String EATING_MESSAGE = " dang an...";
    private static final String ANIMAL_INFO = "Dong vat: ";

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + SOUND_MESSAGE);
    }

    public void eat() {
        System.out.println(name + EATING_MESSAGE);
    }

    public void displayInfo() {
        System.out.println(ANIMAL_INFO + name);
    }
}
