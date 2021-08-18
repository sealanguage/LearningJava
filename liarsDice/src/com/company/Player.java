package com.company;

import java.util.Scanner;

public class Player {
    public String playerName;
    public Cup cup = new Cup();   //  instantiating a cup called myCUp
    Scanner scanner = new Scanner(System.in);

    // this is the constructor overriding the default constructor
    public Player() {
        System.out.println("What is your name?");
        String playerName = scanner.nextLine();
        System.out.println(playerName);

        int rounds = 1;
        while (rounds < 4) {
            System.out.println(cup());
            Bid bid = new Bid();
            bid.bid(playerName);

            System.out.println("Running rounds " + rounds);
            rounds += 1;
        }
//        System.out.println(cup());
//        Bid bid = new Bid();
//        bid.bid(playerName);

        // todo: add rounds here so player can play multiple rounds
        // todo: need to display dice roll for each round
    }

    public String cup() {
        cup.roll();
        return cup.displayCup();
    }
}

//    System.out.println(playerName + "'s roll is:  " + myCup.displayCup());