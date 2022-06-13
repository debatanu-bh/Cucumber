package com.project.cucumber.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.TestNGCucumberRunner;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)
    @CucumberOptions(
            features = "src/main/resources/"
            ,glue={"com.cucumber.steps"}
            //, = {"pretty","html:target/Cucumber-reports/cucumber-pretty"})
    )

    public class TestRunner extends AbstractTestNGCucumberTests {

        TestNGCucumberRunner testCucumberRunner=new TestNGCucumberRunner(this.getClass());


    }

