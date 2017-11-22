package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SinCalculatorTest extends BaseTest {

    @Test(dataProvider = "sin", dataProviderClass = CalculatorTestDataProvider.class)
    public void sinTest(double a, double expected) {
        double result = calc.sin(Math.toRadians(a));
        System.out.println("sin of " + a + " degree" + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of sin: ");
    }
}

