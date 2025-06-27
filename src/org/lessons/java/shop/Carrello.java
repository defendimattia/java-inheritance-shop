package org.lessons.java.shop;

import java.math.BigDecimal;
import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] cart;
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

            if ("smartphone".equalsIgnoreCase(productType)) {
                System.out.println("Inserire IMEI dello smartphone");
                String smartphoneIMEI = scanner.nextLine();
                System.out.println("Inserire GB dello smartphone");
                int smartphoneGB = scanner.nextInt();
                scanner.nextLine();

                Smartphone product = new Smartphone(productName, productBrand, productPrice, new BigDecimal("0.22"),
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

                Televisori product = new Televisori(productName, productBrand, productPrice, new BigDecimal("0.22"),
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

                Cuffie product = new Cuffie(productName, productBrand, productPrice, new BigDecimal("0.22"),
                        headphonesColor, headphonesIsWireless);

            }

            System.out.println("Inserire un altro prodotto? (si/no)");
            String newProduct = scanner.nextLine();

            if ("no".equalsIgnoreCase(newProduct)) {
                running = false;
            }
        }
        scanner.close();
    }
}
