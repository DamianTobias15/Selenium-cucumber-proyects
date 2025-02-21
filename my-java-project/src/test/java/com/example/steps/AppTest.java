package com.example.steps;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features", // Ruta a los archivos .feature
    glue = "com.example.steps",              // Paquete donde están los step definitions
    plugin = {"pretty", "html:target/cucumber-reports/cucumber.html"} // Plugins para reporting
)
public class AppTest {
}