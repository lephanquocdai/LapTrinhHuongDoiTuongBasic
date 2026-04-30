package com.bootcamp.Thi2.cau2;

public class MagazineDoc extends BorrowableDoc {
    private static final double MAGAZINE_FEE_PER_DAY = 1000;

    public MagazineDoc(String title, String code) {
        super(title, code);
    }

    @Override
    public double getBorrowFee(int days) {
        return MAGAZINE_FEE_PER_DAY * days;
    }
    
}
