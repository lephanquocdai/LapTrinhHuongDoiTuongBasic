package com.bootcamp.lab3.Lab35;

public class ZooApp {

    public static void main(String[] args) {

        System.out.println("=== VUON THU ON AO ===\n");

        Animal[] zoo = {
                new Dog("LuLu", "Golden Retriever"),
                new Cat("MiMi"),
                new Dog("KiKi", "Husky"),
                new Bird("ChiChi")
        };

        System.out.println("=== GIO AN ===\n");

        for (Animal animal : zoo) {
            animal.makeSound();
            animal.eat();
            System.out.println();
        }

        System.out.println("=== HANH DONG ===\n");

        for (Animal animal : zoo) {
            animal.displayInfo();
            animal.performAction();
            System.out.println();
        }
    }
}