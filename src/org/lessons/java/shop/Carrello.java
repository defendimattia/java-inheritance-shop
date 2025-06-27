package org.lessons.java.shop;

import java.util.Scanner;

public class Carrello {
    public static void main(String[] args) {
        Prodotto[] cart;
        boolean running = true;

        Scanner scanner = new Scanner(System.in);
        while (running) {

            System.out.println("Che tipo ti prodotto vuoi inserire? (smartphone/televisori/cuffie)");

            String product = scanner.nextLine();
            System.out.println("Inserire nome del prodotto");
            String productName = scanner.nextLine();
            System.out.println("Inserire brand del prodotto");
            String productBrand = scanner.nextLine();
            System.out.println("Inserire prezzo del prodotto");
            String productPrice = scanner.nextLine();

            if ("smartphone".equalsIgnoreCase(product)) {
                System.out.println("Inserire IMEI dello smartphone");
                String smartphoneIMEI = scanner.nextLine();
                System.out.println("Inserire GB dello smartphone");
                String smartphoneGB = scanner.nextLine();
            } else if ("televisori".equalsIgnoreCase(product)) {
                System.out.println("Inserire pollici del televisore");
                String televisionInches = scanner.nextLine();
                System.out.println("Il televisore è smart? (si/no)");
                String televisionIsSmart = scanner.nextLine();
            } else if ("cuffie".equalsIgnoreCase(product)) {
                System.out.println("Inserire colore delle cuffie");
                String headphonesColor = scanner.nextLine();
                System.out.println("Le cuffie sono wireless? (si/no)");
                String headphonesIsWireless = scanner.nextLine();
            }

            System.out.println("Inserire un altro prodotto? (si/no)");
            String newProduct = scanner.nextLine();

            if ("no".equalsIgnoreCase(newProduct)) {
                running = false;
            }
        }
    }
}
