package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivCalculatorTest extends BaseTest{

    @Test(dataProvider = "divLong", dataProviderClass = CalculatorTestDataProvider.class)
    public void divTest(long a, long b, long expected){
        long result = calc.div(a, b);
        System.out.println("division: " + a + " / " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of division: ");
    }

    @Test(expectedExceptions = NumberFormatException.class ,dataProvider = "divByZeroLong", dataProviderClass = CalculatorTestDataProvider.class)
    public void divByZero(long a, long b){
        System.out.println("division: " + a + " / " + b);
        calc.div(a, b);
    }
}
