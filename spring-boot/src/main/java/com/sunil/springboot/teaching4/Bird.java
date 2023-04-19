package com.sunil.springboot.teaching4;

public class Bird extends Animal {

    public String type;

    public Bird(int noOfLegs, boolean canFly, String birdType) {
        super(noOfLegs, canFly);
        this.type = birdType;
    }
}
