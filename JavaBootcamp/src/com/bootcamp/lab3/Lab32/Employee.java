package com.bootcamp.lab3.Lab32;

public abstract class Employee {
    protected String name;
    protected String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double calculateSalary();

    public void display(){
        System.out.printf("NV: %-15s | ID: %-10s | Luong: %.0f VND\n", name, id, calculateSalary());
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    
}
