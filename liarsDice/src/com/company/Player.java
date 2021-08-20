package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Player {
    public String playerName;
    public Cup cup = new Cup();   //  instantiating a cup called cup

    Scanner scanner = new Scanner(System.in);

    // this is the constructor overriding the default constructor
    public Player() {
        int numberOfPlayers;
        numberOfPlayers = scanner.nextInt();
        scanner.nextLine();
        System.out.println(numberOfPlayers + " number of players");

        List<Player> players = new ArrayList<>();

        // while players.size < numberOfPlayers
        // ask for a playerName
        // add playerName to Player array list

        //iterate the Player list for each round of bidding
//        System.out.println("What is your name?");
//        String playerName = scanner.nextLine().trim();
//        System.out.println(playerName);

        // this runs 3 rounds for player 1 then 3 for player 2
        // I want 3 rounds with player 1 followed by player 2 in each round
        int rounds = 1;
        while (rounds < 4) {
            System.out.println("Running rounds " + rounds);
            rounds += 1;

            // read the array list to call the player's name here
            System.out.println("What is your name?");
            String playerName = scanner.nextLine().trim();
            System.out.println(playerName);

            System.out.println(cup());
            Bid bid = new Bid();
            bid.bid(playerName);
        }


//        System.out.println(cup());
//        Bid bid = new Bid();
//        bid.bid(playerName);

        // todo: add rounds here so player can play multiple rounds DONE
        // todo: need to display dice roll for each round DONE
    }

    public String cup() {
        cup.roll();
        return cup.displayCup();
    }
}

//    System.out.println(playerName + "'s roll is:  " + myCup.displayCup());