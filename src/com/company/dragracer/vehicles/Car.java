package com.company.dragracer.vehicles;
import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.parts.Engines;
import com.company.dragracer.util.Display;

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
        if (getEngine().getIsOperating() && getSpeedometer() < getMaxSpeed()) {
            speedometer = getSpeedometer() + accelRatio;
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
        speedometer = getSpeedometer() - coastRatio;
        distanceTraveled += coastRatio;
        time += coastRatio;
        Display.spaces();
        System.out.println("Coasting...");
        displayDash();
    }

    public void brake() {
        speedometer = getSpeedometer() - brakeRatio;
        distanceTraveled += brakeRatio - coastRatio;
        time += brakeRatio;
        Display.spaces();
        System.out.println("Braking...");
        displayDash();
    }

    public void stop() {
        Display.spaces();
        System.out.println("Vehicle comes to a skidding stop...");
        speedometer = 0;
        time++;
    }

    public String toString() {
        return "| Type: " + getType() + " | Engine: " + getEngine() + " | Max Speed: " + getMaxSpeed() + "mps |";
    }

}
