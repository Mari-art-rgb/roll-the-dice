package com.pluralsight;



public class Dice {
    private int roll;

    public Dice(int roll){
        this.roll = roll;
}


}


public int roll() {
    int randomNumber = (int) (Math.random() * maxValue) + minValue;
    return randomNumber;
}