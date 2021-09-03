package com.company.dragracer.vehicles;

import com.company.dragracer.parts.Engine;

public abstract class Vehicle {
    protected Engine engine;
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
    public abstract String toString();

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getType() {
        return type;
    }

    public int getSpeedometer() {
        return speedometer;
    }


    public void setSpeedometer(int speedometer) {
        this.speedometer = speedometer;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public int getDistanceToFinish() {
        return distanceToFinish;
    }

    public void setDistanceToFinish(int distanceToFinish) {
        this.distanceToFinish = distanceToFinish;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}