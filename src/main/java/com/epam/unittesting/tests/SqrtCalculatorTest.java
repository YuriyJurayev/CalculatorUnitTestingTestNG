package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SqrtCalculatorTest extends BaseTest {

    @Test(dataProvider = "sqrt", dataProviderClass = CalculatorTestDataProvider.class)
    public void sqrtTest(double a, double expected) {
        double result = calc.sqrt(a);
        System.out.println("sqrt of " + a + " is " + result);
        Assert.assertEquals(result, expected, "Invalid result of sqrt: ");
    }
}