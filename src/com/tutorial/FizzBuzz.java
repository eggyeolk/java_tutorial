package com.tutorial;

import java.util.Scanner;

public class FizzBuzz {
    public static void fizzbuzz () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Number: ");
//        Integer number = Integer.parseInt(scanner.nextLine().trim());
        Integer number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("FizzBuzz");

        else if (number % 5 == 0)
            System.out.println("Fizz");
        else if (number % 3 == 0)
            System.out.println("Buzz");
        else
            System.out.println(number);
    }
}
