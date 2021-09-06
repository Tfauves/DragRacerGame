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

    public String toString() {
        return "\n| Track Selected || Level Of Difficulty: " + lvlOfDifficulty + " | Length: " + length + "m | Hazard: " + hazard.getType() + " |\n";
    }
}
