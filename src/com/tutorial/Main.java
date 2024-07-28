package com.tutorial;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

// ctrl + R to run
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        ////////////// MortgageCalculator TUTORIAL //////////////
//         MortgageCalculator.calculator_enhanced();


        ////////////// FIZZBUZZ TUTORIAL //////////////
//        FizzBuzz fb = new FizzBuzz();
//        fb.fizzbuzz();

        ////////////// LOOPS TUTORIAL //////////////
//        Loops.runLoop("for each");

        ////////////// CONSTRUCTOR + STATIC TUTORIAL //////////////
        ConstructorTutorial human1 = new ConstructorTutorial("bob", 20, 50);
        System.out.println(human1.name);

        human1.eat();

        System.out.println(ConstructorTutorial.numberOfFriends); // gives 1, best way to access the static member
        ConstructorTutorial human2 = new ConstructorTutorial("tom", 30, 60);
        System.out.println(ConstructorTutorial.numberOfFriends); // gives 2 cos numberOfFriends is shared
        System.out.println(human1.numberOfFriends); // gives 2, not recommended way of accessing the static member

    }
}