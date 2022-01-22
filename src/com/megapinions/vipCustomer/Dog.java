package com.megapinions.vipCustomer;

import java.security.interfaces.RSAMultiPrimePrivateCrtKey;

public class Dog extends Animal {

    public int eyes, legs, tail, teeth;
    public String coat;

    public Dog(String name, int size, int weight, int eyes, int legs, int tail, int teeth, String coat) {

        super(name, 1, 1, size, weight);
        this.eyes = eyes;
        this.coat = coat;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
    }

    @Override
    public void eat() {
        System.out.println("dog.eat() called");
        chew();
        super.eat();
    }

    private void chew() {
        System.out.println("dog.chew() called");
    }

    private void walk() {
        System.out.println("Dog.walk() called");
    }

    public void run() {
        System.out.println("Dog.run() is called");
        move(10);
    }

    private void moveLegs(int speed) {
        System.out.println("Dog.moveLegs() called at speed " + speed);

    }

    @Override
    public void move(int speed) {
        System.out.println("Dog.move() called");
        moveLegs(speed);
        super.move(speed);
    }
}
