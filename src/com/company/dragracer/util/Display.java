package com.company.dragracer.util;

import com.company.dragracer.enviroments.Garage;

public class Display {
    private static final String WELCOME_PROMPT = "             Welcome To Drag Racer\n-------------------------------------------------------";

    private static String[] welcomeMenu = new String[] {
        "Press e to enter your garage.\nPress q to quit."
    };

    public static void displayWelcome(String prompt, String [] welcomeMenu) {
        System.out.println("\n" + prompt);
        for (String option : welcomeMenu) {
            System.out.println("\n" + option);
        }
    }

    public static void titleScreen() {
        boolean isaActive = true;
        while (isaActive) {
            displayWelcome(WELCOME_PROMPT, welcomeMenu);
            String userInput = Garage.scanner.next();
            Garage.scanner.nextLine();
            if (userInput.equals("e")) {
                System.out.println("Build your car");
                isaActive = false;
            } else if (userInput.equals("q")) {
                System.exit(0);
            }
        }
    }

}