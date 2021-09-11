package com.company.dragracer.player;

import com.company.dragracer.vehicles.Vehicle;

public class Player {
    private Vehicle playerVehicle;
    private String name;
    private int score;
    private int health;

    public Player(Vehicle playerVehicle, String name, int score, int health) {
        this.playerVehicle = playerVehicle;
        this.name = name;
        this.score = score;
        this.health = health;
    }
}
