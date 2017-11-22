package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseTest {
    @Test(dataProvider = "isPositiveTrue", dataProviderClass = CalculatorTestDataProvider.class)
    public void isPositiveTrueTest(long a) {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + " = " + result);
        Assert.assertTrue(result,"Result is negative");
    }

    @Test(dataProvider = "isPositiveFalse", dataProviderClass = CalculatorTestDataProvider.class)
    public void isPositiveFalseTest(long a) {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + " = " + result);
        Assert.assertFalse(result,"Result is positive");
    }
}