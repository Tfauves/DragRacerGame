package com.company.dragracer.player;

import com.company.dragracer.vehicles.Vehicle;

public abstract class Player {
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

    public Vehicle getPlayerVehicle() {
        return playerVehicle;
    }

    public String getName() {
        return name;
    }

    public int getScore() {
        return score;
    }

    public int getHealth() {
        return health;
    }

    public void setPlayerVehicle(Vehicle playerVehicle) {
        this.playerVehicle = playerVehicle;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
