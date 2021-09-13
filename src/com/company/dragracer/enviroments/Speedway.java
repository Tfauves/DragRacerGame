package com.company.dragracer.enviroments;

import com.company.dragracer.util.Color;
import com.company.dragracer.util.Display;
import com.company.dragracer.util.UI;
import com.company.dragracer.vehicles.Vehicle;

public class Speedway {
    private final static String SELECT_TRACK_PROMPT = "Select A Track";
    private final static String MENU_PROMPT = "Make your Selection";
    Track newTrack;
    private final String[] TRACK_LIST = new String[]{
            "1. | Difficulty: Noob | Distance to finish: 200 meters | Hazard: Gravel Patch |",
            "2. | Difficulty: Beginner | Distance to finish: 400 meters | Hazard: Watery Lake |",
            "3. | Difficulty: Seasoned | Distance to finish: 600 meters | Hazard: Flaming Wall Of Hay |",
            "4. | Difficulty: Pro | Distance to finish: 800 meters | Hazard: Super Hard Brick Wall |",
            "5. | Exit |"
    };

    public void displayTrackOptions(String prompt, String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public void selectTrack() {
        boolean isActive = true;
        while (isActive) {
            Display.displayTrackTitle();
            displayTrackOptions(MENU_PROMPT, TRACK_LIST);
            int choice = getInt(1, 5, SELECT_TRACK_PROMPT);
            if (choice == 5) {
                System.exit(0);
            }
            handleMenuSelection(choice);
            isActive = false;
        }
    }

    public static int getInt(int min, int max, String prompt) {
        int option = min - 1;
        do {
            System.out.println(prompt);
            String input = UI.scanner.nextLine();
            try {
                option = Integer.parseInt(input);
            } catch (NumberFormatException err) {
                System.out.println("Invalid Selection...");
            }
        } while (option < min || option > max);
        return option;
    }

    public void handleMenuSelection(int choice) {
        switch (choice) {
            case 1 -> newTrack = new Track("Noob", 200, new Hazard("Gravel Patch", 75, 1));
            case 2 -> newTrack = new Track("Beginner", 400, new Hazard("Watery Lake", 50, 4));
            case 3 -> newTrack = new Track("Seasoned", 400, new Hazard("Flaming Wall Of Hay", 25, 6));
            case 4 -> newTrack = new Track("Pro", 800, new Hazard("Super Hard Brick Wall", 10,10));
            default -> {
                System.out.println("error...");
                newTrack = null;
            }
        }
        Display.spaces();
        System.out.println(newTrack.toString());
    }

    public void racePrompt(Vehicle playerVehicle) {
        boolean isRaceStarted = false;
        do {
        System.out.println("Press" + Color.GREEN + " (s) " +  Color.RESET + "to start your engine and begin race.");
            String userInput = UI.scanner.next();
            if (userInput.equals("s")) {
                playerVehicle.start();
                isRaceStarted = true;
                playerVehicle.setDistanceToFinish(newTrack.length);
            } else {
                System.out.println("Please start your vehicle to begin driving.");
            }
        } while(!isRaceStarted);
    }

    public void race(Vehicle playerVehicle) {
        racePrompt(playerVehicle);
        boolean isActive = true;
        String userInput;
        while (isActive) {
            if (playerVehicle.getEngine().getIsOperating()) {
                System.out.println("SELECT\n(a) to accelerate,\n(b) to brake,\n(c) to coast,\n(s) to stop short,\n(q) end race and to return to garage");
                userInput = UI.scanner.next();
                switch (userInput) {
                    case "a" -> playerVehicle.accelerate();
                    case "b" -> playerVehicle.brake();
                    case "c" -> playerVehicle.coast();
                    case "s" -> playerVehicle.stop();
                    case "q" -> {
                        System.out.println("The race is over...heading back to garage");
                        playerVehicle.displayDash();
                        isActive = false;
                    }
                    default -> System.out.println("Not Valid");
                }

            }
        finishLine(playerVehicle);
        }
    }

    public void finishLine(Vehicle playerVehicle) {
        goodStop(playerVehicle);
        shortOfFinish(playerVehicle);
        hazardCollision(playerVehicle);
        perfectStop(playerVehicle);
    }

    public void hazardCollision(Vehicle playerVehicle) {
        int finishDiff = playerVehicle.getDistanceTraveled() - playerVehicle.getDistanceToFinish();
        if (finishDiff >= newTrack.hazard.getDistanceFromFinish()) {
            System.out.println("Bruh!! You failed to stop and hit something... No points!! ");
            System.exit(0);
        }
    }

    public void shortOfFinish(Vehicle playerVehicle) {
        if (playerVehicle.getDistanceTraveled() < playerVehicle.getDistanceToFinish() && playerVehicle.getSpeedometer() == 0) {
            System.out.println("You are not at the finish line yet, don't stop...\nIf you wish to quit quitter use the (q) for exit command.");
        }
    }

    public void goodStop(Vehicle playerVehicle) {
        if (playerVehicle.getDistanceTraveled() > playerVehicle.getDistanceToFinish() && playerVehicle.getSpeedometer() == 0) {
            System.out.println("Not a bad stop\n20pts awarded");
            System.out.println("Your race results: Distance of Race: " + playerVehicle.getDistanceToFinish() + "m Distance Traveled: " + playerVehicle.getDistanceTraveled() + "m Time: " + playerVehicle.getTime() + "s Points: ");

            System.exit(0);
        }
    }

    public void perfectStop(Vehicle playerVehicle) {
        if (playerVehicle.getDistanceToFinish() == playerVehicle.getDistanceTraveled() && playerVehicle.getSpeedometer() == 0) {
            System.out.println("Perfect Stop\n50pts awarded.");
            System.out.println("Your race results: Distance of Race: " + playerVehicle.getDistanceToFinish() + "m Distance Traveled: " + playerVehicle.getDistanceTraveled() + "m Time: " + playerVehicle.getTime() + "s Points: ");
            System.exit(0);
        }
    }

}

