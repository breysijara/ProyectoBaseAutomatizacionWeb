package com.bdd.step;

import com.bdd.page.AmazonPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;

public class AmazonStep extends ScenarioSteps {

    private AmazonPage amazonPage;

    @Step
    public void cargarPaginaAmazon() {
        amazonPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void escribirProductoAmazon(String sProducto) throws InterruptedException {
        amazonPage.escribirProductoAmazon(sProducto);
    }

    @Step
    public void clickEnBusqueda() throws InterruptedException {
        amazonPage.clickEnBusqueda();
    }

    @Step
    public void clickEnMarca() throws InterruptedException {
        amazonPage.clickEnMarca();
    }

    @Step
    public void validarResultado(String texto) throws InterruptedException {
        Assert.assertEquals(texto, amazonPage.validarMensajeResultado());
    }

}
