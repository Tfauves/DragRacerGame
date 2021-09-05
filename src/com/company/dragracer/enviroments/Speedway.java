package com.company.dragracer.enviroments;

import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.vehicles.Car;

import java.util.ArrayList;
import java.util.List;

public class Speedway {
    private final static String SELECT_TRACK_PROMPT = "Select A Track";
    private final static String MENU_PROMPT = "Make your selection";

    private final  String[] TRACK_LIST = new String[] {
            "1. | Difficulty: Noob | Distance to finish: 200 meters |",
            "2. | Difficulty: Beginner | Distance to finish: 400 meters |",
            "3. | Difficulty: Seasoned | Distance to finish: 600 meters |",
            "4. | Difficulty: Pro | Distance to finish: 800 meters |",
    };

    public void displayTrackOptions (String prompt, String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }


    public void start() {
        boolean isActive = true;
        while (isActive) {
            displayTrackOptions(MENU_PROMPT, TRACK_LIST);
            int choice = getInt(1, 3, SELECT_TRACK_PROMPT);
            if (choice == 3) {
                isActive = false;
                System.exit(0);
            }
            handleMenuSelection(choice);
            isActive = false;
        }
    }

    private void selectEngine() {
        displayOptions(SELECT_ENGINE_PROMPT, ENGINE_LIST);
        int choice = getInt(1, ENGINE_LIST.length, SELECT_ENGINE_PROMPT);
        CarEngine newEngine;
        switch (choice) {
            case 1 -> newEngine = new CarEngine(205, "V6 gas", false);
            case 2 -> newEngine =  new CarEngine(394, "in6 gas", false) ;
            default -> {
                System.out.println("error...");
                newEngine = null;
            }

        }
        playerCar.setEngine(newEngine);
    }

    public static int getInt(int min, int max, String prompt) {
        int option = min - 1;
        do {
            System.out.println(prompt);
            String input = scanner.nextLine();
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
            case 1 -> playerCar = new Car(null, 170,0, 0, 0, 0, "Subaru Impreza WRX");
            case 2 -> playerCar = new Car(null, 155,0, 0, 0, 0, "Volkswagen Golf/GTI");
            case 3 -> System.exit(0);
            default -> System.out.println("Invalid number received...");
        }
        selectEngine();
        System.out.println("Your car: " + playerCar);
    }




    public void displayTrack() {
        for (Track tracks : trackList) {
            System.out.println(tracks);
        }
    }
}
