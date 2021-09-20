package com.activesurface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class CheatersDeck {
    private final Scanner scanner = new Scanner(System.in);

    private final List<Card> cards = new ArrayList<>();
    final private String[] SUITS =  {
            "Clubs", "Hearts", "Diamonds", "Spades"
    };
    final private int[] VALUES = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};


//    @Override
    public void shuffle() {
        return;
    }

//    @Override
    public Card draw() {
        System.out.println(Arrays.toString(SUITS));
        System.out.println("Which Suit? (1-4)");
        int suitIndex;
        suitIndex = Integer.parseInt(scanner.nextLine() ) - 1;

        System.out.println(Arrays.toString(VALUES));
        System.out.println("Which value? (1-13");
        int valueIndex;
        valueIndex = Integer.parseInt(scanner.nextLine()) - 1;

        return new Card(SUITS[suitIndex], VALUES[valueIndex]);
    }

    public void printDeck() {
    }
}
