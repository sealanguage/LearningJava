package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Cup myCup = new Cup();
        myCup.roll();
        System.out.println(myCup.displayCup());
        myCup.roll();
        System.out.println(myCup.displayCup());
        myCup.roll();
        System.out.println(myCup.displayCup());
        myCup.roll();
        System.out.println(myCup.displayCup());



//        HiLoGame.play();

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("What is your first name?");
//        String input = scanner.nextLine();
//        System.out.println("What is your last name?");
//        String last = scanner.nextLine();
//
//        System.out.println("Hello " + last + ", " + input + " " + last);




//        Die die = new Die();
//        die.roll();
//
//        System.out.println(die.faceUpValue);

    }


}

// how to get random numbers using Math.random
//        System.out.println( Math.round(Math.random() * (10 - 3) + 3));