package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    protected int code;
    protected String name;
    protected String brand;
    protected BigDecimal price;
    protected BigDecimal iva;

    public Prodotto(String name, String brand, BigDecimal price, BigDecimal iva) {

        Random randomNum = new Random();

        this.code = randomNum.nextInt(1000000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;

    }
}
