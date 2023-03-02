package com.bdd.stepdefinitions;

import com.bdd.step.BlazeSteps;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import java.util.concurrent.TimeUnit;

public class BlazeStepdefs {

    BlazeSteps mySteps = new BlazeSteps();

    @Given("que me encuentro en la pagina Blaze")
    public void queMeEncuentroEnLaPaginaBlaze()  throws InterruptedException {
        mySteps.openPage("https://www.demoblaze.com/");
        TimeUnit.SECONDS.sleep(5);
    }


    @When("^añado el producto al carrito \"([^\"]*)\"$")
    public void añadoElProductoAlCarrito(String product) throws Throwable {
        mySteps.selectProducts(product);
        mySteps.addCart();

    }


    @And("realizo la compra del producto")
    public void realizoLaCompraDelProducto() throws InterruptedException{
        mySteps.irACart();
        mySteps.purchase();
    }

    @Then("verifico la compra exitosa")
    public void verificoLaCompraExitosa() throws InterruptedException{
        mySteps.success();
        TimeUnit.SECONDS.sleep(5);
        mySteps.quit();
    }



}
