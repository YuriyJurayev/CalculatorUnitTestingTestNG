package kz.epam.unittesting.parameterizationexamples;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumCalculatorTestParametrizedUsingDataProvider {


    @Test(dataProvider = "sumDataProvider")
    public void testSum(long a, long b, long expected) {
        Calculator calc = new Calculator();
        long sum = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + sum);
        assertEquals(expected, sum);

    }


    @DataProvider(name = "sumDataProvider")
    public Object[][] sumDataProvider() {
        return new Object[][]{
                {2, 3, 5},
                {2, 2, 4},
                {1, 0, 1}

        };

    }
}