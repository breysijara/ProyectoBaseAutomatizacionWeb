package com.bdd.stepdefinitions;

import com.bdd.step.basicHTMLSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.thucydides.core.annotations.Steps;

import java.util.concurrent.TimeUnit;

public class basicHTMLstepdefinitions {
    @Steps
    private basicHTMLSteps basicHTML;

    @Given("que me encuentro en la pagina Basic HTML")
    public void queMeEncuentroEnLaPaginaBasicHTML() throws InterruptedException {
        basicHTML.openPage("https://testpages.herokuapp.com/styled/basic-html-form-test.html");
        TimeUnit.SECONDS.sleep(5);
    }

    @When("ingreso mis datos")
    public void ingresoMisDatos() {
        basicHTML.ingresarName("Breysi");
        basicHTML.ingresarPassword("breysi123");
        basicHTML.ingresarComments("Hola mundo");
       // basicHTML.cargaImg();
        basicHTML.seleccionMultipleChecBox();

    }

    @Then("valido el registro")
    public void validoElRegistro() {
    }
}
