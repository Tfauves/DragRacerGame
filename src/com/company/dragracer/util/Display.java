package com.company.dragracer.util;

public class Display {
    private static final String[] TITLE = new String[] {
            "-----------------------------------------------------------------",
            "                         Drag Racer",
            "-----------------------------------------------------------------"
    };

    public static void displayVehicleTitle() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Vehicle");
        System.out.println("-----------------------------------------------------------------");
    }

    public static void displayEngineTitle() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Engine");
        System.out.println("-----------------------------------------------------------------");
    }


    public static void displayWelcome(String[] title ) {
        for (String words : title) {
        System.out.println("\n" + words);
        }
    }

    public static void titleScreen() {
            displayWelcome(TITLE);
    }

}