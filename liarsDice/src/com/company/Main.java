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
    }
}
