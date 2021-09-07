package com.company.dragracer.util;

public class Display {
    private static final String WELCOME_PROMPT = "                    Welcome To Drag Racer";


    public void displayWelcome(String prompt) {
        System.out.println("\n" + prompt);
    }

    public void titleScreen() {
        displayWelcome(WELCOME_PROMPT);
    }

}