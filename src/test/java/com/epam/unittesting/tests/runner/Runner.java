package com.epam.unittesting.tests.runner;

import com.epam.unittesting.tests.runner.exception.RunnerException;
import org.testng.TestNG;
import org.testng.xml.Parser;
import org.testng.xml.XmlSuite;
import java.io.IOException;
import java.util.List;

public class Runner extends RuntimeException {
    public static void main(String[] args) throws RunnerException {

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
    }
}
