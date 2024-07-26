package org.example;

public class Animal {
    private String name;
    private boolean isDog;

    // Constructor to initialize name and isDog
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // No-parameter constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }

    // Constructor with only name parameter
    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    // Getter to get the name
    public String getName() {
        return name;
    }

    // Getter to get if the animal is a dog or not
    public boolean getIsDog() {
        return isDog;
    }

    // Overriding the toString() method to print animal details
    @Override
    public String toString() {
        return name + " is a dog = " + isDog;
    }
}

