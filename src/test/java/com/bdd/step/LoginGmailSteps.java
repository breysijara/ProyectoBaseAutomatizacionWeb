package com.bdd.step;

import com.bdd.page.LoginPageGmail;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class LoginGmailSteps extends ScenarioSteps {
    private LoginPageGmail loginPageGmail;

    @Step
    public void openPage() throws InterruptedException {
        loginPageGmail.open();
        getDriver().manage().window().maximize();

    }
    @Step
    public void IngresarCredenciales(String email, String pass){
        loginPageGmail.ingresoCredenciales(email,pass);

    }
}
