package steps;

import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {
    WebDriver driver;

    @Given("el usuario está en la página de login")
    public void el_usuario_esta_en_la_pagina_de_login() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        driver.manage().window().maximize();
    }

    @When("ingresa el usuario {string} y la contraseña {string}")
    public void ingresa_el_usuario_y_la_contraseña(String usuario, String contraseña) {
        driver.findElement(By.id("user-name")).sendKeys(usuario);
        driver.findElement(By.id("password")).sendKeys(contraseña);
    }

    @And("hace clic en el botón de login")
    public void hace_clic_en_el_boton_de_login() {
        driver.findElement(By.id("login-button")).click();
    }

    @Then("debería ver la página de productos")
    public void deberia_ver_la_pagina_de_productos() {
        WebElement inventoryTitle = driver.findElement(By.className("title"));
        Assert.assertEquals("Products", inventoryTitle.getText());
        driver.quit();
    }

    @Then("debería ver un mensaje de error {string}")
    public void deberia_ver_un_mensaje_de_error(String mensajeEsperado) {
        WebElement errorMsg = driver.findElement(By.cssSelector("[data-test='error']"));
        Assert.assertEquals(mensajeEsperado, errorMsg.getText());
        driver.quit();
    }
}
