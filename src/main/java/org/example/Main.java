package org.example;

import org.example.company.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4,"Mitsubishi");
        car.brake();
        car.accelerate();
        System.out.println(car);
    }
}