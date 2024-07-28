package com.tutorial;

public class ConstructorTutorial {

    // declaring the class attributes
    String name;
    int age;
    double weight;

    // static tutorial
    static int numberOfFriends;

    // let this be a Human Object
    ConstructorTutorial(String name, int age, double weight) {
        // this is like self. in python

        this.name = name;
        this.age = age;
        this.weight = weight;
        numberOfFriends ++;
    }

    void eat() {
        System.out.println(this.name + " is eating");
    }
}
