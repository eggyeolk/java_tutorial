package com.tutorial;

import java.text.NumberFormat;
import java.util.Scanner;
import java.lang.Math;

public class MortgageCalculator {
    public static void calculator_enhanced() {
        Scanner scanner = new Scanner(System.in);

        // must declare variables outside of the while loops
        Double principal, r = 0.0;
        Integer months = 0;


        while (true) {
            System.out.print("Principal ($1K - $1M): ");
            principal = scanner.nextDouble();
            if (principal >= 1000 && principal <= 1_000_000)
                break;

            System.out.println("Enter a number between 1,000 and 1,000,000");
        }

        while (true) {
            System.out.print("Annual Interest Rate: ");
            Double annual_r = scanner.nextDouble();
            if (annual_r > 0 && annual_r <= 30) {
                r = annual_r/100/12;
                break;
            }


            System.out.println("Enter a value greater than 0 and less than or equal to 30");
        }

        while (true) {
            System.out.print("Period (Years): ");
            Integer years = scanner.nextInt();
            if (years > 0 && years <= 30) {
                months = years * 12;
                break;
            }
            System.out.println("Enter a value between 1 and 30");
        }


        Double numero = r * Math.pow((1 + r), months);
        Double denom = Math.pow((1 + r), months) - 1;
        // Double mortgage = principal * numero / denom;
        String mortgage = NumberFormat.getCurrencyInstance().format(principal * numero / denom);

        System.out.print("Mortgage: " + mortgage);
    }

    public static void calculator_old() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: ");
        Double principal = Double.parseDouble(scanner.nextLine().trim());
        System.out.print("Annual Interest Rate: ");
        Double r = Double.parseDouble(scanner.nextLine().trim())/100/12;
        System.out.print("Period (Years): ");
        Integer months = Integer.parseInt(scanner.nextLine().trim()) * 12;

        Double numero = r * Math.pow((1 + r), months);
        Double denom = Math.pow((1 + r), months) - 1;
        // Double mortgage = principal * numero / denom;
        String mortgage = NumberFormat.getCurrencyInstance().format(principal * numero / denom);

        System.out.print("Mortgage: " + mortgage);
    }
}
