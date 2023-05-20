package com.bdd.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class LoginGmailStepdefs {
    private WebDriver driver;

    @Given("^estoy en la pagina de Gmail$")
    public void estoyEnLaPaginaDeGmail() {
        // Configurar el sistema de Selenium WebDriver
        System.setProperty("webdriver.chrome.driver", "C://Users/Usuario/Documents/Rebates/ProyectoBaseAutomatizacionWeb/drivers/chromedriver.exe");

        // Inicializar el driver del navegador
        driver = new ChromeDriver();

        // Navegar a la página de login de Gmail
        driver.get("https://www.gmail.com");
    }

    @When("^ingreso mi email y password$")
    public void ingresoMiEmailYPassword() {
        WebElement emailInput = driver.findElement(By.id("identifierId"));
        emailInput.sendKeys("rebateprueba@gmail.com");

        WebElement nextButton = driver.findElement(By.id("identifierNext"));
        nextButton.click();

        WebDriverWait wait = new WebDriverWait(driver, 50);
        WebElement passwordInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='Passwd']")));
        passwordInput.sendKeys("rebate123");

        WebElement passwordNextButton = driver.findElement(By.id("passwordNext"));
        passwordNextButton.click();


        WebElement q = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("q")));
        q.sendKeys("AC00024");
    }


    @Then("I should be logged in to Gmail")
    public void verifyLoggedIn() {
        // Verificar que se haya iniciado sesión correctamente
        WebElement composeButton = driver.findElement(By.xpath("//div[text()='Compose']"));
        assert composeButton.isDisplayed();

        // Cerrar el navegador
        driver.quit();
    }


    @And("^I click on the login button$")
    public void iClickOnTheLoginButton() {
    }



}
