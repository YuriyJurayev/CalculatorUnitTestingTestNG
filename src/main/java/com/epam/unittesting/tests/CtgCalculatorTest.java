package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CtgCalculatorTest extends BaseTest {
    @Test(dataProvider = "ctg", dataProviderClass = CalculatorTestDataProvider.class)
    public void ctgTest(double a, double expected) {
        double result = calc.ctg(Math.toRadians(a));
        System.out.println("ctangent of " + a + " degree " + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of ctangent: ");
    }
}