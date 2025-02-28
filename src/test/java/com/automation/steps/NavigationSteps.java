package com.automation.steps;

import io.cucumber.java.en.Given;

public class NavigationSteps extends BaseStepDefinitions {

    @Given("Estoy en la página de productos para hombres")
    public void estoy_en_pagina_hombres() {
        driver.get("https://www.gymshark.com/collections/mens-hoodies");
        maximizeWindow(); // Método heredado de BaseStepDefinitions
    }
}