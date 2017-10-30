package com.epam.unittesting.tests;

import com.epam.unittesting.tests.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseTest {
    @Test(dataProvider = "isPositive", dataProviderClass = CalculatorTestDataProvider.class)
    public void isPositiveTest(long a) {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + " = " + result);
        Assert.assertTrue(result);
    }
}