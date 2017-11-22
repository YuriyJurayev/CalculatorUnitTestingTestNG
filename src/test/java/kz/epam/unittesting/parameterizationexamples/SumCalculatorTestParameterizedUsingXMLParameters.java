package kz.epam.unittesting.parameterizationexamples;
import com.epam.tat.module4.Calculator;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class SumCalculatorTestParameterizedUsingXMLParameters {


    @Test(groups = "group1")
    @Parameters({"a","b","expected"})
    public void testSum1(long a, long b, long expected) {
        Calculator calc = new Calculator();
        long sum = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + sum);
        assertEquals(expected, sum);

    }

    @Test(groups = "group2")
    @Parameters({"a","b","expected"})
    public void testSum2(long a, long b, long expected) {
        Calculator calc = new Calculator();
        long sum = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + sum);
        assertEquals(expected, sum);

    }
    @Test(groups = "group3")
    @Parameters({"a","b","expected"})
    public void testSum3(long a, long b, long expected) {
        Calculator calc = new Calculator();
        long sum = calc.sum(a, b);
        System.out.println("sum: " + a + " + " + b + " = " + sum);
        assertEquals(expected, sum);

    }
}
