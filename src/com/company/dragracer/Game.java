package com.company.dragracer;

import com.company.dragracer.enviroments.Garage;
import com.company.dragracer.enviroments.Speedway;
import com.company.dragracer.player.Player;
import com.company.dragracer.player.racerOne;

import com.company.dragracer.util.UI;


public class Game {
    private boolean isActiveGame = false;
    Garage garage;
    Speedway speedway;

    public void gamePlayer() {
        System.out.println("Enter Player Name: ");
        String userInput = UI.scanner.nextLine();
        Player player = new racerOne(garage.getPlayerCar(), userInput, 0, 100);
    }

    public void play() {
        isActiveGame = true;
        while(isActiveGame) {
            garage = new Garage();
            speedway = new Speedway();
            garage.selectCar();
            speedway.selectTrack();
            speedway.race(garage.getPlayerCar());
        }
    }

    public void endOfRace() {
        boolean isActive = true;
        while (isActive) {
            System.out.println("Race Again? y/n");
            String userInput = UI.scanner.nextLine();
            switch (userInput) {
                case "y":
                    isActiveGame = true;
                    break;
                case "n":
                    System.out.println("Thanks for playing...");
                    System.exit(0);
                    break;

            }
        }
    }

}
