package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SumDoubleCalculatorTest extends BaseTest {

    @Test(dataProvider = "sumDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void sumDoubleTest(double a, double b, double expected){
        double result = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of sum:");
    }
}
