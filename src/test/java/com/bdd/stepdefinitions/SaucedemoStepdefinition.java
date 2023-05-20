package com.bdd.stepdefinitions;

import com.bdd.step.SaucedemoStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class SaucedemoStepdefinition {

    @Steps
    private SaucedemoStep saucedemoStep;

    @Given("^que me encuentro en la página de saucedemo$")
    public void queMeEncuentroEnLaPáginaDeSaucedemo() {
        saucedemoStep.cargarPaginaSaucedemo();
    }

    @When("^se ingresa las credenciales correctas \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void seIngresaLasCredencialesCorrectasYPassword(String arg0, String arg1)  {
        saucedemoStep.loginSaucedemo(arg0,arg1);

    }

    @Then("^se valida el resultado correcto \"([^\"]*)\"$")
    public void seValidaElResultadoCorrecto(String arg0) {
        saucedemoStep.validarResultado(arg0);
    }

    @When("^se ingresa las credenciales del usuario bloqueado \"([^\"]*)\" y password \"([^\"]*)\"$")
    public void seIngresaLasCredencialesDelUsuarioBloqueadoYPassword(String arg0, String arg1)  {
        saucedemoStep.loginSaucedemo(arg0,arg1);

    }

    @Then("^se valida el resultado  \"([^\"]*)\"$")
    public void seValidaElResultado(String arg0){
        saucedemoStep.validarResultadoBloqueado(arg0);
    }
}
