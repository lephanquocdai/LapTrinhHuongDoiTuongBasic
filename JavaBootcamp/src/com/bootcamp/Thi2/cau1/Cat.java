package com.bootcamp.Thi2.cau1;

public class Cat extends Animal {
    private static final String CAT_SOUND = "meow meow!";
    private static final String SCRATCH_MESSAGE = " dang cao cao...";

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " " + CAT_SOUND);
    }

    public void scratch() {
        System.out.println(name + SCRATCH_MESSAGE);
    }
}

