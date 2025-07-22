package com.example.demo.temp;

public class Car {
    String company;
    String model;
    String type;
    int topSpeed;
    String engineType;


    public Car(String company, String model, String type, int topSpeed, String engineType) {
        this.company = company;
        this.model = model;
        this.type = type;
        this.topSpeed = topSpeed;
        this.engineType = engineType;
    }
    public String getCompany() { return company; }
    public String getModel() { return model; }
    public String getType() { return type; }
    public int getTopSpeed() { return topSpeed; }
    public String getEngineType() { return engineType; }
    
}
