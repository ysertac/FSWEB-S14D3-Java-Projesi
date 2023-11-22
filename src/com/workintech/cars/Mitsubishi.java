package com.workintech.cars;

public class Mitsubishi extends Car {

    private int justMitsubishi;
    public Mitsubishi(int cylinders, String name) {
        super(cylinders, name);
    }

    public String getStart() {
        super.startEngine();
        return getName() + " engine is starting.";
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return getName() + "engine started working.";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return getName() + "is accelerating.";
    }

    @Override
    public String brake() {
        super.brake();
        return getName() + "is breaking.";
    }
}
