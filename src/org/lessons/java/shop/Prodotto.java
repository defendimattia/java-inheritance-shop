package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Random;

public class Prodotto {
    private int code;
    private String name;
    private String brand;
    private BigDecimal price;
    private BigDecimal iva;

    public Prodotto(String name, String brand, BigDecimal price, BigDecimal iva) {

        Random randomNum = new Random();

        this.code = randomNum.nextInt(1000000);
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.iva = iva;

    }

    public int getCode() {
        return this.code;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    protected String getBrand() {
        return this.brand;
    }

    public void setBrand(String newBrand) {
        this.brand = newBrand;
    }

    public BigDecimal getPrice() {
        return this.price;
    }

    public void setPrice(BigDecimal newPrice) {
        this.price = newPrice;
    }

    public BigDecimal getIva() {
        return this.iva;
    }

    public void setIva(BigDecimal newIva) {
        this.iva = newIva;
    }


}
