package com.workintech.cars;

public class Ford extends Car {
    private long justFord;
    public Ford(int cylinder, String name) {
        super(cylinder, name);
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
