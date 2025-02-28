package com.automation.steps;

import io.cucumber.java.en.*;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class CommonSteps {
    private WebDriver driver;

    @Given("Abro el navegador")
    public void abro_el_navegador() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
    }

     @Given("Cierro el banner de cookies si está visible")
    public void cierro_banner_cookies() {
        try {
            WebElement closeButton = driver.findElement(By.cssSelector("#cookie-banner-close-btn"));
            closeButton.click();
        } catch (NoSuchElementException ignored) {
            // Si no hay banner, no hagas nada
        }
    }

    @When("Navego a la página {string}")
    public void navego_a_la_pagina(String url) {
        driver.get("https://www.gymshark.com/collections/all-products/mens");
    }

    @Then("Cierro el navegador")
    public void cierro_el_navegador() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}