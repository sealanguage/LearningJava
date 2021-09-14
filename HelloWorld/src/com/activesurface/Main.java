package com.activesurface;

import java.util.*;

public class Main {

    public static void main(String[] args) {
	// write your code here

        //primitive types
        byte myAge = 30;  //  initializing the variable
        byte herAge = myAge;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = false;

        System.out.println(herAge);

        //  use reference types to store complex objects

        byte age = 30;  //  a primitive type
        Date now = new Date();    //  new operator allocates memory for this data type, always allocate memory for ref types
        System.out.println("time " + now.getTime());  //  prints nuber of milliseconds since Jan 1 1970 00:00:00 GMT

        String message = "Hello World" + "!!";

        System.out.println(message.length());
        System.out.println(message);
        System.out.println(message.endsWith("!!"));

    }
}
