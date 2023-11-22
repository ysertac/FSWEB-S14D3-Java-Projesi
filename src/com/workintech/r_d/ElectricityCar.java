package com.workintech.r_d;

public class ElectricityCar extends CarSkeleton {
    private double avgKmPerCharge;
    private int batterySize;

    public ElectricityCar(String name, String description, double avgKmPerLeter, int cylinders) {
        super(name, description);
        this.avgKmPerCharge = avgKmPerLeter;
        this.batterySize = cylinders;
    }

    public double getAvgKmPerCharge() {
        return avgKmPerCharge;
    }

    public int getBatterySize() {
        return batterySize;
    }
}
