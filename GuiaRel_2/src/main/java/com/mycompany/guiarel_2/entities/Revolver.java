package com.mycompany.guiarel_2.entities;
public class Revolver {

    private int actualPosition;
    private int waterPosition;

    public int getActualPosition() {
        return actualPosition;
    }

    public int getWaterPosition() {
        return waterPosition;
    }

    public void fillRevolver() {
        actualPosition = (int) Math.floor(Math.random() * 7);
        waterPosition = (int) Math.floor(Math.random() * 7);
    }

    public boolean wet() {
        return (actualPosition == waterPosition);
    }

    public void nextShoot() {
        if (actualPosition<6) {
            actualPosition++;
        }else{
            actualPosition=1;
        }
    }

    @Override
    public String toString() {
        return "actual position: " + actualPosition + ", water position: " + waterPosition;
    }

}
