package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CosCalculatorTest extends BaseTest {

    @Test(dataProvider = "cos", dataProviderClass = CalculatorTestDataProvider.class)
    public void cosTest(double a, double expected) {
        double result = calc.cos(Math.toRadians(a));
        System.out.println("cos of " + a + " degree" + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of cos: ");
    }
}
