package kz.epam.unittesting.tests;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.*;

public class BaseTest {

    protected Calculator calc;

    @BeforeClass
    public void setUp(){
        System.out.println("Prepare instance of Calculator");
        calc = new Calculator();
    }

    @BeforeGroups(value = {"group 1","group 2"})
    public void beforeGroup(){
        System.out.println("Before group is prompted");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("Calculation is done\n------------------------------------------"  );
    }
}
