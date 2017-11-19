package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleCalculatorTest extends BaseTest {

    @Test(dataProvider = "divDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void divTest(double a, double b, double expected){
        double result = calc.div(a, b);
        System.out.println("division: " + a + " / " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of division: ");
    }

    @Test(expectedExceptions = ArithmeticException.class ,dataProvider = "divByZeroDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void divByZeroTest(double a, double b){
        System.out.println("division: " + a + " / " + b);
        calc.div(a, b);

    }

}
