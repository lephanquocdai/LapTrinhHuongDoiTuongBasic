package com.bootcamp.Thi2.cau1;

public class ZooApp {
    public static void main(String[] args) {
        System.out.println("======Vuon thu======");

        Animal[] zoo = new Animal[4];

        zoo[0] = new Dog("Lulu", "Golden Retriever");
        zoo[1] = new Cat("Mimi");
        zoo[2] = new Dog("Kiki", "Hugky");
        zoo[3] = new Cat("Layla");

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
