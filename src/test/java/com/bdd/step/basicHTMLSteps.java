package com.bdd.step;

import com.bdd.page.basicHTMLPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.steps.ScenarioSteps;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.util.List;

public class basicHTMLSteps extends ScenarioSteps {

    WebDriver driver;

    private basicHTMLPage basicHTML(){
        return new basicHTMLPage(driver);
    }

    @Step
    public void openPage(String url){
        System.setProperty("webdriver.chrome.driver","drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);
    }

    @Step
    public void ingresarName(String sName) {
        basicHTML().name().clear();
        basicHTML().name().sendKeys(sName);
    }

    @Step
    public void ingresarPassword(String sPassword) {
        basicHTML().password().clear();
        basicHTML().password().sendKeys(sPassword);
    }

    @Step
    public void ingresarComments(String sComments) {
        basicHTML().comments().clear();
        basicHTML().comments().sendKeys(sComments);
        }

    @Step
    public void cargaImg() {
        File file = new File("src/main/java/img/img.png");
        String path = file.getAbsolutePath();
        basicHTML().filename().sendKeys(path);
    }

    @Step
    public void seleccionMultipleChecBox() {
        Select select = new Select(basicHTML().checkbox());
        select.deselectByVisibleText("cb3");
        select.selectByValue("cb1");
       /* List<WebElement> allCheckbox = select.getAllSelectedOptions();

        for (WebElement cb : allCheckbox) {
            if (cb.isSelected()) {
                cb.click();
            }
        }
    }

        */
    }

   /* public void seleccionMultiple() {
        Select multi = new Select (multipleselect);
        multi.deselectByVisibleText("Selection Item 4"); //deseleciona
        multi.selectByVisibleText("Selection Item 1");
        multi.selectByIndex(1);
        multi.selectByValue("ms3");

    }

    */
}
