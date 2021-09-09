package com.company.dragracer.util;

import com.company.dragracer.enviroments.Garage;

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

    public static void displayTrackTitle() {
        System.out.println("-----------------------------------------------------------------");
        System.out.println("                         Tracks");
        System.out.println("-----------------------------------------------------------------");
    }


    public static void displayWelcome(String[] title ) {
        for (String words : title) {
        System.out.println(words);
        }
        startBtn();
    }

    public static void titleScreen() {
            displayWelcome(TITLE);
    }

    public static void spaces() {
        int spaceCounter = 0;
        while (spaceCounter < 33) {
            System.out.println();
            spaceCounter++;
        }
    }

    public static void startBtn() {
        System.out.println("(e) to enter:");
        String userInput = Garage.scanner.next();
        if (userInput.equals("e")) {
            System.out.println("Build your Vehicle");

        }
    }
}