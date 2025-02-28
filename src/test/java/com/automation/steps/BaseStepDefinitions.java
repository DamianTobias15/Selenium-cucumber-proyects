package com.automation.steps;

import com.automation.utilities.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class BaseStepDefinitions {
    protected WebDriver driver;
    protected WebDriverWait wait;

    public BaseStepDefinitions() {
        this.driver = DriverManager.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    // Método para maximizar ventana
    protected void maximizeWindow() {
        driver.manage().window().maximize();
    }
}