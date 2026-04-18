package com.bootcamp.lab3.Lab31;

public class ZooApp {
    public static void main(String[] args) {
        System.out.println("======Vuon thu on ao======");

        Animal[] zoo = new Animal[3];

        zoo[0] = new Dog("Lulu", "Golden Retriever");
        zoo[1] = new Cat("Mimi");
        zoo[2] = new Dog("Kiki", "Hugky");

        System.out.println("=====Gio an den roi!=====\n");

        for (Animal animal : zoo) {
            animal.makeSound();
        }

        System.out.println("\n=====Chi tiet tung dong vat=====\n");

        for (Animal animal : zoo) {
            animal.displayInfo();
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.fecht();
            } else {
                Cat cat = (Cat) animal;
                cat.scratch();
            }
            System.out.println();
        }
    }
}
