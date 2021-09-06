package com.company.dragracer.enviroments;

public class Track {
    private String lvlOfDifficulty;
    protected int length;
    protected Hazard hazard;

    // TODO: 9/5/2021 implement hazards.
    public Track(String lvlOfDifficulty, int length, Hazard hazard) {
        this.lvlOfDifficulty = lvlOfDifficulty;
        this.length = length;
        this.hazard = hazard;
    }

    public int getLength() {
        return length;
    }

    public String toString() {
        String outPut = "| Track Selected || Level Of Difficulty: " + lvlOfDifficulty + " | Length: " + length + "m | Hazard: " + hazard.getType() + " |";
        return outPut;
    }
}
