package com.activesurface;

import com.activesurface.Deck;
import com.activesurface.StandardDeck;

public class Main {

    public static void main(String[] args) {
        // write your code here

        HiLowGame game = new HiLowGame();
        while(true) {
            game.playGame();
        }


    }
}
