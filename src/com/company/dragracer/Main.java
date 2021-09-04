package com.company.dragracer;

import com.company.dragracer.enviroments.Garage;
import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.util.UI;
import com.company.dragracer.vehicles.Car;

public class Main {

    public static void main(String[] args) {
//        CarEngine engin1 = new CarEngine(205, "v6 gas", false);
//        System.out.println(engin1);
//
//        Car racer01 = new Car(engin1,155, 0, 0,0,0,"custom racer");
//        System.out.println(racer01);
//        racer01.start();
//        racer01.turnOff();
//
//        racer01.coast();
//        racer01.brake();
//        racer01.accelerate();
//        racer01.accelerate();
//
//        racer01.stopVehicle();
//        racer01.accelerate();

        Garage garage = new Garage();
//        garage.listBuild();
//        garage.carBuilder();
        garage.start();


    }
}
