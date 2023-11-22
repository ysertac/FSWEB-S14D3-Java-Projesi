package com.workintech.r_d;

public class CarSkeleton {
    String name;
    String description;

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String startEngine() {
        return getName() + " engine is started working.";
    }

    public String drive() {
        runEngine(this);
        return getName() + " is being drived";
    }

    protected void runEngine(CarSkeleton carSkeleton) {
        if (carSkeleton instanceof ElectricityCar) {
            double kmPerCharge = ((ElectricityCar) carSkeleton).getAvgKmPerCharge();
            int batterySize = ((ElectricityCar) carSkeleton).getBatterySize();
            System.out.println("The car engine is starting with electricity. Per charge: " + kmPerCharge + " Battery size: " + batterySize);
        } else if (carSkeleton instanceof GasPoweredCar) {
            double kmPerLitre = ((GasPoweredCar) carSkeleton).getAvgKmPerLitre();
            int cylinders = ((GasPoweredCar) carSkeleton).getCylinders();
            System.out.println("The car engine is starting with gas. Per litre: " + kmPerLitre + " Cylinders: " + cylinders);
        } else if (carSkeleton instanceof HybridCar) {
            double kmPerLitre = ((HybridCar) carSkeleton).getAvgKmPerLitre();
            int batterySize = ((HybridCar) carSkeleton).getBatterySize();
            int cylinders = ((HybridCar) carSkeleton).getCylinders();
            System.out.println("The car engine is starting with gas. Per litre: " + kmPerLitre + " Cylinders: " + cylinders + "Battery size: " + batterySize);
        } else {
            System.out.println("Invalid car type");
        }
    }
}
