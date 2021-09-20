package com.activesurface;

import com.activesurface.Deck;
import com.activesurface.StandardDeck;
import java.util.Scanner;

public class HiLowGame {
    Scanner scanner = new Scanner(System.in);
    Card card1;

    public void playGame() {
        Deck deck = new StandardDeck();
        deck.shuffle();
        if (card1 == null) {card1 = deck.deal();}
        System.out.println(card1.display());
        System.out.println("_____\n Is next card (l)ower or (h)igher?");

        String input = scanner.nextLine();
        Card card2 = deck.deal();
        System.out.println(card2.display());

        if (input.toLowerCase().equals("h")) {
            if (card1.getValue() < card2.getValue()) {
                System.out.println("Winner");
            }
            else {
                System.out.println("Loser");
            }

        }
        if (input.toLowerCase().equals("l")) {
            if (card1.getValue() > card2.getValue()) {
                System.out.println("Winner");
            }
            else {
                System.out.println("Loser");
            }

        }
        card1 = card2;
        System.out.printf("Do you want to stop playing? (y/n)");
        String quitGame =  scanner.nextLine();
        if (quitGame.toLowerCase().equals("y")) {
            System.exit(200);
        }
    }

}
