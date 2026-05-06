package com.bootcamp.lab2;
 
public class BankApp  {
    public static void main(String[] args) {
        System.out.println("=== Chuong trinh quan ly ngan hang ===\n");

        BankAccount acc1 = new BankAccount("TK001", "Nguyen Van A", 1000000);
        BankAccount acc2 = new BankAccount("TK002", "Tran Thi B", 500000);

        System.out.println("--- Giao dich TK001 ---");
        acc1.deposit(500000);
        acc1.withdraw(200000);
        acc1.withdraw(2000000); 
        acc1.display();

        System.out.println("--- Giao dich TK002 ---");
        acc2.deposit(300000);
        acc2.display();

        System.out.println("So du TK001: " + acc1.getBalance() + " VND");
        System.out.println("So du TK002: " + acc2.getBalance() + " VND");
        }

}
