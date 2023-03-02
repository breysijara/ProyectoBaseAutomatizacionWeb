package com.bdd.stepdefinitions;

import com.bdd.step.EbayStep;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EbayStepDefinition {

    @Steps
    private EbayStep ebayStep;

    @Given("^Cargar la pagina de Ebay$")
    public void cargar_la_pagina_de_ebay() {
        ebayStep.cargarPaginaEbay();
    }


    @When("^Escribir producto \"([^\"]*)\" en Ebay$")
    public void escribir_producto(String sProducto) throws InterruptedException {
        ebayStep.escribirProductoEbay(sProducto);
    }

    }
