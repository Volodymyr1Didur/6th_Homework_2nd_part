package com.company;

public class FuelTank {
    public int sizeOfFuelTank;
    public String typeOfFuel;

    public FuelTank(){}
    public FuelTank(int sizeOfFuelTank, String typeOfFuel){
        this.sizeOfFuelTank = sizeOfFuelTank;
        this.typeOfFuel = typeOfFuel;
    }

    public int getSizeOfFuelTank() {
        return sizeOfFuelTank;
    }

    public void setSizeOfFuelTank(int sizeOfFuelTank) {
        this.sizeOfFuelTank = sizeOfFuelTank;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public void setTypeOfFuel(String typeOfFuel) {
        this.typeOfFuel = typeOfFuel;
    }
}
