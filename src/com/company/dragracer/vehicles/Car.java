package com.company.dragracer.vehicles;

import com.company.dragracer.parts.Engine;


public class Car extends Vehicle{

    public Car(Engine engine, int maxSpeed, int speedometer, int distanceTraveled, int distanceToFinish, int time, String type) {

        super(engine, maxSpeed, speedometer, distanceTraveled, distanceToFinish, time, type);
    }

    public void start() {
        engine.on();
    }

    public void turnOff() {
        engine.off();
    }

    public void accelerate() {
        int speedIncrement = 15;

        if (engine.getIsOperating() && getSpeedometer() < getMaxSpeed()) {
           setSpeedometer(getSpeedometer() + speedIncrement);
            System.out.println("\nAccelerate.. \nSpeedometer: " + getSpeedometer() + " mph." + "\n Track Distance: ");
            //superCharger and nitrous will be able to be applied to increase the max speed amount.

        } else if (getSpeedometer() >= getMaxSpeed()) {
            setSpeedometer(getMaxSpeed());
            System.out.println("\n The vehicle is at its max speed " + getSpeedometer() + " mph.");
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
