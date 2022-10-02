package dev.rontran;

public class Dog implements Animal {

    public Dog() {
        System.out.println("\nA dog is created.");
    }

    @Override
    public void displayBehavior() {
        System.out.println("Dog says: Woof woof.");
        System.out.println("It prefers barking.");
    }
}
