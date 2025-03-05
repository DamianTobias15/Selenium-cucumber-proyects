package com.automation.steps;

import io.cucumber.java.en.*;
import com.automation.pages.LoginPage;
import com.automation.pages.home.HomePage;
import utils.DriverManager;
import utils.ConfigLoader;
import static org.junit.Assert.*;

public class LoginSteps {
    private LoginPage loginPage;
    private HomePage homePage;
    private String baseUrl = ConfigLoader.getProperty("baseUrl");

    @Given("I navigate to the login page")
    public void navigateToLogin() {
        DriverManager.getDriver().get(baseUrl + "/login.html");
        loginPage = new LoginPage(DriverManager.getDriver());
    }

    @When("I enter username {string} and password {string}")
    public void enterCredentials(String username, String password) {
        loginPage.enterCredentials(username, password);
    }

    @When("I click the login button")
    public void clickLogin() {
        loginPage.clickLogin();
    }

    @Then("I should be redirected to the inventory page")
    public void verifyInventoryPage() {
        homePage = new HomePage(DriverManager.getDriver());
        assertTrue(homePage.isInventoryDisplayed());
    }

    @Then("I should see an error message")
    public void verifyErrorMessage() {
        assertTrue(loginPage.isErrorMessageDisplayed());
    }
}