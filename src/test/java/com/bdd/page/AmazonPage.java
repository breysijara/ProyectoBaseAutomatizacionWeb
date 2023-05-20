package com.bdd.page;

import groovy.util.logging.Slf4j;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

@Slf4j
@DefaultUrl("https://www.amazon.com")
public class AmazonPage extends PageObject {

    @Autowired
   WebDriverWait wait;
   // private WebDriver driver;



    @FindBy(xpath = "//input[@id='twotabsearchtextbox']")
    private WebElementFacade txtBusqueda;

    @FindBy(xpath ="//input[@id='nav-search-submit-button']")
   // @FindBy(xpath = "//input[@type='submit'][@class='nav-input']")
    private WebElementFacade btnBusqueda;

    @FindBy(xpath = "//span[.='adidas']/parent::a//i")
    //@FindBy(xpath = "//li[@id='p_89/adidas']/span/a/div/label/i")
    private WebElementFacade checkMarca;

    @FindBy(xpath = "//span[contains(text(),'1 a 48 de más de')]")
   private WebElementFacade mensajeResultados;

    public void escribirProductoAmazon(String sProducto) throws InterruptedException {
        txtBusqueda.sendKeys(sProducto);
    }

    public void clickEnBusqueda() throws InterruptedException {
        btnBusqueda.click();
    }

    public void clickEnMarca() throws InterruptedException{
       // By  localizador = By.xpath("//span[.='adidas']/parent::a//i");
      //  WebDriverWait wait = new WebDriverWait(getDriver(),5);
      //  wait.until(ExpectedConditions.visibilityOf(checkMarca));
     //   this.wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("localizador")));
      //  Thread.sleep(6000);
        checkMarca.click();
        txtBusqueda.sendKeys("");
    }

    public String validarMensajeResultado(){
        return mensajeResultados.getText();
    }
}
