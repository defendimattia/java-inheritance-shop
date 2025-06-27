package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] cart = new Prodotto[0];
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        while (running) {

            System.out.println("Che tipo ti prodotto vuoi inserire? (smartphone/televisori/cuffie)");

            String productType = scanner.nextLine();
            System.out.println("Inserire nome del prodotto");
            String productName = scanner.nextLine();
            System.out.println("Inserire brand del prodotto");
            String productBrand = scanner.nextLine();
            System.out.println("Inserire prezzo del prodotto");
            BigDecimal productPrice = scanner.nextBigDecimal();
            scanner.nextLine();

            Prodotto product = null;

            if ("smartphone".equalsIgnoreCase(productType)) {
                System.out.println("Inserire IMEI dello smartphone");
                String smartphoneIMEI = scanner.nextLine();
                System.out.println("Inserire GB dello smartphone");
                int smartphoneGB = scanner.nextInt();
                scanner.nextLine();

                product = new Smartphone(productName, productBrand, productPrice, new BigDecimal("0.22"),
                        smartphoneIMEI, smartphoneGB);

            } else if ("televisori".equalsIgnoreCase(productType)) {
                boolean televisionIsSmart = false;

                System.out.println("Inserire pollici del televisore");
                int televisionInches = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Il televisore è smart? (si/no)");
                String isSmartAnswer = scanner.nextLine();

                if ("si".equalsIgnoreCase(isSmartAnswer)) {
                    televisionIsSmart = true;
                }

                product = new Televisori(productName, productBrand, productPrice, new BigDecimal("0.22"),
                        televisionInches, televisionIsSmart);

            } else if ("cuffie".equalsIgnoreCase(productType)) {
                boolean headphonesIsWireless = false;

                System.out.println("Inserire colore delle cuffie");
                String headphonesColor = scanner.nextLine();
                System.out.println("Le cuffie sono wireless? (si/no)");
                String isWireless = scanner.nextLine();

                if ("si".equalsIgnoreCase(isWireless)) {
                    headphonesIsWireless = true;
                }

                product = new Cuffie(productName, productBrand, productPrice, new BigDecimal("0.22"),
                        headphonesColor, headphonesIsWireless);

            }

            if (product != null) {
                Prodotto[] newCart = new Prodotto[cart.length + 1];

                for (int i = 0; i < cart.length; i++) {
                    newCart[i] = cart[i];
                }

                newCart[cart.length] = product;

                cart = newCart;
            }

            System.out.println("Inserire un altro prodotto? (si/no)");
            String newProduct = scanner.nextLine();

            if ("no".equalsIgnoreCase(newProduct)) {
                running = false;
            }
        }

        boolean fidelityCard = false;
        System.out.println("Hai la carta fedeltà? (si/no)");
        String fidelityCardAnswer = scanner.nextLine();

        if ("si".equalsIgnoreCase(fidelityCardAnswer)) {
            fidelityCard = true;
        }
        scanner.close();

        System.out.format("Nel carrello hai %d oggetti.%n", cart.length);
        BigDecimal totalPrice = BigDecimal.ZERO;

        if (fidelityCard) {
            for (int i = 0; i < cart.length; i++) {
                cart[i].setDiscount();
                totalPrice = totalPrice.add(cart[i].getPrice());
            }
            System.out.format("Prezzo totale del carrello con sconto applicato carta fedeltà: %s €.%n", totalPrice);
        } else {
            for (int i = 0; i < cart.length; i++) {
                totalPrice = totalPrice.add(cart[i].getPrice());
            }
            System.out.format("Prezzo totale del carrello: %s €.%n", totalPrice);
        }

    }
}
