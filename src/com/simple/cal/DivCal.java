package com.simple.cal;

public class DivCal {
    public int addNumbers(int x, int y) {
        if(y == 0){
            throw new IllegalArgumentException("Number can't be divided by 0");
        }
        return x/y;
    }
    
    public float addNumbers(float x, float y) {
        if(y == 0){
            throw new IllegalArgumentException("Number can't be divided by 0");
        }
        return x/y;
    }
    
    public double addNumbers(double x, double y) {
        if(y == 0){
            throw new IllegalArgumentException("Number can't be divided by 0");
        }
        return x/y;
    }
}
