package kz.epam.unittesting.tests;

import kz.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalculatorTest extends BaseTest {

    @Test(dataProvider = "isNegative", dataProviderClass = CalculatorTestDataProvider.class)
    public void isNegativeTest(long a, boolean expected){
        boolean result = calc.isNegative(a);
        System.out.println("is " + a + " the negative number " + "= "+ result);
        Assert.assertEquals(result, expected, "The number isn't negative!");
    }
}