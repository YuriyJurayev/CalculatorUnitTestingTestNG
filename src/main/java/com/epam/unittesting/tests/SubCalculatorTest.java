package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubCalculatorTest extends BaseTest {

    @Test(dataProvider = "subLong", dataProviderClass = CalculatorTestDataProvider.class)
    public void subTest(long a, long b, long expected){
        long result = calc.sub(a, b);
        System.out.println("subtraction: " + a + " - " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of subtraction: ");
    }
}
