package com.tutorial;

import java.util.Scanner;

public class Loops {
    public static void runLoop(String loopType) {
        // for loops
        if (loopType.equals("for")) {

            for (int i = 0; i < 5; i++)
                System.out.println("Hello World " + i); // single statement dont need code block {}
            for (int i = 5; i > 0; i--)
                System.out.println("Hello World " + i);
        }

        // while loops
        else if (loopType.equals("while")) {
            String input = "";
            Scanner scanner = new Scanner(System.in); // create scanner object outside of the while loop
            // while (input != "quit") cannot do this bc string is ref type, cannot use comparison operators bc will compare address of string objects
            // == is a reference comparison, i.e. both objects point to the same memory location
            // .equals() evaluates to the comparison of values in the objects
            while (true) {
                System.out.print("Input: ");
                input = scanner.next().toLowerCase();

                if (input.equals("pass"))
                    continue;

                if (input.equals("quit"))
                    break;
                System.out.println(input);
            }
        }

        // do while loops
        // while loops check condition first,
        // do-while loops check condition last --> will always execute at least once
        else if ((loopType.equals("do-while"))) {
            String input;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.print("Input: ");
                input = scanner.next().toLowerCase();
                System.out.println(input);
            }
            while (!input.equals("quit"));
        }

        // for each loops
        // used to iterate over arrays
        else if ((loopType.equals("for each"))) {
            String[] fruits = {"apple", "orange", "mango"};

            for (int i = 0; i < fruits.length; i++)
                System.out.println(fruits[i]);

            // same thing but using for each
            // each iteration: fruit variable will hold a value in the array
            // limitations: forward running, no access to index
            for (String fruit: fruits)
                System.out.println(fruit);
        }
    }
}
