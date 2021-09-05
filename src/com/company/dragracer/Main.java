package com.company.dragracer;

import com.company.dragracer.enviroments.Garage;
import com.company.dragracer.enviroments.Speedway;
import com.company.dragracer.parts.CarEngine;
import com.company.dragracer.util.UI;
import com.company.dragracer.vehicles.Car;

public class Main {

    public static void main(String[] args) {

        Garage garage = new Garage();
        Speedway speedway = new Speedway();
        garage.start();
        speedway.startTrack();

    }
}
