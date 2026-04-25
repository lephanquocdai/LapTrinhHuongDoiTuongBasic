package com.bootcamp.Thi2.cau1;

public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void  makeSound(){
        System.out.println(name + "phat ra mot am thanh la...");
    }

    public void eat(){
        System.out.println(name + "dang an...");
    }

    public void displayInfo(){
        System.out.println("Dong vat: " + name);
    }
}
