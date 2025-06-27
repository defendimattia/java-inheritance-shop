package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int inches;
    private boolean isSmart;

    public Televisori(String name, String brand, BigDecimal price, BigDecimal iva, int inches,
            boolean isSmart) {
        super(name, brand, price, iva);
        this.inches = inches;
        this.isSmart = isSmart;
    }

    public int getInches() {
        return this.inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public boolean isSmart() {
        return this.isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
}
