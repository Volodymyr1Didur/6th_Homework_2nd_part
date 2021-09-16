package com.company;

public class Accum {
    public int accumsVoltage;
    public double accumsSize;
    public String accumsType;

    public Accum(){}
    public Accum(int accumsVoltage, double accumsSize, String accumsType){
        this.accumsSize = accumsSize;
        this.accumsType = accumsType;
        this.accumsVoltage = accumsVoltage;
    }

    public double getAccumsSize() {
        return accumsSize;
    }

    public int getAccumsVoltage() {
        return accumsVoltage;
    }

    public String getAccumsType() {
        return accumsType;
    }

    public void setAccumsSize(double accumsSize) {
        this.accumsSize = accumsSize;
    }

    public void setAccumsType(String accumsType) {
        this.accumsType = accumsType;
    }

    public void setAccumsVoltage(int accumsVoltage) {
        this.accumsVoltage = accumsVoltage;
    }
}
