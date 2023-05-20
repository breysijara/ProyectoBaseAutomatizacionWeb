package com.bdd.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://www.ebay.com")
public class EbayPage extends PageObject {

    @FindBy(xpath = "//input[@id='gh-ac']")
    private WebElementFacade txtBusqueda;

    public void escribirProductoEbay(String sProducto) throws InterruptedException {
        txtBusqueda.sendKeys(sProducto);
    }

    /*

    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")   //definiendo el xpath
    private WebElementFacade txtBusqueda;                   //asignando a la variable txtBusqueda el valor del xpath

    @FindBy(xpath = "//input[@type='submit'][@class='nav-input']")   //definiendo el xpath
    private WebElementFacade btnBusqueda;                            //asignando a la variable btnBusqueda el valor del xpath

    @FindBy(xpath = "//span[.='adidas']/parent::a//i")   //definiendo el xpath
    private WebElementFacade checkMarca;

    @FindBy(xpath = "//div[@class='a-section a-spacing-small a-spacing-top-small']//span[contains(text(),'resultados para')]")
    private WebElementFacade mensajeResultados;



    public void clickEnBusqueda() throws InterruptedException {
        btnBusqueda.click();
    }

    public void clickEnMarca() throws InterruptedException{
        checkMarca.click();
    }

    public String validarMensajeResultado(){
        return mensajeResultados.getText();
    }


     */
}
