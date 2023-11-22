package com.workintech.cars;

import java.util.Objects;

public class Car {
    String name;
    int wheels;
    int cylinders;
    boolean engine;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
        wheels = 4;
        engine = true;
    }

    public String getName() {
        return name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getStart() {
        return null;
    }

    public String startEngine() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "The car's engine is starting";
    }

    public String accelerate() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "The car's is accelerating";
    }

    public String brake() {
        System.out.println("Class Name: " + getClass().getSimpleName());
        return "The car's is braking";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return cylinders == car.cylinders && Objects.equals(name, car.name);
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", wheels=" + wheels +
                ", cylinders=" + cylinders +
                ", engine=" + engine +
                '}';
    }
}
