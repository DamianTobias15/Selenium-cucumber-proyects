package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GooglePage {

    private WebDriver driver;

    // Elementos de la página usando anotaciones de PageFactory
    @FindBy(name = "q")
    private WebElement searchBox;

    @FindBy(css = "input[value='Buscar con Google']")
    private WebElement searchButton;

    // Constructor
    public GooglePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this); // Inicializa los elementos
    }

    // Acciones de la página
    public GooglePage navigateToGoogle() {
        driver.get("https://www.google.com");
        return this;
    }

    public GooglePage enterSearchQuery(String query) {
        searchBox.sendKeys(query);
        return this;
    }

    public GooglePage clickSearchButton() {
        searchButton.click();
        return this;
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
}