package com.activesurface;

import com.activesurface.Deck;
import com.activesurface.StandardDeck;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Deck deck = new StandardDeck();

        deck.shuffle();
        deck.printDeck();

        for(int i = 0; i < 5; i++) {
            System.out.println(deck.deal());
        }
    }
}
