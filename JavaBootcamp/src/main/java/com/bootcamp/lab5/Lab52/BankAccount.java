package com.bootcamp.lab5.Lab52;


/**
 * BankAccount class - Quản lý tài khoản ngân hàng
 * Sử dụng custom exception khi số dư không đủ
 */
public class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("So du ban dau khong duoc am");
        }
        this.balance = balance;
    }

    /**
     * Phương thức nội bộ để trừ tiền (kiểm tra logic và trừ balance)
     */
    private void debit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("So tien phai duong");
        }
        if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        }
        this.balance -= amount;
    }

    public void withdraw(double amount) {
        debit(amount);
        System.out.println("Da rut " + amount + " VND. So du con: " + balance);
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("Tien nap phai duong");
        }
        this.balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    /**
     * Tính tiền lãi dựa trên lãi suất năm
     * @param annualRate Lãi suất năm (ví dụ: 5.0 cho 5%)
     * @return Số tiền lãi
     */
    public double calculateInterest(double annualRate) {
        if (annualRate < 0) {
            throw new IllegalArgumentException("Lai suat khong duoc am");
        }
        return balance * (annualRate / 100);
    }

    /**
     * Cộng tiền lãi vào số dư
     * @param annualRate Lãi suất năm
     */
    public void applyInterest(double annualRate) {
        double interest = calculateInterest(annualRate);
        this.balance += interest;
        System.out.println("Da cong lai: " + interest + " VND. So du moi: " + balance);
    }

    /**
     * Chuyển tiền sang tài khoản khác
     * @param destination Tài khoản nhận
     * @param amount Số tiền chuyển
     */
    public void transfer(BankAccount destination, double amount) {
        if (destination == null) {
            throw new IllegalArgumentException("Tai khoan dich khong hop le");
        }
        if (destination == this) {
            throw new IllegalArgumentException("Khong the tu chuyen cho chinh minh");
        }
        
        // Su dung debit de tru tien ma khong in "Da rut"
        this.debit(amount);
        
        // Nap vao tai khoan kia
        destination.deposit(amount);
        
        System.out.println("Da chuyen " + amount + " VND sang tai khoan khac. So du con: " + balance);
    }
}
