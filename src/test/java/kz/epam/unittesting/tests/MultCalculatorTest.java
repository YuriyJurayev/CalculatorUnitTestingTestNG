package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MultCalculatorTest extends BaseTest {

    @Test(dataProvider = "multLong", dataProviderClass = CalculatorTestDataProvider.class)
    public void multTest(long a, long b, long expected){
        long result = calc.mult(a, b);
        System.out.println("multiplication: " + a + " * " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of multiplication: ");
    }
}
