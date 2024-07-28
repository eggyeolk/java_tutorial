package com.tutorial;

import java.util.Scanner;

public class ScannerTutorial {
    static {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: "); // doesn't add new line
        String name = scanner.nextLine().trim(); // will read the entire line u type in and not just the first token
        System.out.println("You are " + name);

    }

}

