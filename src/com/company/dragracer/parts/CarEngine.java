package com.company.dragracer.parts;

public class CarEngine extends Engine {

    public CarEngine(int horsePower, String type, boolean isOperating) {
        super(horsePower, type, isOperating);
    }


    public String toString() {
        return "| Type: " + type + " | Horse Power: " + horsePower + " |";
    }
}
