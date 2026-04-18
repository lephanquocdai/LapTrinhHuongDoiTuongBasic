package com.bootcamp.lab3.Lab32;

public class PayrollApp {
    public static void main(String[] args) {
        System.out.println("=====Bang luong nhan vien=====");

        Employee[] employees = new Employee[4];

        employees[0] = new Manager("Nguyen Van A", "M001");
        employees[1] = new Worker("Tran Thi B", "W001", 160);
        employees[2] = new Manager("Le Van C", "M002");
        employees[3] = new Worker("Pham Thi D", "W002", 200);

        double totalSalary = 0;
        for (Employee employee : employees) {
            employee.display();
            totalSalary += employee.calculateSalary();
        } 
        System.out.println("\n=====Tong luong====="); 
        System.out.printf("Tong luong: %.0f VND\n" , totalSalary); 
    }
}
