package com.bdd.stepdefinitions;

import com.bdd.step.AmazonStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class AmazonStepDefinition {

    @Steps
    private AmazonStep amazonStep;

    @Given("^Cargar la pagina de Amazon$")
    public void cargar_la_pagina_de_amazon() {
        amazonStep.cargarPaginaAmazon();
    }

    @When("^Escribir producto \"([^\"]*)\"$")
    public void escribir_producto(String sProducto) throws InterruptedException {
        amazonStep.escribirProductoAmazon(sProducto);
    }

    @And("^Hacer click en busqueda$")
    public void hacer_click_busqueda() throws InterruptedException {
     amazonStep.clickEnBusqueda();
    }

    @And("^Hacer click en marca Adidas$")
    public void hacer_click_marca() throws InterruptedException {
        amazonStep.clickEnMarca();
    }


    @Then("^Validar resultados \"([^\"]*)\"$")
    public void validarResultados(String arg0) throws Throwable {
        amazonStep.validarResultado(arg0);
    }
}
