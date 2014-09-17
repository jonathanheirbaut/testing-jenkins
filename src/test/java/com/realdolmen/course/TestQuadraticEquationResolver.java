package com.realdolmen.course;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import java.math.BigDecimal;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
@RunWith(MockitoJUnitRunner.class)
public class TestQuadraticEquationResolver {

    @Mock
    DiscriminantCalculator discriminantCalculator;
    @InjectMocks
    QuadraticEquationResolver quadraticEquationResolver;

    @Test
    public void canCalculateQuadraticEquationWithOneSolution() {
        Mockito.when(discriminantCalculator.discriminant(1, 2, 1)).thenReturn(new BigDecimal(0));
        // quadraticEquationResolver.setDiscriminantCalculator(discriminantCalculator);

        //Discriminant = 0
        BigDecimal[] result = quadraticEquationResolver.calculateEquation(1, 2, 1);
        assertArrayEquals("Equation with one result not calculated correctly", new BigDecimal[]{new BigDecimal(-1)}, result);
    }


    @Test
    public void canCalculateQuadraticEquationWithTwoSolutions() {
        Mockito.when(discriminantCalculator.discriminant(1, 4, -5)).thenReturn(new BigDecimal(36));

        //Discriminant = 36
        BigDecimal[] result = quadraticEquationResolver.calculateEquation(1, 4, -5);
        assertArrayEquals("Equation with zero results not calculated correctly", new BigDecimal[]{new BigDecimal(1), new BigDecimal(-5)}, result);
    }

    @Test
    public void canCalculateQuadraticEquationWithZeroSolution() {
        Mockito.when(discriminantCalculator.discriminant(2, 0, 1)).thenReturn(new BigDecimal(-8));

        //Discriminant = -8
        BigDecimal[] result = quadraticEquationResolver.calculateEquation(2, 0, 1);
        assertArrayEquals("Equation with zero results not calculated correctly", new BigDecimal[]{}, result);
    }
}
