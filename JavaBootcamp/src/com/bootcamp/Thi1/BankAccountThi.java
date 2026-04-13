package com.bootcamp.Thi1;

public class BankAccountThi {

    private String accountNumber;
    private String ownerName;
    private double balance;

    private static int totalCreated = 0;
    static final String APP_NAME = "NGAN HANG DICH VU";

    public BankAccountThi(String accNum, String name, double initialBalance) {
        this.accountNumber = accNum;
        this.ownerName = name;
        
        if (initialBalance < 0 ) {
            System.out.println("So du ban dau khong duoc am. Da set ve 0.");
            this.balance = 0;
        } else {
            this.balance = initialBalance;
        }
        totalCreated++;
        System.out.println("Da tao moi.Tong so object: " + totalCreated);
    }

    public void deposit (double amount){
        if (amount<0) {
            System.out.println("So tien nap phai lon hon 0!");
            return;
        }
        this.balance += amount;
        System.out.println("Da nap " + amount + " VND vao TK" + accountNumber);
        System.out.println("So du hien tai: " + this.balance + " VND");
    }
     public static int getTotalCreated(){
        return totalCreated;
    }
    public void withdraw (double amount){
         if (amount<=0) {
            System.out.println("So tien rut phai lon hon 0!");
            return;
        }

        if (amount > this.balance) {
            System.out.println("So du khong du!");
            System.out.println("So du hien co: " + this.balance + " VND");
            return;
        }

        this.balance -= amount;
        System.out.println("Da rut " + amount + " VND");
        System.out.println("So du con lai: " + this.balance + " VND");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public double getBalance() {
        return balance;
    }

    public void display() {
        System.out.println("\n=== Thong tin tai khoan ===");
        System.out.println("So TK: " + accountNumber);
        System.out.println("Chu TK: " + ownerName);
        System.out.printf("So du: %.2f VND\n", balance);
        System.out.println("===========================\n");
    }
    
}

