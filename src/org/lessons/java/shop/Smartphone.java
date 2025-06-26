package org.lessons.java.shop;

import java.math.BigDecimal;

public class Smartphone extends Prodotto {
    private String imei;
    private int memory;

    public Smartphone(String name, String brand, BigDecimal price, BigDecimal iva, String imei, int memory) {
        super(name, brand, price, iva);
        this.imei = imei;
        this.memory = memory;
    }

    public String getImei() {
        return this.imei;
    }

    public void setImei(String imei) {
        this.imei = imei;
    }

    public int getMemory() {
        return this.memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }
}
