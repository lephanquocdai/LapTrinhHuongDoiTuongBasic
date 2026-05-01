package com.bootcamp.Thi2.cau1;

public class ZooApp {
    private static final String HEADER = "======Vuon thu======";
    private static final String DETAILS_HEADER = "=====Chi tiet tung dong vat=====";
    private static final int ZOO_SIZE = 4;

    public static void main(String[] args) {
        Animal[] zoo = initializeZoo();
        playAllSounds(zoo);
        displayDetails(zoo);
    }

    private static Animal[] initializeZoo() {
        System.out.println(HEADER);
        Animal[] zoo = new Animal[ZOO_SIZE];
        zoo[0] = new Dog("Lulu", "Golden Retriever");
        zoo[1] = new Cat("Mimi");
        zoo[2] = new Dog("Kiki", "Hugky");
        zoo[3] = new Cat("Layla");
        return zoo;
    }

    private static void playAllSounds(Animal[] zoo) {
        for (Animal animal : zoo) {
            animal.makeSound();
        }
    }

    private static void displayDetails(Animal[] zoo) {
        System.out.println("\n" + DETAILS_HEADER + "\n");
        for (Animal animal : zoo) {
            displayAnimalDetails(animal);
            System.out.println();
        }
    }

    private static void displayAnimalDetails(Animal animal) {
        animal.displayInfo();
        if (animal instanceof Dog) {
            ((Dog) animal).fetch();
        } else if (animal instanceof Cat) {
            ((Cat) animal).scratch();
        }
    }
}
