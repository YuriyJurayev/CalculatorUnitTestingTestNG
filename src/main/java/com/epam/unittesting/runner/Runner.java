package com.epam.unittesting.runner;

import org.testng.TestNG;
import java.util.ArrayList;
import java.util.List;

public class Runner {
    public static void main(String[] args){
        TestNG testng = new TestNG();

        List<String> suites = new ArrayList<>();
        suites.add("scenarios/testng.xml");
        suites.add("scenarios/testnggrouped.xml");
        suites.add("scenarios/testngparallel.xml");
        suites.add("scenarios/testngparameterized.xml");
        testng.setTestSuites(suites);
        testng.setOutputDirectory("target/test-output");
        testng.run();
    }

    /*public static void main(String[] args) throws RunnerException {

        System.out.println("Runner");
        TestNG testng = new TestNG();
        String xmlFileName = "testng.xml";
        List<XmlSuite> suite;
        try {
            suite = (List<XmlSuite>) (new Parser(xmlFileName).parse());
            testng.setXmlSuites(suite);
            testng.run();

        } catch (IOException e) {
            throw new RunnerException("Ошибка при чтении" + e.getMessage());
        }
    }*/
}
