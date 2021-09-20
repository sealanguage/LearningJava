package com.activesurface;

import java.util.*;

public class StandardDeck implements Deck {
    private final List<Card> cards = new ArrayList<>();
    final private String[] SUITS =  {
            "Clubs", "Hearts", "Diamonds", "Spades"
    };
    final private int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

    public StandardDeck() {
        for(String suit : SUITS) {
            for (int val: VALUES) {
                cards.add(new Card(suit, val));
            }
        }
    }

    @Override
    public void shuffle() {
        Collections.shuffle(cards);
    }

//    @Override
//    public void printDeck() {
//
//    }

//    @Override
//    public Card deal() {
//        return null;
//    }

    //    @Override
    public Card deal() {
        return cards.remove(cards.size() - 1);
    }

    public void printDeck() {
        System.out.println(cards);
    }
}
