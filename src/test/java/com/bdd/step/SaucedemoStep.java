package com.bdd.step;

import com.bdd.page.SaucedemoPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.junit.Assert;


public class SaucedemoStep extends ScenarioSteps {

    private SaucedemoPage saucedemoPage;

    @Step
    public void cargarPaginaSaucedemo() {
        saucedemoPage.open();
        getDriver().manage().window().maximize();
    }

    @Step
    public void loginSaucedemo(String UserName,String Password){
        saucedemoPage.Login(UserName,Password);

    }

    @Step
    public void validarResultado(String resultado){
        Assert.assertEquals(saucedemoPage.validarMensajeResultado(),resultado);
    }

    @Step
    public void validarResultadoBloqueado(String resultado){
        Assert.assertEquals(saucedemoPage.validarMensajeResultadoBloqueado(),resultado);
    }
}
