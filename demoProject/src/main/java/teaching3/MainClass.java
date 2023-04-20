package teaching3;

interface Animal {
    public void makeSound();

    public void jump();
}

class Cat implements Animal {

    @Override
    public void makeSound() {
        System.out.println("Making Sound");
    }

    @Override
    public void jump() {
        System.out.println("Jumping");
    }
}

abstract class Vehc {

    public void soundHorn() {
        System.out.println("Sounding Horn");
    }

    public abstract void startEngine();

}

class Car extends Vehc {

    @Override
    public void startEngine() {
        System.out.println("Starting Engine");
    }
}

public class MainClass {

    public static void main(String[] args) {

        Cat cat = new Cat();
        cat.jump();
        cat.makeSound();

        Car car = new Car();
        car.soundHorn();
        car.startEngine();
    }
}
