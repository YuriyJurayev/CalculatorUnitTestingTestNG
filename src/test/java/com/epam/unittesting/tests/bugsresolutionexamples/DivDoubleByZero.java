package com.epam.unittesting.tests.bugsresolutionexamples;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleByZero {
    public double division(double a, double b) {
        if (a== 0.0d & b == 0.0d) {
            throw new NumberFormatException("Делить ноль на ноль нельзя, результат NaN");

        }
        else if (b == 0.0d ) {
            throw new NumberFormatException("Делить на ноль нельзя, результат Infinity");
        }
        else {
            return a / b;
        }
    }
    @Test
    public void divisionTest(){
        double res = division(1,1);
        Assert.assertEquals(res, 1.0, "Invalid result of division: ");
    }
}
