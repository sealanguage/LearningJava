package com.company;

import java.util.ArrayList;
import java.util.List;

public class Cup {
    List<Die> dice = new ArrayList<>();

    public Cup() {
        while(dice.size() < 5) {
            dice.add(new Die());
        }
    }

    public void roll() {
        for (Die die : dice) {
            die.roll();
        }
    }

    public String displayCup() {
        String output = "";
        for (Die die : dice) {
            output += die.faceUpValue + " ";
        }
        return output.trim();
    }


}
