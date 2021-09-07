package com.company.dragracer.parts;

public class DashBoard {
    private int speedometer;
    private int odometer;
    private int timer;

    public DashBoard(int speedometer, int odometer, int timer) {
        this.speedometer = speedometer;
        this.odometer = odometer;
        this.timer = timer;
    }

    public void travelDistance() {
        odometer++;
    }

    public void speed() {
        speedometer++;
    }

    public void clock() {
        timer++;
    }
}
