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
}

//    System.out.println(playerName + "'s roll is:  " + myCup.displayCup());