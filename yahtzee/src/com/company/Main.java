package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Cup myCup = new Cup();
        Scanner scanner = new Scanner(System.in);
        String input;

        myCup.roll();
//        System.out.println(myCup.displayCup());
        System.out.println("Select the dice do you want to reroll (1-5");3
        input = scanner.nextLine();

        myCup.roll(myCup.parseSelections(input));
        System.out.println(myCup.displayCup());
        
//        myCup.roll( selection 3);

    }
}
