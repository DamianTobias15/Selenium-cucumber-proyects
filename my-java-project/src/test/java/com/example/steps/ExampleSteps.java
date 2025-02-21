package com.example.steps;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.example.pages.HomePage;
import com.example.utils.DriverManager;
import com.example.utils.ReportManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;

import static org.junit.Assert.assertTrue;

public class ExampleSteps {
    private WebDriver driver;
    private HomePage homePage;
    private ExtentTest test;

    @Before
    public void setUp(Scenario scenario) {
        try {
            driver = DriverManager.getDriver();
            homePage = new HomePage(driver);
            test = ReportManager.getInstance().createTest(scenario.getName());
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("Failed to initialize test setup: " + e.getMessage());
        }
    }

    @After
    public void tearDown(Scenario scenario) {
        try {
            if (scenario.isFailed()) {
                test.log(Status.FAIL, "Scenario failed: " + scenario.getName());
                // Aquí podrías agregar una captura de pantalla o más detalles del error
            } else {
                test.log(Status.PASS, "Scenario passed: " + scenario.getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                DriverManager.quitDriver();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                ReportManager.closeReport(); // Cierra el informe
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    @Given("I navigate to the home page")
    public void i_navigate_to_the_home_page() {
        test.log(Status.INFO, "Navigating to the home page");
        homePage.navigateToHomePage();
    }

    @When("I enter username {string} and password {string}")
    public void i_enter_username_and_password(String username, String password) {
        test.log(Status.INFO, "Entering username: " + username);
        test.log(Status.INFO, "Entering password: " + password);
        homePage.enterUsername(username);
        homePage.enterPassword(password);
    }

    @When("I click the login button")
    public void i_click_the_login_button() {
        test.log(Status.INFO, "Clicking the login button");
        homePage.clickLoginButton();
    }

    @Then("I should see the welcome message")
    public void i_should_see_the_welcome_message() {
        test.log(Status.INFO, "Verifying the welcome message");
        String actualTitle = driver.getTitle();
        assertTrue("El título de la página no coincide. Título actual: " + actualTitle, actualTitle.contains("Welcome"));
    }
}