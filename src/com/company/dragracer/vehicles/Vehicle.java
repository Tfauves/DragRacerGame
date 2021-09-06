package com.company.dragracer.vehicles;

import com.company.dragracer.parts.Engine;

public abstract class Vehicle {
    private Engine engine;
    private int maxSpeed;
    protected int speedometer;
    private String type;
    protected int distanceTraveled;
    protected int distanceToFinish;
    protected int time;

    public Vehicle(Engine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {
        this.engine = engine;
        this.maxSpeed = maxSpeed;
        this.speedometer = speedometer;
        this.distanceTraveled = distanceTraveled;
        this.distanceToFinish = distanceToFinish;
        this.time = time;
        this.type = type;
    }

    public abstract void start();
    public abstract void turnOff();
    public abstract void accelerate();
    public abstract void coast();
    public abstract void brake();
    public abstract void stop();

    public void displayDash() {
        System.out.println("| Speed: " + speedometer + "mps | Finish: " + distanceToFinish + "m | Odometer: " + distanceTraveled + "m | Time: " + time + "s |");

    }
    public abstract String toString();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setDistanceToFinish(int distanceToFinish) {
        this.distanceToFinish = distanceToFinish;
    }

    public int getDistanceToFinish() {
        return distanceToFinish;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }
}
