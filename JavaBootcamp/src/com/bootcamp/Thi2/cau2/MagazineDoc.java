package com.bootcamp.Thi2.cau2;

public class MagazineDoc extends BorrowableDoc {
    private static final double BCD = 1000;

    public MagazineDoc(String title, String code) {
        super(title, code);
        //TODO Auto-generated constructor stub
    }

    @Override
    public double getBorrowFee(int days) {
        // TODO Auto-generated method stub
        return BCD * days;
    }
    
}
