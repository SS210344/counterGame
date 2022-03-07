package com.company;

public class Counter {
    protected String Colour;
    protected int Number;

    public Counter(String colour, int number) {
        Colour = colour;
        Number = number;
    }

    public String getColour() {
        return Colour;
    }

    public void setColour(String colour) {
        Colour = colour;
    }

    public int getNumber() {
        return Number;
    }

    public void setNumber(int number) {
        Number = number;
    }
}
