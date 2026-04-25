package com.bootcamp.Thi2.cau2;

public class BookDoc extends BorrowableDoc {

    private static final double ABC = 3000;
    
    public BookDoc(String title, String code) {
        super(title, code);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getBorrowFee(int days) {
        // TODO Auto-generated method stub
        return ABC * days;
    }
    
}
