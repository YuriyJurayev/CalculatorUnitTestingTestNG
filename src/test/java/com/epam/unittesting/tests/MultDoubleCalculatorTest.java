package com.epam.unittesting.tests;

import com.epam.unittesting.tests.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultDoubleCalculatorTest extends BaseTest {

    @Test(dataProvider = "multDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void multTest(double a, double b, double expected){
        double result = calc.mult(a, b);
        System.out.println("multiplication: " + a + " * " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of multiplication: ");  /// bug - Math.floor is make @return  the closest floating-point value to {@code a} that is equal to a mathematical integer.
    }
}
