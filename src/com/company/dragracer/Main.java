package com.company.dragracer;

import com.company.dragracer.parts.RaceEngine;
import com.company.dragracer.vehicles.Car;

public class Main {

    public static void main(String[] args) {
        RaceEngine engin1 = new RaceEngine(205, "v6 gas", false);
        System.out.println(engin1);

        Car racer01 = new Car(engin1,155, 0, 0,0,0,"custom racer");
        racer01.start();
//        racer01.turnOff();
        racer01.accelerate();
    }
}
