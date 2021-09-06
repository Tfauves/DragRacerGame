package com.company.dragracer.parts;

public abstract class Engine implements Engines {
    protected int horsePower;
    protected String type;
    protected boolean isOperating;

    public Engine(int horsePower, String type, boolean isOperating) {
        this.horsePower = horsePower;
        this.type = type;
        this.isOperating = isOperating;
    }

    public abstract String toString();
    public boolean getIsOperating() {
        return isOperating;
    }

    public int getHorsePower() {
        return horsePower;
    }

}
