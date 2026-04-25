package com.bootcamp.Thi2.cau1;

public class Cat extends Animal{

    public Cat(String name) {
        super(name);
        //TODO Auto-generated constructor stub
    }
    
    @Override
    public void makeSound(){
        System.out.println(name + " meow meow!");
    }

    public void scratch(){
        System.out.println(name + " dang cao cao...");
    }
}

