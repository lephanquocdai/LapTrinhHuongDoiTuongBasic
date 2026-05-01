package com.bootcamp.Thi2.cau1;

public class Dog extends Animal {
    private static final String DOG_SOUND = "gau gau...";
    private static final String FETCH_MESSAGE = " dang nhat bong ve.";
    private static final String BREED_LABEL = "Giong: ";

    private String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        System.out.println(name + " " + DOG_SOUND);
    }

    public void fetch() {
        System.out.println(name + FETCH_MESSAGE);
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println(BREED_LABEL + breed);
    }
}
