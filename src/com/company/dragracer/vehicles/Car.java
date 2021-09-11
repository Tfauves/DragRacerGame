package com.company.dragracer.vehicles;
import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.parts.Engines;
import com.company.dragracer.util.Display;

import java.util.Random;

public class Car extends Vehicle{
    private  final int BRAKE_RATIO = 2;
    private final int COAST_RATIO = 3;
    private final int ACCEL_RATIO = 5;
    private int actionApplied;

    public Car(CarEngine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {
        super(engine, maxSpeed, speedometer, distanceTraveled, distanceToFinish, time, type);
    }

    public void actionRatio(int multiplier) {
        Random acceleration = new Random();
        int maxSpeedJump = 10;
        int minSpeedJump = 1;

        actionApplied = acceleration.nextInt(maxSpeedJump) + minSpeedJump * multiplier;
    }

    public void start() {
        getEngine().on();
    }

    public void turnOff() {
        getEngine().off();
    }

    public void accelerate() {
        actionRatio(ACCEL_RATIO);
        if (getEngine().getIsOperating() && getSpeedometer() < getMaxSpeed()) {
            speedometer = getSpeedometer() + actionApplied;
            distanceTraveled += getSpeedometer();
            time ++;
        }
        if (getSpeedometer() == getMaxSpeed()) {
            System.out.println("Traveling at max speed");
            distanceTraveled += getSpeedometer();
            time++;
        }
        if (getSpeedometer() > getMaxSpeed()) {
            int maxDifference = getSpeedometer() - getMaxSpeed();
            speedometer = getSpeedometer() - maxDifference;
            distanceTraveled += getSpeedometer();
            time++;
        }
        Display.spaces();
        System.out.println("Accelerating...");
        displayDash();
    }

    public void coast() {
        actionRatio(COAST_RATIO);
        speedometer = getSpeedometer() - actionApplied;
        distanceTraveled += COAST_RATIO;
        time += actionApplied;
        Display.spaces();
        System.out.println("Coasting...");
        displayDash();
    }

    public void brake() {
        actionRatio(BRAKE_RATIO);
        speedometer = getSpeedometer() - BRAKE_RATIO;
        distanceTraveled ++;
        time += BRAKE_RATIO;
        Display.spaces();
        System.out.println("Braking...");
        displayDash();
    }

    public void stop() {
        Display.spaces();
        System.out.println("Vehicle comes to a skidding stop...");
        speedometer = 0;
        distanceTraveled ++;
        time++;
    }

    public String toString() {
        return "| Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + "mps |";
    }

}
