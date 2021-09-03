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
    private final List<Vehicle> vehicleList = new ArrayList<>();
    private final List<Engine> engineList = new ArrayList<>();

    private Car carChoice;
    private CarEngine engineChoice;
    protected Car playerCar;

    Car streetRacer1 = new Car(null, 170,0, 0, 0, 0, "Subaru Impreza WRX");
    Car streetRacer2 = new Car(null, 155,0, 0, 0, 0, "Volkswagen Golf/GTI");

    CarEngine engine1  = new CarEngine(205, "V6 gas", false);
    CarEngine engine2  = new CarEngine(394, "in6 gas", false);

    public void listBuild() {
        int carCount = 0;
        int engineCount = 0;
        vehicleList.add(streetRacer1);
        vehicleList.add(streetRacer2);
        engineList.add(engine1);
        engineList.add(engine2);
        System.out.println();
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Car Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (Vehicle vehicle : vehicleList) {
            carCount ++;
            System.out.println(carCount + ":" + vehicle + "\n");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("                                                     Engine Selection");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
        System.out.println();
        for (Engine carEngine : engineList) {
            engineCount++;
            System.out.println(engineCount + ":" + carEngine + "\n");
        }
        System.out.println("------------------------------------------------------------------------------------------------------------------------------");
    }

    public void carBuilder() {
        listBuild();
        System.out.println("Select a car make: ");
        int carSelection = scanner.nextInt();
        scanner.nextLine();
        switch (carSelection) {
            case 1 -> carChoice = streetRacer1;
            case 2 -> carChoice = streetRacer2;
            default -> System.out.println("Not Valid:");
        }
        System.out.println("Select engine: ");
        int engineSelection = scanner.nextInt();
        scanner.nextLine();
        switch (engineSelection) {
            case 1 -> engineChoice = engine1;
            case 2 -> engineChoice = engine2;
            default -> System.out.println("Not Valid:");
        }
        buildCar(engineChoice, carChoice);
    }

    public void buildCar(CarEngine carEngine, Car car) {
        car.setEngine(carEngine);
        playerCar = car;
        System.out.println();
        System.out.println("Your Car:" + car);
    }


}
