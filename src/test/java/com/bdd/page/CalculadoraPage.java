package com.bdd.page;

import groovy.util.logging.Slf4j;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static jdk.nashorn.internal.runtime.regexp.joni.Config.log;


@Slf4j
@DefaultUrl("https://testsheepnz.github.io/BasicCalculator.html")
public class CalculadoraPage extends PageObject {
    private static final Logger LOGGER = LoggerFactory.getLogger(CalculadoraPage.class);

    @FindBy(id = "number1Field")
    private WebElement txtfirstName;

    @FindBy(id = "number2Field")
    private WebElement txtSecond;

    @FindBy(name = "selectOperation")
    private WebElement selectCombo;

    @FindBy(id = "calculateButton")
    private WebElement btncalculate;

    @FindBy(id = "numberAnswerField")
    private WebElement numberAnswerField;

    @FindBy(id = "clearButton")
    private WebElement clearButton;


    public void tabla(String FirstNumber, String SecondNumber, String operador) {
        LOGGER.info("suma ");
        if (operador.equals("suma")){
            txtfirstName.clear();
            txtSecond.clear();
            txtfirstName.sendKeys(FirstNumber);
            txtSecond.sendKeys(SecondNumber);

            Select se = new Select(selectCombo);
            se.selectByIndex(0);
            btncalculate.click();
        }
        if (operador.equals("resta")) {
            txtfirstName.clear();
            txtSecond.clear();
            txtfirstName.sendKeys(FirstNumber);
            txtSecond.sendKeys(SecondNumber);

            Select se = new Select(selectCombo);
            se.selectByIndex(1);
            btncalculate.click();
        }
        if (operador.equals("multiplicacion")) {
            txtfirstName.clear();
            txtSecond.clear();
            txtfirstName.sendKeys(FirstNumber);
            txtSecond.sendKeys(SecondNumber);

            Select se = new Select(selectCombo);
            se.selectByIndex(2);
            btncalculate.click();
        }

        if (operador.equals("divide")) {
            txtfirstName.clear();
            txtSecond.clear();
            txtfirstName.sendKeys(FirstNumber);
            txtSecond.sendKeys(SecondNumber);

            Select se = new Select(selectCombo);
            se.selectByIndex(3);
            btncalculate.click();
        }

        if (operador.equals("concatena")) {
            txtfirstName.clear();
            txtSecond.clear();
            txtfirstName.sendKeys(FirstNumber);
            txtSecond.sendKeys(SecondNumber);

            Select se = new Select(selectCombo);
            se.selectByIndex(4);
            btncalculate.click();
        }

    }

/* METODOS INDIVIDUALES
    public void suma(String FirstNumber, String SecondNumber) {
        LOGGER.info("suma ");
        txtfirstName.clear();
        txtSecond.clear();
        txtfirstName.sendKeys(FirstNumber);
        txtSecond.sendKeys(SecondNumber);

        Select se = new Select(selectCombo);
        se.selectByIndex(0);
        btncalculate.click();


    }


    public void resta(String FirstNumber, String SecondNumber) {
        txtfirstName.clear();
        txtSecond.clear();
        txtfirstName.sendKeys(FirstNumber);
        txtSecond.sendKeys(SecondNumber);

        Select se = new Select(selectCombo);
        se.selectByIndex(1);
        btncalculate.click();

    }

    public void multiplicacion(String FirstNumber, String SecondNumber) {
        txtfirstName.clear();
        txtSecond.clear();
        txtfirstName.sendKeys(FirstNumber);
        txtSecond.sendKeys(SecondNumber);

        Select se = new Select(selectCombo);
        se.selectByIndex(2);
        btncalculate.click();
    }


    public void divide(String FirstNumber, String SecondNumber) {
        txtfirstName.clear();
        txtSecond.clear();
        txtfirstName.sendKeys(FirstNumber);
        txtSecond.sendKeys(SecondNumber);

        Select se = new Select(selectCombo);
        se.selectByIndex(3);
        btncalculate.click();
    }

    public void concatena(String FirstNumber, String SecondNumber) {
        txtfirstName.clear();
        txtSecond.clear();
        txtfirstName.sendKeys(FirstNumber);
        txtSecond.sendKeys(SecondNumber);

        Select se = new Select(selectCombo);
        se.selectByIndex(4);
        btncalculate.click();
    }


    public void clear() {
        clearButton.click();
    }


 */
    public String validarMensajeResultado() {

        /*
        ejemplo: String textoToSearch = "Text inside Webelement";
        driver.findElement(By.id("someID).getText().contains("textToSearch");
         */

        log.println("ESPERANDO 2: " + numberAnswerField.getAttribute("value"));
        return numberAnswerField.getAttribute("value");
    }


}
