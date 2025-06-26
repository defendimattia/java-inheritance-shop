package org.lessons.java.shop;

import java.math.BigDecimal;

public class Televisori extends Prodotto {
    private int width;
    private int height;
    private boolean isSmart;

    public Televisori(String name, String brand, BigDecimal price, BigDecimal iva, int width, int height,
            boolean isSmart) {
        super(name, brand, price, iva);
        this.width = width;
        this.height = height;
        this.isSmart = isSmart;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isSmart() {
        return this.isSmart;
    }

    public void setSmart(boolean isSmart) {
        this.isSmart = isSmart;
    }
}
