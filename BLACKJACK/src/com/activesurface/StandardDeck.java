package com.activesurface;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class StandardDeck implements Deck{
    private final List<Card> CARDS = new ArrayList<>();
    public final String[] SUITS = new String[] {
            "Clubs", "Hearts", "Diamonds", "Spades"
    };
    public final String[] VALUES = new String[] {
            "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"
    };

    public StandardDeck() {
        for(String suit : SUITS) {
            for (String value : VALUES) {
                CARDS.add(new Card(suit, value));
            }
        }
    }


    @Override
    public void shuffle() {
        Collections.shuffle(CARDS);
    }

    @Override
    public Card deal() {
        return CARDS.remove(CARDS.size() - 1);
    }

    public void printDeck() {
        System.out.println(CARDS);
    }
}
