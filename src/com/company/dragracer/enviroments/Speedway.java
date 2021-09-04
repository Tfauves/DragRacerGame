package com.company.dragracer.enviroments;

import java.util.ArrayList;
import java.util.List;

public class Speedway {
    private final static String SELECT_TRACK_PROMPT = "Select A Track";
    private final static String MENU_PROMPT = "Make your selection";


    private final String[] CAR_LIST = new String[] {
            "1. | Type: Subaru Impreza WRX | Max Speed: 170 mps",
            "2. | Volkswagen Golf/GTI  | Max Speed: 155 mps ",
            "3. | Quit "
    };

    private final  String[] TRACK_LIST = new String[] {
            "1. | Difficulty: Noob | Distance to finish: 400 meters |"
    };

    public void displayTrack() {
        for (Track tracks : trackList) {
            System.out.println(tracks);
        }
    }
}
