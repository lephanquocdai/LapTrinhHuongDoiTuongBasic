package com.bootcamp.lab3.Lab32;

public class Manager extends Employee{
    private static final double BASE_SALARY = 20000000;

    public Manager(String name, String id) {
        super(name, id);
        //TODO Auto-generated constructor stub
    }
    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        return BASE_SALARY;
    }
    
}
