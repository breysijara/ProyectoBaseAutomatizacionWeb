package com.bdd.step;

import com.bdd.page.EbayPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;

public class EbayStep extends ScenarioSteps {

    private EbayPage ebayPage;

    @Step
    public void cargarPaginaEbay() {
        ebayPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void escribirProductoEbay(String sProducto) throws InterruptedException {
        ebayPage.escribirProductoEbay(sProducto);
    }

  /*
    @Step
    public void clickEnBusqueda() throws InterruptedException {
        amazonPage.clickEnBusqueda();
    }

    @Step
    public void clickEnMarca() throws InterruptedException {
        amazonPage.clickEnMarca();
    }

    @Step
    public void validarResultado() throws InterruptedException {
        Assert.assertEquals("1 a 48 de más de 4,000 resultados para", amazonPage.validarMensajeResultado());
    }

     */

}
