package com.test;

class Vehicle {
    private String brand;
}

public class Car {
    int wheels;
    String brand;

    public Car(int wheels, String brand) {
        this.wheels = wheels;
        this.brand = brand;
    }

    public int GetCarWheels() {
       return wheels;
    }
}
