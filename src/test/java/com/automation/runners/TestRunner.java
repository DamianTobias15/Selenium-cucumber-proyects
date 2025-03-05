package com.automation.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
    features = "src/test/resources/features/gymshark", // Ruta corregida
    glue = "steps", // Paquete donde están los steps
    tags = "@gymshark" // Tag para filtrar pruebas
)
public class TestRunner {
    // Clase vacía
}