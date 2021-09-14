package com.activesurface;

public class Card {
    private int value;
    private String suit;

    public Card(String suit, int value) {
        this.suit = suit;
        this.value = value;
    }

    public int getValue() {return value;}

    public String displayy() {
        String output = "";
        switch(value) {
            case 1 -> output = "AC";
            case 11 -> output = "JA";
            case 12 -> output = "QU";
            case 13 -> output = "KI";

            default -> output = value == 10 ? Integer.toString(value) : " " + value;
        }
        return output + suit;

    }
//
//    public String tostring() {
//        return SUIT + " " + VALUE;
//    }

}
