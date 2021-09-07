package com.company.dragracer;

import com.company.dragracer.enviroments.Garage;
import com.company.dragracer.enviroments.Speedway;
import com.company.dragracer.util.Display;

public class Main {

    public static void main(String[] args) {
        Display display = new Display();
        Garage garage = new Garage();
        Speedway speedway = new Speedway();
        display.titleScreen();
        garage.selectCar();
        speedway.selectTrack();
        speedway.race(garage.getPlayerCar());

    }
}
