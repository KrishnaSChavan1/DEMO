package com.example.demo.temp;

public class Func implements Carfunction {
    private Car specs;
    private int currentSpeed;

    public Func(Car specs) {
        this.specs = specs;
        this.currentSpeed = 0;
    }

    @Override
    public void increaseSpeed(int speed) {
        int topSpeed = specs.getTopSpeed();
        if (currentSpeed + speed <= topSpeed) {
            currentSpeed += speed;
            System.out.println("Speed increased to: " + currentSpeed + " km/h");
        } else {
            currentSpeed = topSpeed;
            System.out.println("Reached top speed: " + currentSpeed + " km/h");
        }
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }

    public Car getSpecs() {
        return specs;
    }

   
    

}
