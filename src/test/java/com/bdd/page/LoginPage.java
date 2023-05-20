package com.bdd.page;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.concurrent.TimeUnit;

@DefaultUrl("http://10.20.12.162:31221/")
public class LoginPage extends PageObject {

    @Autowired
    WebDriverWait wait;

    @FindBy(name = "user")
    WebElement txtuser;

    @FindBy(name = "password")
    WebElement txtpassword;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement btnSubmit;




    public void IngresarCredenciales(String sUser, String sPass) {
           if (txtuser.isEnabled() && txtpassword.isEnabled()) {
            txtuser.clear();
            txtpassword.clear();
            txtuser.sendKeys(sUser);
            txtpassword.sendKeys(sPass);
               btnSubmit.click();
        }

    }

}
