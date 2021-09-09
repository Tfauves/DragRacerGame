package com.company.dragracer.parts;

public class CarEngine extends Engine {

    public CarEngine(int horsePower, String type, boolean isOperating) {
        super(horsePower, type, isOperating);
    }

//    @Override
//    public void on() {
//        if (!isOperating) {
//            isOperating = true;
//            System.out.println("Engine is running");
//        }
//    }

    @Override
    public void off() {
        if (isOperating) {
            isOperating = false;
            System.out.println("Engine is off");
        }
    }

    public String toString() {
        return "| Type: " + type + " | Horse Power: " + horsePower + " |";
    }
}
