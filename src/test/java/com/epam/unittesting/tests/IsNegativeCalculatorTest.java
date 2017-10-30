package com.epam.unittesting.tests;

import com.epam.unittesting.tests.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IsNegativeCalculatorTest extends BaseTest {

    @Test(dataProvider = "isNegative", dataProviderClass = CalculatorTestDataProvider.class)
    public void isNegativeTest(long a){
        boolean result = calc.isNegative(a);
        System.out.println("is " + a + " the negative number " + "= "+ result);
        Assert.assertTrue(result);
    }
}