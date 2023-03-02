package com.bdd.page;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@DefaultUrl("https://www.saucedemo.com/")
public class SaucedemoPage extends PageObject {

    @FindBy(id = "user-name")
    private WebElementFacade txtUserName;

    @FindBy(id = "password")
    private WebElementFacade txtPassword;

    @FindBy(id = "login-button")
    private WebElementFacade btnLogin;

    @FindBy(xpath = "//span[contains(text(),'Products')]")
    private WebElementFacade labelTexto;

    @FindBy(xpath = "//h3[contains(text(),'locked')]")
    private WebElementFacade labelTextoBloqueado;

    public SaucedemoPage(WebDriver driver) {
        super(driver);
    }


    public void Login(String UserName,String Password){
        txtUserName.sendKeys(UserName);
        txtPassword.sendKeys(Password);
        btnLogin.click();

    }

    public String validarMensajeResultado() {
        log.println("ESPERANDO 1: " + labelTexto.getText());
        return labelTexto.getText();
    }

    public String validarMensajeResultadoBloqueado() {
        log.println("ESPERANDO 2: " + labelTextoBloqueado.getText());
        return labelTextoBloqueado.getText();
    }


}