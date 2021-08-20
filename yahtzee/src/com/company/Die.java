package com.company;

public class Die {
    public int numberOfSides;
    public int faceUpValue;

    public Die() {
        numberOfSides = 6;
    }
    public Die(int numberOfSides) {
        this.numberOfSides = numberOfSides;
    }
    // default constructor
    public int getFaceUpValue() {
        return faceUpValue;
    }

    public int roll() {
        faceUpValue = (int) ((Math.random() * numberOfSides) +1);
        return faceUpValue;
    }
}
