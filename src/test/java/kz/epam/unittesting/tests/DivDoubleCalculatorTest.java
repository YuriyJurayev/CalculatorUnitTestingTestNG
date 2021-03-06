package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
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
    public void divByZeroTest(double a){
        System.out.println("division: " + a + " / " + 0);
        calc.div(a, 0);

    }

}
