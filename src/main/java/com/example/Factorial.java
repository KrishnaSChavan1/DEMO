package com.example;

public class Factorial {
    public int factorial(int num){
        int fact = 1;
        for(int i =1;i <= num; i++){
            fact = fact * i;
        }

        return fact;
    }
}
