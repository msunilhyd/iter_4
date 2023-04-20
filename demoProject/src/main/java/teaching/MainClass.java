package teaching;

interface Vehicle {
    // abstract methods
    // no body
    public void soundHorn();

    public void startEngine();
}

class Car implements Vehicle {

    @Override
    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }
}

abstract class Dog {

    public void run() {
        System.out.println("Running");
    }

    public abstract void bark();
}

class GermanShepherd extends Dog {

    @Override
    public void bark() {
        System.out.println("GermanShepherd barking");
    }
}

public class MainClass {
    public static void main(String[] args) {

        GermanShepherd g1 = new GermanShepherd();
        g1.run();
        g1.bark();

//        Car c1 = new Car();
//        c1.soundHorn();
//        c1.startEngine();
    }
}
