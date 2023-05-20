package com.bdd.stepdefinitions;

import com.bdd.step.CalculadoraStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;


public class CalcStepdefs {
    @Steps
    private CalculadoraStep calculadoraStep;

   
    @Given("que me encuentro en la página de testsheepn")
    public void queMeEncuentroEnLaPáginaDeTestsheepn() {
        calculadoraStep.cargarPagina();
    }




    @When("^se ingresa el primer valor First number \"([^\"]*)\" y Second number \"([^\"]*)\" y \"([^\"]*)\"$")
    public void seIngresaElPrimerValorFirstNumberYSecondNumberY(String arg0, String arg1, String arg2) throws Throwable {
        calculadoraStep.tabla(arg0, arg1,arg2);
    }



    @Then("^se valida el resultado \"([^\"]*)\"$")
    public void seValidaElResultado(String arg0) {
        calculadoraStep.validarResultado(arg0);
    }


}
