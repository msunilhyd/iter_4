package com.sunil.springboot.teaching4;

public class Animal {

    public int noOfLegs;
    public boolean canFly;

    public void makeSound() {
        System.out.println("Making sound");
    }

    public Animal(int noOfLegs, boolean canFly) {
        this.noOfLegs = noOfLegs;
        this.canFly = canFly;
    }
}
