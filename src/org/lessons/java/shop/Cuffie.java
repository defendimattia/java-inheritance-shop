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

}
