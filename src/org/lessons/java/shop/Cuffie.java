package org.lessons.java.shop;

import java.math.BigDecimal;

public class Cuffie extends Prodotto {
    private String color;
    private boolean isWireless;

    public Cuffie(String name, String brand, BigDecimal price, BigDecimal iva, String color, boolean isWireless) {
        super(name, brand, price, iva);
        this.color = color;
        this.isWireless = isWireless;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isWireless() {
        return this.isWireless;
    }

    public void setWireless(boolean isWireless) {
        this.isWireless = isWireless;
    }

    @Override
    public void setDiscount() {
        if (!isWireless) {
            BigDecimal discount = new BigDecimal("0.07");
            this.price = price.subtract(price.multiply(discount));
        } else {
            super.setDiscount();
        }
    }
}
