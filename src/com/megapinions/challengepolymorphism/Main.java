package com.megapinions.challengepolymorphism;

public class Main {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            Car car = randomCar();
            System.out.println(car.getName() + " has " + car.getSeats() + " seats and " + car.getTires()
                    + " tires");
        }
    }

    public static Car randomCar() {

        int randomCar = (int) (Math.random() * 5) + 1;
        System.out.println("Generated number is: " + randomCar);

        switch (randomCar) {
            case 1:
                return new Mercedes(4, 5);
            case 2:
                return new BMW(4, 6);
            default:
                return new ForgetableCar();
        }
    }
}
class ForgetableCar extends Car {
    public ForgetableCar() {
        super(4,5,"Forgetable car");
    }
}
class Car {
    private boolean engines;
    private int tires;
    private int seats;
    private String name;

    public Car(int tires, int seats, String name) {
        this.engines = true;
        this.tires = tires;
        this.seats = seats;
        this.name = name;
    }

    public void startEngine() {
        System.out.println("Engine started");
    }

    public void accelarate() {
        System.out.println("Car accelarated");
    }

    public void brake() {
        System.out.println("Brake pushed");
    }

    public boolean isEngines() {
        return engines;
    }

    public int getTires() {
        return tires;
    }

    public int getSeats() {
        return seats;
    }

    public String getName() {
        return name;
    }
}

class Mercedes extends Car {
    private String name;

    public Mercedes(int tires, int seats) {
        super(tires, seats, "Mercedes");
    }

    @Override
    public void startEngine() {
        System.out.println("Mercedes engine started");
    }
}

class BMW extends Car {
    private String name;

    public BMW(int tires, int seats) {
        super(tires, seats, "BMW");
    }

    @Override
    public void startEngine() {
        System.out.println("BMW engine started");
    }
}