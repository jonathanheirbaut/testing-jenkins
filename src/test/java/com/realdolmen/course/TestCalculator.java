package com.realdolmen.course;

import org.junit.Before;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
public class TestCalculator {
    private Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void positiveSumCanBeCalculated() {
        double sum = calculator.sum(5, 5);
        assertEquals("Sum was not calculated correctly", 10, sum, 0);
    }

    @Test
    public void negativeSumCanBeCalculated() {
        double sum = calculator.sum(-5, -5);
        assertEquals("Sum was not calculated correctly", -10, sum, 0);
    }

    @Test
    public void canSubstract(){
        double result = calculator.substract(15,  0.5);
        assertEquals("Substraction was not calculated correctly", 14.5, result, 0);
    }

    @Test
    public void canDevide() throws CalculatorException {
        double result = calculator.devide(15, 2);
        assertEquals("Division was not calculated correctly", 7.5, result, 0);
    }

    @Test(expected=CalculatorException.class)
    public void canNotDevideByZero() throws CalculatorException {
        double result = calculator.devide(15, 0);
    }

    @Test
    public void canMultiply(){
        double result = calculator.multiply(15,  2);
        assertEquals("Multiplication was not calculated correctly", 30, result, 0);
    }

}
