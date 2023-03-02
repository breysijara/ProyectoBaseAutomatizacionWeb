package com.bdd.step;

import com.bdd.page.CalculadoraPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class CalculadoraStep extends ScenarioSteps {

    private CalculadoraPage calculadoraPage;

    @Step
    public void cargarPagina() {
        calculadoraPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void tabla(String n1, String n2, String operador) {
        calculadoraPage.tabla(n1, n2,operador);
    }

    /* Pasos independientes --opcional

     @Step
    public void suma(String n1, String n2) {
        calculadoraPage.suma(n1, n2);
    }


    @Step
    public void resta(String n1, String n2) {
        calculadoraPage.resta(n1, n2);
    }

    @Step
    public void multiplicacion(String n1, String n2) {
        calculadoraPage.multiplicacion(n1, n2);
    }

    @Step
    public void divide(String n1, String n2) {
        calculadoraPage.divide(n1, n2);
    }

    @Step
    public void concatena(String n1, String n2) {
        calculadoraPage.multiplicacion(n1, n2);
    }


     */


    @Step
    public void validarResultado(String resultado){

       // String m = String.valueOf(calculadoraPage.validarMensajeResultado());

        Assert.assertEquals(resultado,calculadoraPage.validarMensajeResultado());

    }

}
