package com.company.dragracer.parts;

public abstract class RaceEngine implements Engine {
    protected int horsePower;
    protected String type;
    protected boolean isOperating;

    public RaceEngine(int horsePower, String type, boolean isOperating) {
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
