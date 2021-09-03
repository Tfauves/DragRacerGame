package com.company.dragracer.vehicles;
import com.company.dragracer.parts.CarEngine;

public class Car extends Vehicle{
    int brakeRatio = 3;
    int coastRatio = 2;
    int accelRatio = 5;

    public Car(CarEngine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {
        super(engine, maxSpeed, speedometer, distanceTraveled, distanceToFinish, time, type);
    }

    public void start() {
        getEngine().on();
    }

    public void turnOff() {
        getEngine().off();
    }

    public void accelerate() {
        System.out.println("Accelerating...");
        if (getEngine().getIsOperating() && speedometer < getMaxSpeed()) {
            speedometer += accelRatio;
            distanceTraveled += speedometer;
            time++;
        }
        if (speedometer == getMaxSpeed()) {
            System.out.println("Traveling at max speed");
            distanceTraveled += speedometer;
            time++;
        }
        if (speedometer > getMaxSpeed()) {
            int maxDifference = speedometer - getMaxSpeed();
            speedometer -= maxDifference;
            distanceTraveled += speedometer;
            time++;
        }
        displayDash();
    }

    public void coast() {
        System.out.println("Coasting...");
        speedometer -= coastRatio;
        distanceTraveled += coastRatio;
        time += coastRatio;
        displayDash();
    }

    public void brake() {
        System.out.println("Braking...");
        speedometer -= brakeRatio;
        distanceTraveled += brakeRatio - coastRatio;
        time += brakeRatio;
        displayDash();
    }

    public void stopVehicle() {
        System.out.println("Vehicle comes to a skidding stop...");
        speedometer = 0;
        time++;
        displayDash();
    }

    public void displayDash() {
        System.out.println("| Speed: " + speedometer + "mps | Distance: " + distanceTraveled + "m | Time: " + time + "s |");

    }

    public String toString() {
        return "| Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + " |";

    }
}
