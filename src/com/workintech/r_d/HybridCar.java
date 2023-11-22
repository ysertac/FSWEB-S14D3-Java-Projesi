package com.workintech.r_d;

public class HybridCar extends CarSkeleton {
    double avgKmPerLitre;
    int batterySize;
    int cylinders;

    public HybridCar(String name, String description, double avgKmPerLeter, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }
}
