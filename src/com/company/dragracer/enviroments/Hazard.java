package com.company.dragracer.enviroments;

public class Hazard {
    private String type;
    private int distanceFromFinish;
    private int damage;

    public Hazard(String type, int distanceFromFinish, int damage) {
        this.type = type;
        this.distanceFromFinish = distanceFromFinish;
        this.damage = damage;
    }
}
