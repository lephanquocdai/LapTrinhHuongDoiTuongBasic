package com.bootcamp.Thi2.cau2;

public class BookDoc extends BorrowableDoc {

    private static final double BOOK_FEE_PER_DAY = 3000;
    
    public BookDoc(String title, String code) {
        super(title, code);
    }

    @Override
    public double getBorrowFee(int days) {
        return BOOK_FEE_PER_DAY * days;
    }
    
}
