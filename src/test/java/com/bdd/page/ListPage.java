package com.bdd.page;

import groovy.util.logging.Slf4j;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;

@Slf4j
@DefaultUrl("https://andreidbr.github.io/JS30/06AjaxTypeAhead/index.html")
public class ListPage extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraPage.class);

    @FindBy(xpath = "//body/form[1]")
    private WebElement searchField;

     @FindBy(className = "name")
    private List<WebElement> List;

    // public static final String Titulo_Resultado ="f";

    public void enterSearchCriteria() throws InterruptedException {
        Thread.sleep(600);

        WebElement search = searchField.findElement(By.xpath("//input[1]"));
        search.sendKeys("Washington");

    }

    //LISTA DE STRING - LISTAS
    public List<String> getAllResults(){
       // List<WebElement> list = bringMeAllElements(searchField);
       // List<WebElement> list = searchField.findElements(By.xpath("//input[1]"));
        List<String> stringsFormList = new ArrayList<String>();
        for (WebElement e: List){
            stringsFormList.add(e.getText());
            log.println("ESPERANDO xy: " + stringsFormList);
        }
        return stringsFormList;
    }

  /*
    public List<String> obtenerresultado(){
        return findAll(Titulo_Resultado)
                .stream()
                .map(element -> element.getAttribute("textContext"))
                .collect(Collectors.toList());
    }

   */
}












