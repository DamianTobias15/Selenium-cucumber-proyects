package com.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.List;

public class GymsharkPage {
    private final WebDriver driver;

    // Elementos de la página usando anotaciones de GymsharkPage para identificar los elementos
    // Elementos para filtrado
    @FindBy(xpath = "//*[@id='men']") // Selector del menú de categorías
    private WebElement categoryFilter;

    @FindBy(css = "[class*='product-card']") // Selector de productos
    private List<WebElement> productCards;

    @FindBy(css = "[data-testid='products-count']") // Selector del contador
    private WebElement resultsCounter;

    @FindBy(css = "div[class*='product-grid']") // Selector actualizado
    private WebElement featuredSection;

    public GymsharkPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    // se agregan metodo de funcionalidades de la pagina 
     // Método para seleccionar categoría
    public void selectCategory(String categoryName) {
        categoryFilter.click(); // Abre el menú de categorías
        
        // Localiza y haz clic en la categoría específica
        driver.findElement(By.xpath("//button[contains(text(), '" + categoryName + "')]"))
              .click();
    }

    // Verifica que todos los productos contengan la categoría en su título
    public boolean areAllProductsInCategory(String category) {
        return productCards.stream()
            .allMatch(product -> 
                product.getText().toLowerCase().contains(category.toLowerCase())
            );
    }

    // Obtiene el número de productos mostrados
    public int getDisplayedProductsCount() {
        return productCards.size();
    }

    // Obtiene el valor del contador de resultados
    public int getResultsCounterValue() {
        return Integer.parseInt(resultsCounter.getText().replaceAll("\\D", ""));
    }

    public boolean isFeaturedSectionDisplayed() {
        try {
            new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.visibilityOf(featuredSection));
            return featuredSection.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}