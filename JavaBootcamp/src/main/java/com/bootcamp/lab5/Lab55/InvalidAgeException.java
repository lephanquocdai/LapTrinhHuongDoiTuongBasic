package com.bootcamp.lab5.Lab55;

/**
 * Custom Exception - InvalidAgeException
 * Duoc nem khi tuoi khong hop le (duoi 18 hoac tren 100).
 */
public class InvalidAgeException extends Exception {
    private int age;

    public InvalidAgeException(int age, String message) {
        super(message);
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}
