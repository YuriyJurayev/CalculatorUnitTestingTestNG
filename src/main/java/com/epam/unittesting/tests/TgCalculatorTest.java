package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TgCalculatorTest extends BaseTest {
    @Test(dataProvider = "tg", dataProviderClass = CalculatorTestDataProvider.class)
    public void tgTest(double a, double expected) {
        double result = calc.tg(Math.toRadians(a));
        System.out.println("tangent of " + a + " degree " + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of tangent: ");
    }
}