package com.example.ageCheck;

public class AgeExpeption extends Exception{
    AgeExpeption(String s){
        super(s);
        printStackTrace();
    }
}
