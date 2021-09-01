package com.company.dragracer.enviroments;

import java.util.ArrayList;
import java.util.List;

public class Speedway {
    private List<Track> trackList = new ArrayList<>();



    public void trackBuilder(String lvlOfDifficulty, int distance, Hazard hazardType) {
        Track track = new Track(lvlOfDifficulty, distance, hazardType);
        trackList.add(track);
    }

    public void displayTrack() {
        for (Track tracks : trackList) {
            System.out.println(tracks);
        }
    }
}
