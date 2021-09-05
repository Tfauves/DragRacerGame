package com.company.dragracer.enviroments;

public class Track {
    private String lvlOfDifficulty;
    protected int length;
    protected Hazard hazard;

    public Track(String lvlOfDifficulty, int length, Hazard hazard) {
        this.lvlOfDifficulty = lvlOfDifficulty;
        this.length = length;
        this.hazard = hazard;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        String outPut = "| Track Selected || Level Of Difficulty: " + lvlOfDifficulty + " | Length: " + length + "m | Hazard: " + hazard + " |";
        return outPut;
    }
}
