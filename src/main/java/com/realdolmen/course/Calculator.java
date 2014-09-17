package com.realdolmen.course;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
public class Calculator {
    public double sum(double a, double b) {
        return a + b;
    }

    public double substract(double a, double b) {
        return a - b;
    }

    public double devide(double a, double b) throws CalculatorException {
        if (b == 0){
            throw new CalculatorException("Cannot devide by 0");
        }
        return a / b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


}
