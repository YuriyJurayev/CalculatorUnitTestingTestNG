package com.epam.unittesting.tests.parameterizationexamples;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Factory;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumCalculatorTestParametrizedUsingFactory {

    private long a;
    private long b;
    private long expected;


    @Factory(dataProvider = "sumDataProvider")
    public SumCalculatorTestParametrizedUsingFactory(long a, long b, long expected) {
        this.a = a;
        this.b = b;
        this.expected = expected;
    }


    @Test()
    public void testSum() {
        Calculator calc = new Calculator();
        long sum = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + sum);
        assertEquals(expected, sum);

    }


    @DataProvider(name = "sumDataProvider")
    public static Object[][] sumDataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {2, 2, 4},
                {1, 0, 1}

        };

    }
}