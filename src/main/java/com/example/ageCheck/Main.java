package com.example.ageCheck;

public class Main {
    public static void main(String[] args) {
        GiveException a = new GiveException();
        a.setAgeLimit(18,60);
        
        try {
            a.checkAge(2);
            System.out.println("You are elegible");
        } catch (AgeExpeption e) {
            System.out.println(e.getMessage());
        }
    }
}
