package com.bdd.step;

import com.bdd.page.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class LoginPageSteps extends ScenarioSteps {


    private LoginPage loginPage;

    @Step
    public void openPage() throws InterruptedException {
        loginPage.open();
        getDriver().manage().window().maximize();

    }

    @Step
    public void IngresarCredenciales(String sUser, String sPass) {
        loginPage.IngresarCredenciales(sUser,sPass);


    }



}
