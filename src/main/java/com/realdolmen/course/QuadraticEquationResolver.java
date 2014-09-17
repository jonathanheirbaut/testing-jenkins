package com.realdolmen.course;

import java.math.BigDecimal;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
public class QuadraticEquationResolver {
    private DiscriminantCalculator discriminantCalculator;

    public QuadraticEquationResolver() {
       discriminantCalculator = new DiscriminantCalculator();
    }

    public BigDecimal [] calculateEquation(double a, double b, double c) {
        BigDecimal discriminant = discriminantCalculator.discriminant(a, b, c);
        if (discriminant.equals(new BigDecimal(0))){
            return calculateZeroPoints(a,b,c);
        }
        if (discriminant.compareTo(new BigDecimal(0))>0){
            return calculateZeroPoints(a,b,c);
        }
        return new BigDecimal[]{};
    }

    private BigDecimal [] calculateZeroPoints(double a, double b, double c){
        BigDecimal zeroPointa = new BigDecimal((-b+Math.sqrt(discriminantCalculator.discriminant(a,b,c).doubleValue()))/(2*a));
        BigDecimal zeroPointb = new BigDecimal((-b-Math.sqrt(discriminantCalculator.discriminant(a,b,c).doubleValue()))/(2*a));

        if (zeroPointa.equals(zeroPointb)){
            return new BigDecimal[]{zeroPointa};
        }
        return new BigDecimal[]{zeroPointa, zeroPointb};
    }

   /* public void setDiscriminantCalculator(DiscriminantCalculator discriminantCalculator) {
        this.discriminantCalculator = discriminantCalculator;
        System.out.println("Setter uitgevoerd");
    }*/
}
