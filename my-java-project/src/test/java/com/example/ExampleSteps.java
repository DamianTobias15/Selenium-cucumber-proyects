package com.example.steps;

import io.cucumber.java.en.Given;

public class ExampleSteps {
    @Given("un paso de prueba")
    public void un_paso_de_prueba() {
        System.out.println("✅ Se ejecutó el paso de prueba correctamente");
    }
}