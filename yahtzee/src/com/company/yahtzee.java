package com.company;

import java.util.Scanner;

public class Yahtzee {
    public Cup myCup = new Cup();
    public Player player;
    private final Scanner scanner = new Scanner(System.in);

    public Yahtzee() {
        System.out.println("What is your name? ");
//        String name = scanner.nextLine();
        player = new Player((scanner.nextLine()).trim());
    }

    // todo refactor play to run 5 turnsthen display total score
    public void play() { turn(); }

    public void getSelections() {
        System.out.println("Select the dice do you want to reroll (1-5)");
        String input = scanner.nextLine();
        player.cup.roll(player.cup.parseSelections(input));
    }

    // todo refactor turn to update score and displayround score *(and total score)
    public void turn() {
        player.cup.roll();

        for (int i = 0; i < 2; i++) {
            System.out.println(player.cup.displayCup());
            getSelections();
        }

        System.out.println(player.cup.displayCup());
    }


}
