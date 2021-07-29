package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();
        int total = die1.faceUpValue + die2.faceUpValue;

        System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (total) );
        System.out.println("Will the next number be (h)igher or (l)ower?");
        String input = scanner.next();

        die1.roll();
        die2.roll();
        int newTotal = die1.faceUpValue + die2.faceUpValue;
        if (total == newTotal) {
            System.out.println("Same value, you lose.");
        }

        boolean isLarger = newTotal > total;
        System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (newTotal) );
        System.out.println(isLarger ? "Number is higher" : "Number is lower");
        boolean didWin = false;
        if (input == "h") {
            // guessed higher
            if (isLarger){
                // you win
                System.out.printf("Number is higher you win");
            } else {
                // you lose
                System.out.printf("Number is lower you lose");
            }
        } else {
            // guessed lower
            if (isLarger) {
                // you lose
                System.out.printf("Number is higher you lose");
            } else {
                // you win
                System.out.printf("Number is lower you win");
            }
        }


//        if (input == "h") {  // guessed higher
//            if (isLarger) {
//                didWin = true;
//            }
//        } else {  //  guessed lower
//            if (!isLarger) {
//                didWin = true;
//            }
//        }
//        System.out.println(didWin ? "you win!" : "you lose/lose.");


        scanner.close();






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