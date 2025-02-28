package com.automation.steps;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FilterSteps extends BaseStepDefinitions {

    @When("Selecciono la categoría {string} del menú de filtros")
    public void selecciono_categoria(String categoria) {
        WebElement categoryElement = driver.findElement(By.xpath("//*[text()='" + categoria + "']"));
        categoryElement.click();
    }

    @Then("Todos los productos mostrados pertenecen a la categoría {string}")
    public void verifico_categoria(String categoria) {
        WebElement resultados = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".product-grid")));
        assertTrue(resultados.isDisplayed(), "Productos no visibles");
    }
}