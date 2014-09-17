package com.realdolmen.course;

import java.math.BigDecimal;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
public class DiscriminantCalculator {
    public BigDecimal discriminant(double a, double b, double c) {
        return new BigDecimal((Math.pow(b,2) - 4 * a * c));
    }
}
