package com.example.stepdefinitions;

import io.cucumber.java.en.Given;

public class StepDefinitions {
    @Given("un paso de prueba")
    public void un_paso_de_prueba() {
        System.out.println("Ejecutando un paso de prueba...");
    }
}
