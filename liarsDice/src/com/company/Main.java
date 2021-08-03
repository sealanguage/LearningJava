package com.company;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cup cup = new Cup();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
//        System.out.printf(playerName);

//        public Player(String name) {
//            this.name = name;
//        }

        Cup myCup = new Cup();
        myCup.roll();
        System.out.println(playerName + "'s roll is:  " + myCup.displayCup());

        int diceQuantity = 0;
        int faceUpValue = 0;
        int playerDiceQuantityBid = 0;
        int playerFaceUpValueBid = 0;

        System.out.println("Make a bid: number of dice: ");
        playerDiceQuantityBid = scanner.nextInt();
        //todo: make number of dice equal the number of dice in player's cup
        if (playerDiceQuantityBid < 1 || playerDiceQuantityBid > 6) {
            System.out.println("Invalid");
        }

        System.out.println("Make a bid face up value of dice: ");
        playerFaceUpValueBid = scanner.nextInt();
        if (playerFaceUpValueBid < 1 || playerFaceUpValueBid > 6) {
            System.out.println("Invalid");
        }

        System.out.println(playerName + "'s bid is: " + playerDiceQuantityBid + " / " + playerFaceUpValueBid + "'s");

        if (playerFaceUpValueBid > faceUpValue && playerDiceQuantityBid > diceQuantity) {
            System.out.println("Bid is valid");
            faceUpValue = playerFaceUpValueBid;
            diceQuantity = playerDiceQuantityBid;
            System.out.println(faceUpValue + " " + diceQuantity +"'s");
        }
        else {
            System.out.println("Bid is not valid, bid: number of dice: ");
            playerDiceQuantityBid = scanner.nextInt();
            System.out.println("Bid is not valid, bid: face up value: ");
            playerFaceUpValueBid = scanner.nextInt();
        }







//        Scanner scanner = new Scanner(System.in);
//        Die die1 = new Die();
//        Die die2 = new Die();
//        die1.roll();
//        die2.roll();
    }
}
