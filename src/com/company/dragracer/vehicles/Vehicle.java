package com.company.dragracer.vehicles;

import com.company.dragracer.parts.Engine;

public abstract class Vehicle {
    Engine engine;
    private int maxSpeed;
    private int speedometer;
    private String type;
    private int distanceTraveled;
    private int distanceToFinish;
    private int time;

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
}
