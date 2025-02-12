package stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Assert;

public class LoginSteps {
    WebDriver driver;

    @Given("el usuario está en la página de inicio de sesión")
    public void el_usuario_está_en_la_página_de_inicio_de_sesión() {
        System.setProperty("webdriver.chrome.driver", "ruta/al/chromedriver");
        driver = new ChromeDriver();
        driver.get("https://tu-sitio.com/login");
    }

    @When("ingresa su usuario y contraseña válidos")
    public void ingresa_su_usuario_y_contraseña_válidos() {
        // Implementación para ingresar credenciales y hacer login
    }

    @Then("debería ver la página de inicio correctamente")
    public void debería_ver_la_página_de_inicio_correctamente() {
        // Verificar si el usuario está en la página correcta
    }
}
