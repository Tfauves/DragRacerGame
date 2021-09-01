package com.company.dragracer.enviroments;

public class Track {
    private String lvlOfDifficulty;
    private int length;
    public Hazard hazard;

    public Track(String lvlOfDifficulty, int length, Hazard hazard) {
        this.lvlOfDifficulty = lvlOfDifficulty;
        this.length = length;
        this.hazard = hazard;
    }

    public int getLength() {
        return length;
    }
}
