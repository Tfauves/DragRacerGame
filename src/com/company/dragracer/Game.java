package com.company.dragracer;

import com.company.dragracer.enviroments.Garage;
import com.company.dragracer.enviroments.Speedway;

import com.company.dragracer.vehicles.Vehicle;

public class Game {
    Player player;
    Vehicle vehicle;
    Garage garage;
    Speedway speedway;


    public void play() {
        garage = new Garage();
        speedway = new Speedway();
        garage.selectCar();
        speedway.selectTrack();
        speedway.race(garage.getPlayerCar());
    }

}
