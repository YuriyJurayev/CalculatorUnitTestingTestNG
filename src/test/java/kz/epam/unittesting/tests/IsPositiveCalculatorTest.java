package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsPositiveCalculatorTest extends BaseTest {
    @Test(dataProvider = "isPositive", dataProviderClass = CalculatorTestDataProvider.class)
    public void isPositiveTest(long a) {
        boolean result = calc.isPositive(a);
        System.out.println("is " + a + " the positive number " + " = " + result);
        Assert.assertTrue(result,"Result is negative");
        /*if(a > 0){
            Assert.assertTrue(result,"Result is negative");
        }else {
            Assert.assertFalse(result, "Result is positive");
        }*/
    }
}