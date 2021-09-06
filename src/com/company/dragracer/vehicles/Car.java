package com.company.dragracer.vehicles;
import com.company.dragracer.parts.CarEngine;

import java.util.Random;

public class Car extends Vehicle{
    private int brakeRatio = 3;
    private int coastRatio = 2;
    private int accelRatio;

    public Car(CarEngine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {
        super(engine, maxSpeed, speedometer, distanceTraveled, distanceToFinish, time, type);
    }

    public void actionRatio() {
        Random acceleration = new Random();
        int maxSpeedJump = 10;
        int minSpeedJump = 1;

        accelRatio = acceleration.nextInt(maxSpeedJump) + minSpeedJump;
    }

    public void start() {
        getEngine().on();
    }

    public void turnOff() {
        getEngine().off();
    }

    public void accelerate() {
        actionRatio();
        System.out.println("Accelerating...");
        if (getEngine().getIsOperating() && speedometer < getMaxSpeed()) {
            speedometer += accelRatio;
            distanceTraveled += speedometer;
            time += distanceTraveled;
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

    public void stop() {
        System.out.println("Vehicle comes to a skidding stop...");
        speedometer = 0;
        time++;
        displayDash();
    }

    public String toString() {
        return "| Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + "mps |";
    }

}
