package com.company.dragracer;

import java.util.Timer;
import java.util.TimerTask;

public class Time {
    public boolean isActiveTime = false;
    public int ticksPassed = 0;
    Timer timeClock = new Timer();
    TimerTask distanceClock = new TimerTask() {
        @Override
        public void run() {
            ticksPassed++;
//            System.out.println("Ticks passed: " + ticksPassed);
        }
    };

    public void beginClock() {
        isActiveTime = true;
        if (isActiveTime) {
            startTimer(100);
        }
    }

    public void stopClock() {
        if (isActiveTime) {
            isActiveTime = false;
            System.out.println("Your time: " + ticksPassed + " sec");
        }
    }

    public void startTimer(int period) {
        timeClock.scheduleAtFixedRate(distanceClock, 1000, period);
    }
}
