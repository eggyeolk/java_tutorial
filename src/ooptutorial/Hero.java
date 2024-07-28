package ooptutorial;

public class Hero extends Person {
    String power;

    Hero(String name, int age, String power) {
        super(name, age); // sends this to the Person constructor (parent class)
        this.power = power;

    }

    public String toString() {
        return super.toString() + this.power;
    }
}
