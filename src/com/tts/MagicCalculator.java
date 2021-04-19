package com.tts;

public class MagicCalculator extends Calculator{

    public double squareRoot(float num1){
        this.num1 = num1;
        return Math.sqrt(num1);
    }

    public double sin(float num1){
        this.num1 = num1;
        return Math.sin(num1);
    }

    public double cos(float num1){
        this.num1 = num1;
        return Math.cos(num1);
    }

    public double tan(float num1){
        this.num1 = num1;
        return Math.tan(num1);
    }


    public float factorial(float num1) {
        float i, fact = 1;
        for (i = 1; i <= num1; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + num1 + " is: " + fact);
        return fact;
    }


}
