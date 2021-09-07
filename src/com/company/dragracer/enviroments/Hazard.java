package com.company.dragracer.enviroments;

public class Hazard {
    private String type;
    private int distanceFromFinish;
    private int damage;

    // TODO: 9/7/2021 need to fix distance of hazard to include the distance traveled??? of finish distance added to the distance of the hazard...??? 
    public Hazard(String type, int distanceFromFinish, int damage) {
        this.type = type;
        this.distanceFromFinish = distanceFromFinish;
        this.damage = damage;
    }

    public int getDistanceFromFinish() {
        return distanceFromFinish;
    }

    public String getType() {
        return type;
    }
}
