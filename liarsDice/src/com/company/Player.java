package com.company;


import java.util.Scanner;

public class Player {
    public String playerName;
    public Cup myCup = new Cup();   //  instantiating a cup called myCUp
    Scanner scanner = new Scanner(System.in);

    // this is the constructor overridig the default constructor
    public Player() {
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.println(playerName);

        System.out.println(cup());
        Bid bid = new Bid();
        bid.bid(playerName);

    }

    public String cup() {
        myCup.roll();
        return myCup.displayCup();
    }

//    public void bid() {
//
//        int diceQuantity = 0;
//        int faceUpValue = 0;
//        int playerDiceQuantityBid = 0;
//        int playerFaceUpValueBid = 0;
//
//        System.out.println("Make a bid: number of dice: ");
//        playerDiceQuantityBid = scanner.nextInt();
//        //todo: make number of dice equal the number of dice in player's cup
//        if (playerDiceQuantityBid < 1 || playerDiceQuantityBid > 6) {
//            System.out.println("Invalid");
//        }
//        System.out.println("Make a bid face up value of dice: ");
//        playerFaceUpValueBid = scanner.nextInt();
//        if (playerFaceUpValueBid < 1 || playerFaceUpValueBid > 6) {
//            System.out.println("Invalid");
//        }
//
//        System.out.println(playerName + "'s bid is: " + playerDiceQuantityBid + " / " + playerFaceUpValueBid + "'s");
//
//        if (playerFaceUpValueBid > faceUpValue && playerDiceQuantityBid > diceQuantity) {
//            System.out.println("Bid is valid");
//            // make valid bid become current faceUpValue and diceQuantity
//            diceQuantity = playerDiceQuantityBid;
//            faceUpValue = playerFaceUpValueBid;
//            System.out.println(diceQuantity  + " / " + faceUpValue +"'s");
//        }
//        else {
//            System.out.println("Bid is not valid, submit new bid: number of dice: ");
//            playerDiceQuantityBid = scanner.nextInt();
//            System.out.println("Bid is not valid, submit new bid: face up value: ");
//            playerFaceUpValueBid = scanner.nextInt();
//        }
//
//        // todo: complete validation of dice values - need to clarify what this needs to be



    }

//    System.out.println(playerName + "'s roll is:  " + myCup.displayCup());

//}
