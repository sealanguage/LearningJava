package com.company;

import java.util.Scanner;

public class Bid {
    Scanner scanner = new Scanner(System.in);

    public int diceQuantity = 0;
    public int faceUpValue = 0;
    public int playerDiceQuantityBid = 0;
    public int playerFaceUpValueBid = 0;

    public void bid(String playerName) {
        inputBid(getPlayerName(playerName));

            if (playerFaceUpValueBid > faceUpValue && playerDiceQuantityBid > diceQuantity) {
            System.out.println("Bid is valid");
            // make valid bid become current faceUpValue and diceQuantity
            diceQuantity = playerDiceQuantityBid;
            faceUpValue = playerFaceUpValueBid;
            System.out.println(diceQuantity  + " / " + faceUpValue +"'s");
        }
            else {
            System.out.println("Bid is not valid, submit new bid: number of dice: ");
            playerDiceQuantityBid = scanner.nextInt();
            System.out.println("Bid is not valid, submit new bid: face up value: ");
            playerFaceUpValueBid = scanner.nextInt();
        }

        // todo: complete validation of dice values - need to clarify what this needs to be

    }

    public String getPlayerName(String playerName) {
        return playerName;
    }

    public void inputBid(String playerName) {
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
        System.out.println(getPlayerName(playerName) + "'s bid is: " + playerDiceQuantityBid + " / " + playerFaceUpValueBid + "'s");
    }
}

