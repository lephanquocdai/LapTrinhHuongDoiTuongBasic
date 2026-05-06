package com.bootcamp.lab3.Lab32;

public class Worker extends Employee {
    private int hoursWorked;
    private static final double HOURLY_RATE = 50000;

    public Worker(String name, String id, int hoursWorked) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        //TODO Auto-generated constructor stub
    }

    @Override
    public double calculateSalary() {
        // TODO Auto-generated method stub
        return hoursWorked * HOURLY_RATE;
    }

    public int getHoursWorked() {
        return hoursWorked;
    } 
}
