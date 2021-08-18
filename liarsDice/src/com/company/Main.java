package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("How many players?");
        int numberOfPlayers;
        numberOfPlayers = scanner.nextInt();
        scanner.nextLine();

//        do {
//            numberOfPlayers = scanner.nextInt();
//            scanner.nextLine();
//        } while (numberOfPlayers < MIN_Players || numberOfPlayers > MAX_PLAYERS);
//
//            while (players.size() < numberOfPlayers) {
//
//            }

//        for (player : players) {


        System.out.println("What is your name?");
        String playerName = scanner.nextLine();

        Player player1 = new Player();
        Player player2 = new Player();

        List<Player> players = new ArrayList<>();



        }
}
