package com.company;

public class Car implements For_accum, For_refueller{
    public String wheelRadius;
    public String brand;
    public String how;
    public Accum accum;
    public FuelTank fuelTank;

    public Car(Accum accum, FuelTank fuelTank){
        this.accum = accum;
        this.fuelTank = fuelTank;
    }
    public Car(int accumsVoltage, double accumsSize, String accumsType, int sizeOfFuelTank, String typeOfFuelTank){
        this.accum = new Accum(accumsVoltage, accumsSize, accumsType);
        this.fuelTank = new FuelTank(sizeOfFuelTank, typeOfFuelTank);
    }

    @Override
    public int voltage() {
        return accum.getAccumsVoltage();
    }

    @Override
    public double size() {
        return accum.getAccumsSize();
    }

    @Override
    public String type() {
        return accum.getAccumsType();
    }

    @Override
    public String typeOfFuel() {
        return fuelTank.getTypeOfFuel();
    }

    @Override
    public int sizeOfFuelTank() {
        return fuelTank.getSizeOfFuelTank();
    }
}
