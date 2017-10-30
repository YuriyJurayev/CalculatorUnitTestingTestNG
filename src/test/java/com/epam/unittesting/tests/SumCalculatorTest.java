package com.epam.unittesting.tests;

import com.epam.unittesting.tests.testUtils.CalculatorTestDataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumCalculatorTest extends BaseTest {

    @Test(groups="group 1",dataProvider = "sumLong", dataProviderClass = CalculatorTestDataProvider.class)
    public void testSum(long a, long b, long expected) {
        long result = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + result);
        assertEquals(result, expected,"Invalid result of sum:");

    }

    @Test(groups="group 2",dataProvider = "sumLong1",dataProviderClass = CalculatorTestDataProvider.class, dependsOnGroups = "group 1",dependsOnMethods = "testSum")
    public void testSum1(long a, long b, long expected) {
        long result = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + result);
        assertEquals(result, expected,"Invalid result of sum:");

    }
}