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

    public int getHorsePower() {
        return horsePower;
    }

    public String getType() {
        return type;
    }

    public boolean getIsOperating() {
        return isOperating;
    }

    public void setOperating(boolean operating) {
        isOperating = operating;
    }
}