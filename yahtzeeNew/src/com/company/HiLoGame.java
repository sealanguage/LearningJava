package com.company;

import java.util.Scanner;

public class HiLoGame {
//    public int aNumber = 1;

    public static void play() {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        Die die1 = new Die();
        Die die2 = new Die();
        die1.roll();
        die2.roll();
        int total = die1.faceUpValue + die2.faceUpValue;

        System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (total));
        System.out.println("Will the next number be (h)igher or (l)ower?");
        String input = scanner.next();

        die1.roll();
        die2.roll();
        int newTotal = die1.faceUpValue + die2.faceUpValue;
        if (total == newTotal) {
            System.out.println("Same value, you lose.");
        }

        boolean isLarger = newTotal > total;
        System.out.println(die1.faceUpValue + " + " + die2.faceUpValue + " = " + (newTotal));
        System.out.println(isLarger ? "Number is higher" : "Number is lower");
        boolean didWin = false;
        if (input == "h") {  // guessed higher
            if (isLarger) {
                didWin = true;
            }
        } else {  //  guessed lower
            if (!isLarger) {
                didWin = true;
            }
        }
        System.out.println(didWin ? "you win!" : "you lose.");


        scanner.close();
    }

//    System.out.pr("aNumber");


}
