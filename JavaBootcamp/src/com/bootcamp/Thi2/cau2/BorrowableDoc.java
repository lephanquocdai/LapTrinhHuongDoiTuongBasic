package com.bootcamp.Thi2.cau2;

public abstract class BorrowableDoc {

    protected String title;
    protected String code;

    public BorrowableDoc(String title, String code) {
        this.title = title;
        this.code = code;
    }

    public abstract double getBorrowFee(int days);

    public void display(){
        System.out.printf("Tieu de: %-15s | Code: %-10s | Borrow: %.0f VND\n", title, code, getBorrowFee(3));
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
}