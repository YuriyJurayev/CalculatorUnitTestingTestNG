package kz.epam.unittesting.runner;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        TestNG testng = new TestNG();

        List<String> suites = new ArrayList<String>();
        suites.add("scenarios/testng.xml");
        suites.add("scenarios/testnggrouped.xml");
        suites.add("scenarios/testngparallel.xml");
        suites.add("scenarios/testngparameterized.xml");
        testng.setTestSuites(suites);
        testng.setOutputDirectory("target/test-output");
        testng.run();
    }
}
