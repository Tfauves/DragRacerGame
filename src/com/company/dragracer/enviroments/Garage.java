package com.company.dragracer.enviroments;

import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.parts.Engine;
import com.company.dragracer.vehicles.Car;
import com.company.dragracer.vehicles.Vehicle;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Garage {
    public static final Scanner scanner = new Scanner(System.in);
//    private final List<Vehicle> vehicleList = new ArrayList<>();
//    private final List<Engine> engineList = new ArrayList<>();
//
//    private Car carChoice;
//    private CarEngine engineChoice;
    protected Car playerCar;
    private final static String SELECT_CAR_PROMPT = "Enter car selection";
    private final static String SELECT_ENGINE_PROMPT = "Enter engine selection";
    private final static String MENU_PROMPT = "Make your selection";



    private final String[] CAR_LIST = new String[] {
            "1. | Type: Subaru Impreza WRX | Max Speed: 170 mps",
            "2. | Volkswagen Golf/GTI  | Max Speed: 155 mps ",
            "3. | Quit "
    };

    private final static String[] ENGINE_LIST = new String[] {
            "1. | Type: V6 gas | Horse Power: 205",
            "2. | Type: I6 gas | Horse Power: 394 ",
            "3. | Quit "

    };

    public void displayOptions (String prompt, String[] options) {
        for (String option : options) {
            System.out.println(option);
        }
    }

    public void start() {
        boolean isActive = true;
        while (isActive) {
            displayOptions(MENU_PROMPT, CAR_LIST);
            int choice = getInt(1, 3, SELECT_CAR_PROMPT);
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
                System.out.println("error bad type");
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
                System.out.println("Invalid Selection");
            }
        } while (option < min || option > max);
        return option;
    }

    public void handleMenuSelection(int choice) {
        switch (choice) {
            case 1 -> playerCar = new Car(null, 170,0, 0, 0, 0, "Subaru Impreza WRX");
            case 2 -> playerCar = new Car(null, 155,0, 0, 0, 0, "Volkswagen Golf/GTI");
            case 3 -> System.exit(0);
            default -> System.out.println("invalid number received");
        }
        selectEngine();
        System.out.println("Your car: " + playerCar);
    }

//    Car streetRacer1 = new Car(null, 170,0, 0, 0, 0, "Subaru Impreza WRX");
//    Car streetRacer2 = new Car(null, 155,0, 0, 0, 0, "Volkswagen Golf/GTI");
//
//    CarEngine engine1  = new CarEngine(205, "V6 gas", false);
//    CarEngine engine2  = new CarEngine(394, "in6 gas", false);
//
//    public void listBuild() {
//        int carCount = 0;
//        int engineCount = 0;
//        vehicleList.add(streetRacer1);
//        vehicleList.add(streetRacer2);
//        engineList.add(engine1);
//        engineList.add(engine2);
//        System.out.println();
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("                                                     Car Selection");
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println();
//        for (Vehicle vehicle : vehicleList) {
//            carCount ++;
//            System.out.println(carCount + ":" + vehicle + "\n");
//        }
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println("                                                     Engine Selection");
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//        System.out.println();
//        for (Engine carEngine : engineList) {
//            engineCount++;
//            System.out.println(engineCount + ":" + carEngine + "\n");
//        }
//        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
//    }
//
//    public void carBuilder() {
//        listBuild();
//        System.out.println("Select a car make: ");
//        int carSelection = scanner.nextInt();
//        scanner.nextLine();
//        switch (carSelection) {
//            case 1 -> carChoice = streetRacer1;
//            case 2 -> carChoice = streetRacer2;
//            default -> System.out.println("Not Valid:");
//        }
//        System.out.println("Select engine: ");
//        int engineSelection = scanner.nextInt();
//        scanner.nextLine();
//        switch (engineSelection) {
//            case 1 -> engineChoice = engine1;
//            case 2 -> engineChoice = engine2;
//            default -> System.out.println("Not Valid:");
//        }
//        buildCar(engineChoice, carChoice);
//    }
//
//    public void buildCar(CarEngine carEngine, Car car) {
//        car.setEngine(carEngine);
//        playerCar = car;
//        System.out.println();
//        System.out.println("Your Car:" + car);
//    }


}
