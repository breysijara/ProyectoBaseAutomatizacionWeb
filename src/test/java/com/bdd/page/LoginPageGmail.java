package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("http://10.20.12.162:31221/")
public class LoginPageGmail extends PageObject {
    @FindBy(id = "identifierId")
    WebElement inputEmail;

    @FindBy(css = ".VfPpkd-LgbsSe-OWXEXe-k8QpJ > .VfPpkd-RLmnJb")
    WebElement emailClick;

    @FindBy(name = "password")
    WebElement inputPasswd;


    @FindBy(id = "signIn")
    WebElement inputsignIn;

    public void ingresoCredenciales(String email,String pass) {

            inputEmail.sendKeys(email);
            emailClick.click();
            inputPasswd.sendKeys(pass);
            inputsignIn.click();
        }
}
