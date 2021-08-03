package com.company;


import java.util.Scanner;

public class Player {
    public String playerName;
    public Cup cup = new Cup();
    Scanner scanner = new Scanner(System.in);

    public Player(String playerName) {
        this.playerName = playerName;
        System.out.println("What is your name?");
    }

//    Cup myCup = new Cup();
//        myCup.roll();
//
        public void Cup() {
            Cup myCup = new Cup();
            myCup.roll();
        }

//    System.out.println(playerName + "'s roll is:  " + myCup.displayCup());

}
