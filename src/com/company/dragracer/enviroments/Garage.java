package com.company.dragracer.enviroments;

import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.util.Display;
import com.company.dragracer.util.UI;
import com.company.dragracer.vehicles.Car;

public class Garage {
    private Car playerCar;
    private final static String SELECT_CAR_PROMPT = "Enter car selection";
    private final static String SELECT_ENGINE_PROMPT = "Enter engine selection";
    private final static String MENU_PROMPT = "Make your selection";
    private final String[] CAR_LIST = new String[] {
            "1. | Type: Subaru Impreza WRX | Max Speed: 170 mps |",
            "2. | Type: Volkswagen Golf/GTI | Max Speed: 155 mps |",
            "3. | Quit |"
    };

    private final static String[] ENGINE_LIST = new String[] {
            "1. | Type: V6 gas | Horse Power: 205 |",
            "2. | Type: I6 gas | Horse Power: 394 |",
            "3. | Quit |"
    };

    public void displayOptions (String prompt, String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public void selectCar() {
//        Display.titleScreen();
        boolean isActive = true;
        while (isActive) {
            Display.displayVehicleTitle();
            displayOptions(MENU_PROMPT, CAR_LIST);
            int choice = getInt(1, 3, SELECT_CAR_PROMPT);
            if (choice == 3) {
                System.exit(0);
            }
            handleMenuSelection(choice);
            isActive = false;
        }
    }

    private void selectEngine() {
        boolean isVaildSelection = false;
        while(!isVaildSelection) {
            Display.displayEngineTitle();
            displayOptions(SELECT_ENGINE_PROMPT, ENGINE_LIST);
            int choice = getInt(1, ENGINE_LIST.length, SELECT_ENGINE_PROMPT);
            CarEngine newEngine;
            switch (choice) {
                case 1 -> {
                    newEngine = new CarEngine(205, "V6 gas", false);
                    isVaildSelection = true;
                }
                case 2 -> {
                    newEngine = new CarEngine(394, "in6 gas", false);
                    isVaildSelection = true;
                }
                default -> {
                    System.out.println("error...");
                    newEngine = null;
                }
            }
            playerCar.setEngine(newEngine);
            System.out.println();
        }
    }

    public static int getInt(int min, int max, String prompt) {
        int option = min - 1;
        do {
            System.out.println(prompt);
            String input = UI.scanner.nextLine();
            try{
                option = Integer.parseInt(input);
            } catch (NumberFormatException err) {
                System.out.println("Invalid Selection...");
            }
        } while (option < min || option > max);
        return option;
    }

    public void handleMenuSelection(int choice) {
        switch (choice) {
            case 1 -> playerCar = new Car(null, 75,0, 0, 0, 0, "Subaru Impreza WRX");
            case 2 -> playerCar = new Car(null, 69,0, 0, 0, 0, "Volkswagen Golf/GTI");
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid number received...");
        }
        Display.spaces();
        selectEngine();
        Display.spaces();
        System.out.println("| Your car |" + playerCar);
        System.out.println();
    }

    public Car getPlayerCar() {
        return playerCar;
    }
}
