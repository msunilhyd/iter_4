package com.sunil.springboot.teaching4;

public class Cat extends Animal {

    public String type;

    public Cat(int noOfLegs, boolean canFly, String typeOfCat) {
        super(noOfLegs, canFly);
        this.type = typeOfCat;
    }
}
