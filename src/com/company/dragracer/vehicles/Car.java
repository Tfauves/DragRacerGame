package com.company.dragracer.vehicles;
import com.company.dragracer.parts.CarEngine;

public class Car extends Vehicle{

    public Car(CarEngine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {
        super(engine, maxSpeed, speedometer, distanceTraveled, distanceToFinish, time, type);
    }

    public void start() {
        engine.on();
    }

    public void turnOff() {
        engine.off();
    }

    public void accelerate() {
        int accelRatio = 5;
        if (engine.getIsOperating() && speedometer < getMaxSpeed()) {
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
        int coastRatio = 2;
        speedometer -= coastRatio;
        distanceTraveled += coastRatio;
        time += coastRatio;
        displayDash();
    }

    public void brake() {

    }

    public void displayDash() {
        System.out.println("| Speed: " + speedometer + "mps | Distance: " + distanceTraveled + "m | Time: " + time + "s |");

    }

    public String toString() {
        return "| Type: " + getType() + "| Engine: " + engine.getType() + " | Max Speed: " + getMaxSpeed() + " |";

    }
}
