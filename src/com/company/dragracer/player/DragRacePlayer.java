package com.company.dragracer.player;

import com.company.dragracer.player.Player;

public class DragRacePlayer implements Player {
    private String name;
    private int score;
    private boolean isActiveTurn;

    public void turn(Player dragRacer){
        if(!isActiveTurn) {
            isActiveTurn = true;
            while (isActiveTurn){

            }
        }
    }

}
