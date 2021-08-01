package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String name;
        Cup cup = new Cup();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
//        System.out.printf(playerName);


//        public Player(String name) {
//            this.name = name;
//
//        }

        Cup myCup = new Cup();
        myCup.roll();
        System.out.println(playerName + "'s roll is:  " + myCup.displayCup());

        String bidNumberDice;
        int bidFaceUpValue;
        Scanner scanner1 = new Scanner((System.in));
        System.out.println("Make a bid: numberOfDice: ");
        bidNumberDice = scanner.nextLine();
//        System.out.println(bidNumberDice);

        System.out.println("Make a bid face up value of dice: ");
        bidFaceUpValue = scanner.nextInt();
//        System.out.println(bidFaceUpValue);

        System.out.println(playerName + "'s bid is: " + bidNumberDice + " / " + bidFaceUpValue + "'s");

        //        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your first name?");
//        String input = scanner.nextLine();
//        System.out.println("What is your last name?");
//        String last = scanner.nextLine();
        //
//        System.out.println("Hello " + last + ", " + input + " " + last);


        // create bidNumberOfDice and bidFaceUpValue variables
        // currentBid is numberOfDice / faceUpValue
        // if bidNumberOfDice > numberOfDice or bidFaceUpValue > faceUpValue
        // bid is valid and can be accepted as currentBid
        // pass bidNumberOfDice to numberOfDice and bidFaceUpValue to faceUpValue
        // else
        // bid is not vaild, ask player to bid again





//        Scanner scanner = new Scanner(System.in);
//        Die die1 = new Die();
//        Die die2 = new Die();
//        die1.roll();
//        die2.roll();
    }
}
