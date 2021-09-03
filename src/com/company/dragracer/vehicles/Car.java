package com.company.dragracer.vehicles;

import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.parts.RaceEngine;


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
        if (engine.getIsOperating() && getSpeedometer() < getMaxSpeed()) {

        }


    }

    public void coast() {

    }

    public void brake() {

    }

    public String toString() {
        return "";
    }
}
