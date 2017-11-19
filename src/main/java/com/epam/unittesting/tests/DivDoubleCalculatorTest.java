package com.epam.unittesting.tests;

import com.epam.unittesting.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DivDoubleCalculatorTest extends BaseTest {

    @Test(dataProvider = "divDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void divTest(double a, double b, double expected){
        double result;
        try{
            result = calc.div(a, b);
            System.out.println("division: " + a + " / " + b + " = " + result);
            Assert.assertEquals(result, expected, "Invalid result of division: ");
        }catch (NumberFormatException e){
            System.out.println("division by zero: " + a + " / " + b + " is strongly prohibited!");
        }
    }

}
