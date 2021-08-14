package com.company;

import java.util.Scanner;

public class Yahtzee {
//    public Cup myCup = new Cup();
    public Player player;
    private final Scanner scanner = new Scanner(System.in);
    public int totalScore = 0;
    public int turnScore = 0;


    public Yahtzee() {
        System.out.println("What is your name?");
        player = new Player((scanner.nextLine()).trim());
    }

    // todo refactor play to run 5 turns then display total score DONE
    public void play() {

        for (int playTurn = 0; playTurn < 3; playTurn++) {
            turn();
            totalScore = totalScore + player.updateScore();
        }

        System.out.println("Total score is: " + totalScore);
    }

    public void getSelections() {

        System.out.println("select dice you want to re-roll (1-5)");
        String input = scanner.nextLine();
        player.cup.roll(player.cup.parseSelections(input));
    }
// todo refactor turn() to update score and display round score DONE
    public void turn() {
        player.cup.roll();

        for (int i = 0; i < 2; i++) {
            System.out.println(player.cup.displayCup());
            getSelections();
        }
        System.out.println(player.cup.displayCup());
        System.out.println("Round score is : " + player.updateScore());
    }

}
