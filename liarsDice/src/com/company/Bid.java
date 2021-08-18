package com.company;

import java.util.Scanner;

public class Bid {
    Scanner scanner = new Scanner(System.in);

    public int diceQuantity = 0;
    public int faceUpValue = 0;
    public int playerDiceQuantityBid = 0;
    public int playerFaceUpValueBid = 0;

    public int rounds = 0;

//    public void bid(String playerName) {
//        inputBid(getPlayerName(playerName));
//
//        if (playerDiceQuantityBid < diceQuantity || playerDiceQuantityBid > 5) {
//            System.out.println("Invalid bid. Bid again between 1 and 5");
//        }
//
//    }

    public void bid(String playerName) {
        inputBid(getPlayerName(playerName));
    }

    public String getPlayerName(String playerName) {
        return playerName;
    }


    public void inputBid(String playerName) {
        System.out.println("Make a bid: number of dice: ");
        playerDiceQuantityBid = scanner.nextInt();

        // todo: rounds should be in player class to run multiple rounds, revert the rest back to previous
//        while (rounds < 3) {
//            System.out.println("Running rounds " + rounds);
//            rounds += 1;
//            System.out.println("Running rounds " + rounds);
//        }


            //todo: make number of dice equal the number of dice in player's cup
            while (playerDiceQuantityBid < 1 || playerDiceQuantityBid > 6) {
                System.out.println("Invalid bid again dice quantity: ");
                playerDiceQuantityBid = scanner.nextInt();
            }
            diceQuantity = playerDiceQuantityBid;
            System.out.println("dice quantity bid is: " + diceQuantity);

            System.out.println("Make a bid face up value of dice: ");
            playerFaceUpValueBid = scanner.nextInt();
            while (playerFaceUpValueBid < 1 || playerFaceUpValueBid > 6) {
    //            System.out.println("Invalid");
                System.out.println("Invalid, Bid again face up value: ");
                playerFaceUpValueBid = scanner.nextInt();
            }
            faceUpValue = playerFaceUpValueBid;
            System.out.println("face up value bid is: " + faceUpValue);


        System.out.println(getPlayerName(playerName) + "'s bid is: " + playerDiceQuantityBid + " / " + playerFaceUpValueBid + "'s");
        System.out.println("CHECK: dice quantity bid is: " + diceQuantity + ", faceUpValue bid is: " + faceUpValue);

    }
}




//        //            if (playerDiceQuantityBid > diceQuantity && playerFaceUpValueBid > faceUpValue) {
//        while (playerDiceQuantityBid < diceQuantity || playerDiceQuantityBid > 5) {
//            System.out.println("Bid is not valid, submit new number of dice bid: ");
//            playerDiceQuantityBid = scanner.nextInt();
//            System.out.println("playerDiceQuantityBid: " + playerDiceQuantityBid);
//            // make valid bid become current faceUpValue and diceQuantity
////            diceQuantity = playerDiceQuantityBid;
////            faceUpValue = playerFaceUpValueBid;
////            System.out.println("Current bid is: " + diceQuantity  + " / " + faceUpValue +"'s");
//        }
//        while (playerFaceUpValueBid < faceUpValue || playerFaceUpValueBid > 6) {
//            System.out.println("Bid is not valid, submit new face up value bid: ");
//            playerDiceQuantityBid = scanner.nextInt();
//            System.out.println("playerDiceQuantityBid: " + playerDiceQuantityBid);
////            System.out.println("Bid is not valid, submit new bid: face up value: ");
////            playerFaceUpValueBid = scanner.nextInt();
//            System.out.println("playerFaceUpValueBid: " + playerFaceUpValueBid);
//        }

        // todo: complete validation of dice values - need to clarify what this needs to be




