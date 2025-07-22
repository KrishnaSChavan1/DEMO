package com.example;



import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FactorialTest {
    @Test
    public void testFactorial() {
        Factorial factorial = new Factorial();
        int temp = 1;
        for(int i=1;i<10;i++){
            int result  = factorial.factorial(i);
            temp = temp*i;
            assertEquals(temp,result);
            System.err.println(i);
        }
        
        
    }
}
