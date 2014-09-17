package com.realdolmen.course;

import org.junit.Before;
import org.junit.Test;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/**
 * Created by JHRAU70 on 17/09/2014.
 */
public class TestDiscriminantCalculator {
    private DiscriminantCalculator discriminantCalculator;

    @Before
    public void init() {
        discriminantCalculator = new DiscriminantCalculator();
    }

    @Test
    public void canCalculateDiscriminant() throws Exception {
      BigDecimal result = discriminantCalculator.discriminant(1, 2, 1);
      assertEquals("Discriminant not calculated correctly",new BigDecimal(0), result);
    }
}
