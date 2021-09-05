package com.company.dragracer.enviroments;


import com.company.dragracer.vehicles.Car;

public class Speedway {
    private final static String SELECT_TRACK_PROMPT = "Select A Track";
    private final static String MENU_PROMPT = "Make your selection";
    Track newTrack;
    Garage playerGarage;

    public Speedway(Garage playerGarage) {
        this.playerGarage = playerGarage;
    }


    private final String[] TRACK_LIST = new String[]{
            "1. | Difficulty: Noob | Distance to finish: 200 meters | Hazard: None |",
            "2. | Difficulty: Beginner | Distance to finish: 400 meters | Hazard: Watery Lake |",
            "3. | Difficulty: Seasoned | Distance to finish: 600 meters | Hazard: Flaming Wall Of Hay",
            "4. | Difficulty: Pro | Distance to finish: 800 meters | Hazard: Super Hard Brick Wall",
    };

    public void displayTrackOptions(String prompt, String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public void startTrack() {
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
//
//    public void selectTrack() {
//        displayTrackOptions(SELECT_TRACK_PROMPT, TRACK_LIST);
//        int choice = getInt(1, TRACK_LIST.length, SELECT_TRACK_PROMPT);
//        Track newTrack;
//        switch (choice) {
//            case 1 -> newTrack = new Track("Noob", 200, null);
//            case 2 -> newTrack = new Track("Beginner", 400, null);
//            case 3 -> newTrack = new Track("Seasoned", 400, null);
//            case 4 -> newTrack = new Track("Pro", 800, null);
//            default -> {
//                System.out.println("error...");
//                newTrack = null;
//            }
//
//        }
//        playerGarage.getPlayerCar().setDistanceToFinish(newTrack.getLength());
//        System.out.println(newTrack);
//    }

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
        playerGarage.playerCar.setDistanceToFinish(newTrack.length);
        System.out.println(newTrack.toString());
    }

    public void race() {
        boolean isActive = true;
        System.out.println("Press (s) to start your engine");
        String userInput = Garage.scanner.next();
        if (userInput.equals("s")) {
            playerGarage.playerCar.start();
        } else {
            System.out.println("Please start your vehicle to begin driving.");
        }
        while (isActive) {
            if (playerGarage.playerCar.getEngine().getIsOperating()) {
                System.out.println("Press (a) to accelerate, (b) to brake, (c) to coast, (s) to stop short, (e) end race and to return to garage");
                userInput = Garage.scanner.next();
                switch (userInput) {
                    case "a" :
                        // TODO: 9/5/2021 accelerate()
                            break;
                    case "b":
                        // TODO: 9/5/2021 brake()
                        break;

                    case "c":
                        // TODO: 9/5/2021 coast()
                        break;
                    case "s":
                        // TODO: 9/5/2021 stop()
                        break;
                    case "e":
                        // TODO: 9/5/2021 return to garage end race.
                        System.out.println("The race is over...heading back to garage");
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