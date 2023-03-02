package com.bdd.stepdefinitions;

import com.bdd.step.ListSteps;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

public class ListStepdefenition {

    @Steps
    private ListSteps listSteps;


    @Given("^I have navigate to the list page$")
    public void iHaveNavigateToTheListPage() {
        listSteps.cargarPagina();
    }

    @When("^I search the list$")
    public void iSearchTheList() throws InterruptedException {
        listSteps.search();
    }

    @Then("^I can find the text in the list$")
    public void iCanFindTheTextInTheList() {

       List<String> lista = listSteps.valitedResulList();

        boolean textIsThere = lista.contains("Spokane, Washington");
        log.println("ESPERANDO LISTA X: " + textIsThere);
        if (textIsThere) {
            System.out.println("The Test Passed");
        } else {
            throw new Error("The Test Failed");
        }


    }

}










