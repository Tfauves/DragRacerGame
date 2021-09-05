package com.company.dragracer.enviroments;

import com.company.dragracer.vehicles.Vehicle;

public class Speedway {
    private final static String SELECT_TRACK_PROMPT = "Select A Track";
    private final static String MENU_PROMPT = "Make your selection";
    Track newTrack;

    private final String[] TRACK_LIST = new String[]{
            "1. | Difficulty: Noob | Distance to finish: 200 meters | Hazard: None |",
            "2. | Difficulty: Beginner | Distance to finish: 400 meters | Hazard: Watery Lake |",
            "3. | Difficulty: Seasoned | Distance to finish: 600 meters | Hazard: Flaming Wall Of Hay",
            "4. | Difficulty: Pro | Distance to finish: 800 meters | Hazard: Super Hard Brick Wall",
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
            String input = Garage.scanner.nextLine();
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
            case 1 -> newTrack = new Track("Noob", 200, null);
            case 2 -> newTrack = new Track("Beginner", 400, null);
            case 3 -> newTrack = new Track("Seasoned", 400, null);
            case 4 -> newTrack = new Track("Pro", 800, null);
            default -> {
                System.out.println("error...");
                newTrack = null;
            }
        }
        System.out.println(newTrack.toString());
    }

    public void race(Vehicle playerVehicle) {
        boolean isActive = true;
        System.out.println("Press (s) to start your engine");
        String userInput = Garage.scanner.next();
        // TODO: 9/5/2021 error checking 
        if (userInput.equals("s")) {
            playerVehicle.start();
            playerVehicle.setDistanceToFinish(newTrack.length);
        } else {
            System.out.println("Please start your vehicle to begin driving.");
        }
        while (isActive) {
            if (playerVehicle.getEngine().getIsOperating()) {
                System.out.println("Press (a) to accelerate, (b) to brake, (c) to coast, (s) to stop short, (e) end race and to return to garage");
                userInput = Garage.scanner.next();
                switch (userInput) {
                    case "a" :
                        playerVehicle.accelerate();
                        break;
                    case "b":
                        playerVehicle.brake();
                        break;
                    case "c":
                        playerVehicle.coast();
                        break;
                    case "s":
                        playerVehicle.stop();
                        break;
                    case "e":
                        // TODO: 9/5/2021 return to garage end race.
                        System.out.println("The race is over...heading back to garage");
                        playerVehicle.displayDash();
                        isActive = false;
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Not Valid");
                        break;
                }

            }
        }

    }

}