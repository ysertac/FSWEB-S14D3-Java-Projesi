package com.workintech.cars;

public class Holden extends Car {
    private String justHolden;
    public Holden(int cylinders, String name) {
        super(cylinders, name);
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
