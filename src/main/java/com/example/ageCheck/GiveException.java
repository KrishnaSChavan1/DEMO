package com.example.ageCheck;

public class GiveException implements ValidAge,SetAgeBoundry{

    private int lowerLimit;
    private int upperLimit;

    @Override
    public void setAgeLimit(int lowerLimit, int upperLimit) {
        this.lowerLimit = lowerLimit;
        this.upperLimit = upperLimit;
    }

    @Override
    public void checkAge(int currentAge) throws AgeExpeption {
        if(currentAge < lowerLimit || currentAge > upperLimit){
            throw new AgeExpeption("Not Eligable age");
        }
    }

}
