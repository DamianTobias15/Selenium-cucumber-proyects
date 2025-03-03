package com.example.runners;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "com.example.steps",
        plugin = {
            "pretty",
            "html:target/cucumber-reports.html",
            "json:target/cucumber-reports.json",
            "junit:target/cucumber-reports.xml"
        },
        monochrome = true
)
public class TestRunner {
}