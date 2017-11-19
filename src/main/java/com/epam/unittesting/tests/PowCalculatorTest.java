package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class PowCalculatorTest extends BaseTest {
    @Test(dataProvider = "pow", dataProviderClass = CalculatorTestDataProvider.class)
    public void powTest(double a, double b, double expected) {
        double result = calc.pow(a, b);
        System.out.println("exponentiation: number " + a + " in " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of exponentiation: ");
    }
}
