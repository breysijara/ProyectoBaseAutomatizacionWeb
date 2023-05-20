package com.bdd.stepdefinitions;

import com.bdd.step.LoginPageSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.concurrent.TimeUnit;

public class LoginStepdefs {

    @Steps
    private LoginPageSteps loginPageSteps;



    @Given("^Que el sistema Rebates este disponible$")
    public void queElSistemaRebatesEsteDisponible() throws InterruptedException {
       loginPageSteps.openPage();
       TimeUnit.SECONDS.sleep(5);
    }

    @When("^inicio sesión con mis credenciales$")
    public void inicioSesiónConMisCredenciales() throws InterruptedException {
        String email ="HP70042838";
        String pass="123456";
        loginPageSteps.IngresarCredenciales(email,pass);
        TimeUnit.SECONDS.sleep(5);
    }


    @Then("^Se valida el inicio de sesion$")
    public void seValidaElInicioDeSesion() {
    }





}
